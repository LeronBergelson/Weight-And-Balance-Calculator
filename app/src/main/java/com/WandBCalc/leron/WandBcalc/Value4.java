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


public class Value4 extends FragmentActivity {

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
        setContentView(R.layout.value4);
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
        final double FormulaFSW1 = savedstate2.getFormulaFSW1();
        final double FormulaFSW2 = savedstate2.getFormulaFSW2();
        final double FormulaRSW1 = savedstate2.getFormulaRSW1();
        final double FormulaRSW2 = savedstate2.getFormulaRSW2();
        final double FormulaBaggage1 = savedstate2.getFormulaBaggage1();
        final double FormulaBaggage2 = savedstate2. getFormulaBaggage2();
        final double FormulaBaggage3 = savedstate2.getFormulaBaggage3();
        final double FormulaBaggage4 = savedstate2. getFormulaBaggage4();
        final double FormulaFL1 = savedstate2.getFormulaFL1();
        final double FormulaFL2 = savedstate2.getFormulaFL2();
        final double FormulaFL3 = savedstate2.getFormulaFL3();
        final double FormulaFL4 = savedstate2.getFormulaFL4();
        final double FormulaSTTOC1 = savedstate2.getFormulaSTTOC1();
        final double FormulaSTTOC2 = savedstate2.getFormulaSTTOC2();
        final double FormulaSFTD1 = savedstate2.getFormulaSFTD1();
        final double FormulaSFTD2 = savedstate2.getFormulaSFTD2();
        final double FormulaSFTD3 = savedstate2.getFormulaSFTD3();
        final double FormulaCOFG1 = savedstate2.getFormulaCOFG1();
        final double FormulaCOFG2 = savedstate2.getFormulaCOFG2();
        final double FormulaCOFG3 = savedstate2.getFormulaCOFG3();


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
                    double FSWtotalM = (fswinfo * FormulaFSW1) / FormulaFSW2;
                    double RSWtotalM = (rswinfo * FormulaRSW1) / FormulaRSW2;
                    double FrontBaggagetotalM = (Fbaggageinfo * FormulaBaggage1) / FormulaBaggage2;
                    double RearBaggagetotalM = (Rbaggageinfo * FormulaBaggage3) /FormulaBaggage4;
                    double subtotalW = fswinfo + rswinfo + Fbaggageinfo + Rbaggageinfo + PlaneWeight;
                    double subtotalM = FSWtotalM + RSWtotalM + FrontBaggagetotalM + RearBaggagetotalM + PlaneMoment;
                    double FLtotalM = ((flinfo * FormulaFL2) * FormulaFL3) / FormulaFL4;
                    double FLtotalW = (flinfo * FormulaFL1);
                    double subtotalRCM = subtotalM + FLtotalM;
                    double subtotalRCW = subtotalW + FLtotalW;
                    double subtotalTCM = subtotalRCM - FormulaSTTOC2;
                    double subtotalTCW = subtotalRCW - FormulaSTTOC1;
                    double SFTDW = (hrsinfo * FBinfo * FormulaSFTD1);
                    double SFTDM = (SFTDW * FormulaSFTD2) / FormulaSFTD3;
                    double LCW = subtotalTCW - SFTDW;
                    double LCM = subtotalTCM - SFTDM;
                    double CofG1 = (subtotalM * FormulaCOFG1) / subtotalW;
                    double CofG2 = (subtotalTCM * FormulaCOFG2) / subtotalTCW;
                    double CofG3 = (LCM * FormulaCOFG3) / LCW;

                    double[] results = {fswinfo, rswinfo, Fbaggageinfo, subtotalW, FSWtotalM, RSWtotalM, FrontBaggagetotalM, subtotalM,
                            FLtotalM, FLtotalW, subtotalRCM, subtotalRCW, subtotalTCM,
                            subtotalTCW, SFTDW, SFTDM, LCW, LCM, PlaneWeight, PlaneMoment, CofG1, CofG2, CofG3, Rbaggageinfo, RearBaggagetotalM,
                            FormulaSTTOC1,FormulaSTTOC2};

                    Intent switchViewInt = new Intent(Value4.this, CustomDisplay2.class);
                    switchViewInt.putExtra(EXTRA_MSG, results);
                    switchViewInt.putExtra(EXTRA_MSG2, planeselection);
                    startActivityForResult(switchViewInt, 4);
            }catch(NumberFormatException FieldValidation){
                String usertext = "Please Enter A Value For All The Fields Provided";
                Toast.makeText(Value4.this, usertext, Toast.LENGTH_LONG).show();
            }

            }});}



};

