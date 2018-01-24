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


public class Value2 extends FragmentActivity {

    EditText FSW;
    EditText RSW;
    EditText FBaggage;
    EditText RBaggage;
    EditText FL;
    EditText hrs;
    EditText FB;


    public final static String EXTRA_MSG = "com.example.leron.flightcalc.Transfer";
    public final static String EXTRA_MSG2 = "com.example.leron.flightcalc.Transfer2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.value2);
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
        FBaggage = (EditText) findViewById(R.id.Baggage_num);
        RBaggage = (EditText) findViewById(R.id.RBaggage_num);
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
                    double Fbaggageinfo = Double.parseDouble(FBaggage.getText().toString());
                    double Rbaggageinfo = Double.parseDouble(RBaggage.getText().toString());
                    double FBinfo = Double.parseDouble(FB.getText().toString());
                    double flinfo = Double.parseDouble(FL.getText().toString());
                    double hrsinfo = Double.parseDouble(hrs.getText().toString());
                    double FSWtotalM = (fswinfo * 37) / 1000;
                    double RSWtotalM = (rswinfo * 73) / 1000;
                    double FrontBaggagetotalM = (Fbaggageinfo * 95) / 1000;
                    double RearBaggagetotalM = (Rbaggageinfo * 123) /1000;
                    double subtotalW = fswinfo + rswinfo + Fbaggageinfo + Rbaggageinfo + PlaneWeight;
                    double subtotalM = FSWtotalM + RSWtotalM + FrontBaggagetotalM + RearBaggagetotalM + PlaneMoment;
                    double FLtotalM = ((flinfo * 6) * 48) / 1000;
                    double FLtotalW = (flinfo * 6);
                    double subtotalRCM = subtotalM + FLtotalM;
                    double subtotalRCW = subtotalW + FLtotalW;
                    double subtotalTCM = subtotalRCM - 0.403;
                    double subtotalTCW = subtotalRCW - 8.4;
                    double SFTDW = (hrsinfo * FBinfo * 6);
                    double SFTDM = (SFTDW * 48) / 1000;
                    double LCW = subtotalTCW - SFTDW;
                    double LCM = subtotalTCM - SFTDM;
                    double CofG1 = (subtotalM * 1000) / subtotalW;
                    double CofG2 = (subtotalTCM * 1000) / subtotalTCW;
                    double CofG3 = (LCM * 1000) / LCW;

                    double[] results = {fswinfo, rswinfo, Fbaggageinfo, subtotalW, FSWtotalM, RSWtotalM, FrontBaggagetotalM, subtotalM,
                            FLtotalM, FLtotalW, subtotalRCM, subtotalRCW, subtotalTCM,
                            subtotalTCW, SFTDW, SFTDM, LCW, LCM, PlaneWeight, PlaneMoment, CofG1, CofG2, CofG3, Rbaggageinfo, RearBaggagetotalM,
                           };
                    Intent switchViewInt = new Intent(Value2.this, Display2.class);
                    switchViewInt.putExtra(EXTRA_MSG, results);
                    switchViewInt.putExtra(EXTRA_MSG2, planeselection);
                    startActivityForResult(switchViewInt, 4);


                }catch(NumberFormatException FieldValidation){
                    String usertext = "Please Enter A Value For All The Fields Provided";
                    Toast.makeText(Value2.this, usertext, Toast.LENGTH_LONG).show();
                }

            }});}



};

