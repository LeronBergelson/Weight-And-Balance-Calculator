package com.WandBCalc.leron.WandBcalc;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.leron.bandwcalc.R;


public class Value3 extends FragmentActivity {

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
            setContentView(R.layout.value3);
            Intent resultsInt = getIntent();
            final double[] resultsArry = resultsInt.getDoubleArrayExtra(WandM.WandMMessage1);
            String planestring = resultsInt.getStringExtra(WandM.WandMMessage2);


            String Planeselected = planestring;
            TextView PSFINAL = (TextView) findViewById(R.id.planeselected);
            CharSequence charValPS = "" + Planeselected;
            PSFINAL.setText(charValPS);
            PSFINAL.setTextColor(Color.RED);

            // Initialize text views
            FSW = (EditText) findViewById(R.id.FSW_num);
            RSW = (EditText) findViewById(R.id.RSW_num);
            Baggage = (EditText) findViewById(R.id.Baggage_num);
            FL = (EditText) findViewById(R.id.FL_num);
            FB = (EditText) findViewById(R.id.FB_num);
            hrs = (EditText) findViewById(R.id.hrs_num);
            final double PlaneWeight = resultsArry[0];
            final double PlaneMoment = resultsArry[1];
            final String planeselection = planestring;
            final double FormulaFSW1 = savedstate.getFormulaFSW1();
            final double FormulaFSW2 = savedstate.getFormulaFSW2();
            final double FormulaRSW1 = savedstate.getFormulaRSW1();
            final double FormulaRSW2 = savedstate.getFormulaRSW2();
            final double FormulaBaggage1 = savedstate.getFormulaBaggage1();
            final double FormulaBaggage2 = savedstate. getFormulaBaggage2();
            final double FormulaFL1 = savedstate.getFormulaFL1();
            final double FormulaFL2 = savedstate.getFormulaFL2();
            final double FormulaFL3 = savedstate.getFormulaFL3();
            final double FormulaFL4 = savedstate.getFormulaFL4();
            final double FormulaSTTOC1 = savedstate.getFormulaSTTOC1();
            final double FormulaSTTOC2 = savedstate.getFormulaSTTOC2();
            final double FormulaSFTD1 = savedstate.getFormulaSFTD1();
            final double FormulaSFTD2 = savedstate.getFormulaSFTD2();
            final double FormulaSFTD3 = savedstate.getFormulaSFTD3();
            final double FormulaCOFG1 = savedstate.getFormulaCOFG1();
            final double FormulaCOFG2 = savedstate.getFormulaCOFG2();
            final double FormulaCOFG3 = savedstate.getFormulaCOFG3();


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
                        double FSWtotalM = (fswinfo * FormulaFSW1) / FormulaFSW2;//done
                        double RSWtotalM = (rswinfo * FormulaRSW1) / FormulaRSW2;//done
                        double BaggagetotalM = (baggageinfo * FormulaBaggage1) / FormulaBaggage2;//done
                        double subtotalW = fswinfo + rswinfo + baggageinfo + PlaneWeight;
                        double subtotalM = FSWtotalM + RSWtotalM + BaggagetotalM + PlaneMoment;
                        double FLtotalM = ((flinfo * FormulaFL2) * FormulaFL3) / FormulaFL4;//done
                        double FLtotalW = (flinfo * FormulaFL1);//done
                        double subtotalRCM = subtotalM + FLtotalM;
                        double subtotalRCW = subtotalW + FLtotalW;
                        double subtotalTCM = subtotalRCM - FormulaSTTOC2;//done
                        double subtotalTCW = subtotalRCW - FormulaSTTOC1;//done
                        double SFTDW = (hrsinfo * FBinfo * FormulaSFTD1);//done
                        double SFTDM = (SFTDW * FormulaSFTD2) / FormulaSFTD3;//done
                        double LCW = subtotalTCW - SFTDW;
                        double LCM = subtotalTCM - SFTDM;
                        double CofG1 = (subtotalM * FormulaCOFG1) / subtotalW;//done
                        double CofG2 = (subtotalTCM * FormulaCOFG2) / subtotalTCW;//done
                        double CofG3 = (LCM * FormulaCOFG3) / LCW;//done

                        double[] results = {fswinfo, rswinfo, baggageinfo, subtotalW, FSWtotalM, RSWtotalM, BaggagetotalM, subtotalM,
                                FLtotalM, FLtotalW, subtotalRCM, subtotalRCW, subtotalTCM,
                                subtotalTCW, SFTDW, SFTDM, LCW, LCM, PlaneWeight, PlaneMoment, CofG1, CofG2, CofG3,FormulaSTTOC1,FormulaSTTOC2};
                        Intent switchViewInt = new Intent(Value3.this, Display.class);
                        switchViewInt.putExtra(EXTRA_MSG, results);
                        switchViewInt.putExtra(EXTRA_MSG2, planeselection);
                        startActivityForResult(switchViewInt, 1);
                    }catch(NumberFormatException FieldValidation){
                        String usertext = "Please Enter A Value For All The Fields Provided";
                        Toast.makeText(Value3.this, usertext, Toast.LENGTH_LONG).show();
                    }




                }})
            ;
        }




};

