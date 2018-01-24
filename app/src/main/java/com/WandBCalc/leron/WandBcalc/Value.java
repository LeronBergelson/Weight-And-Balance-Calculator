package com.WandBCalc.leron.WandBcalc;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.leron.bandwcalc.R;


public class Value extends FragmentActivity {

        EditText FSW;
        EditText RSW;
        EditText Baggage;
        EditText FL;
        EditText hrs;
        EditText FB;


        public final static String EXTRA_MSG = "com.example.leron.flightcalc.Transfer";
        public final static String EXTRA_MSG2 = "com.example.leron.flightcalc.Transfer2";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.valuescreen);
            Intent resultsInt = getIntent();
            final double[] resultsArry = resultsInt.getDoubleArrayExtra(WandM.WandMMessage1);
            String planestring = resultsInt.getStringExtra(WandM.WandMMessage2);


            String Planeselected = planestring;
            TextView PSFINAL = (TextView) findViewById(R.id.planeselected);
            CharSequence charValPS = "" + Planeselected;
            PSFINAL.setText(charValPS);
            PSFINAL.setTextColor(Color.RED);

            // Initialize text views
            FSW = (EditText) findViewById(R.id.PW_num);
            RSW = (EditText) findViewById(R.id.PM_num);
            Baggage = (EditText) findViewById(R.id.Baggage_num);
            FL = (EditText) findViewById(R.id.FL_num);
            FB = (EditText) findViewById(R.id.FB_num);
            hrs = (EditText) findViewById(R.id.hrs_num);
            final double PlaneWeight = resultsArry[0];
            final double PlaneMoment = resultsArry[1];
            final String planeselection = planestring;



            Button calcbutton = (Button)findViewById(R.id.flightbutton);
            calcbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    try {
                        double fswinfo = Double.parseDouble(FSW.getText().toString());
                        double rswinfo = Double.parseDouble(RSW.getText().toString());
                        double baggageinfo = Double.parseDouble(Baggage.getText().toString());
                        double FBinfo = Double.parseDouble(FB.getText().toString());
                        double flinfo = Double.parseDouble(FL.getText().toString());
                        double hrsinfo = Double.parseDouble(hrs.getText().toString());
                        double FSWtotalM = (fswinfo * 87) / 100;//done
                        double RSWtotalM = (rswinfo * 124) / 100;//done
                        double BaggagetotalM = (baggageinfo * 150) / 100;//done
                        double subtotalW = fswinfo + rswinfo + baggageinfo + PlaneWeight;
                        double subtotalM = FSWtotalM + RSWtotalM + BaggagetotalM + PlaneMoment;
                        double FLtotalM = ((flinfo * 6) * 75) / 100;//done
                        double FLtotalW = (flinfo * 6);//done
                        double subtotalRCM = subtotalM + FLtotalM;
                        double subtotalRCW = subtotalW + FLtotalW;
                        double subtotalTCM = subtotalRCM - 9;//done
                        double subtotalTCW = subtotalRCW - 12;//done
                        double SFTDW = (hrsinfo * FBinfo * 6);//done
                        double SFTDM = (SFTDW * 75) / 100;//done
                        double LCW = subtotalTCW - SFTDW;
                        double LCM = subtotalTCM - SFTDM;
                        double CofG1 = (subtotalM * 100) / subtotalW;//done
                        double CofG2 = (subtotalTCM * 100) / subtotalTCW;//done
                        double CofG3 = (LCM * 100) / LCW;//done

                        double[] results = {fswinfo, rswinfo, baggageinfo, subtotalW, FSWtotalM, RSWtotalM, BaggagetotalM, subtotalM,
                                FLtotalM, FLtotalW, subtotalRCM, subtotalRCW, subtotalTCM,
                                subtotalTCW, SFTDW, SFTDM, LCW, LCM, PlaneWeight, PlaneMoment, CofG1, CofG2, CofG3
                        };
                        Intent switchViewInt = new Intent(Value.this, Display.class);
                        switchViewInt.putExtra(EXTRA_MSG, results);
                        switchViewInt.putExtra(EXTRA_MSG2, planeselection);
                        startActivityForResult(switchViewInt, 1);


                    }catch(NumberFormatException FieldValidation){
                        String usertext = "Please Enter A Value For All The Fields Provided";
                        Toast.makeText(Value.this, usertext, Toast.LENGTH_LONG).show();
                    }
                }})
            ;
        }




};

