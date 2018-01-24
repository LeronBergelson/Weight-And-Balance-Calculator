package com.WandBCalc.leron.WandBcalc;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.leron.bandwcalc.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class Display2 extends FragmentActivity {
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AdRequest adRequest = new AdRequest.Builder().build();

// Prepare the Interstitial Ad
        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId("ca-app-pub-7932406359473798/9104240860");
        interstitial.loadAd(adRequest);
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                displayInterstitial();
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.display2);
        Intent resultsInt = getIntent();
        double[] resultsArry = resultsInt.getDoubleArrayExtra(Value2.EXTRA_MSG);
        String planestring = resultsInt.getStringExtra(Value2.EXTRA_MSG2);

        String PlaneSelectionFinal = planestring;
        TextView PSFINAL = (TextView) findViewById(R.id.planeselection);
        CharSequence charValPS = "" + PlaneSelectionFinal;
        PSFINAL.setText(charValPS);
        PSFINAL.setTextColor(Color.RED);

        double PlaneWeight = resultsArry[18];
        TextView PWFINAL = (TextView) findViewById(R.id.EmptyW_num);
        String PlaneWeightstr = String.format("%.3f",PlaneWeight);
        PWFINAL.setText(PlaneWeightstr);
        PWFINAL.setTextColor(Color.WHITE);

        double PlaneMoment = resultsArry[19];
        TextView PMFINAL = (TextView) findViewById(R.id.EmptyM_num);
        String PlaneMomentstr = String.format("%.3f",PlaneMoment);
        PMFINAL.setText(PlaneMomentstr);
        PMFINAL.setTextColor(Color.WHITE);

        double fswinfo = resultsArry[0];
        TextView FSWFINAL = (TextView) findViewById(R.id.FSWW_num);
        String fswinfostr = String.format("%.3f",fswinfo);
        FSWFINAL.setText(fswinfostr);
        FSWFINAL.setTextColor(Color.WHITE);

        double FSWtotalM = resultsArry[4];
        TextView FSMFINAL = (TextView) findViewById(R.id.FSWM_num);
        String FSWtotalMstr = String.format("%.3f",FSWtotalM);
        FSMFINAL.setText(FSWtotalMstr);
        FSMFINAL.setTextColor(Color.WHITE);

        double rswinfo = resultsArry[1];
        TextView RSWFINAL = (TextView) findViewById(R.id.RSWW_num);
        String rswinfostr = String.format("%.3f",rswinfo);
        RSWFINAL.setText(rswinfostr);
        RSWFINAL.setTextColor(Color.WHITE);

        double RSWtotalM = resultsArry[5];
        TextView RSMFINAL = (TextView) findViewById(R.id.RSWM_num);
        String RSWtotalMstr = String.format("%.3f",RSWtotalM);
        RSMFINAL.setText(RSWtotalMstr);
        RSMFINAL.setTextColor(Color.WHITE);

        double baggageinfo = resultsArry[2];
        TextView BaggageWFINAL = (TextView) findViewById(R.id.FBaggageW_num);
        String baggageinfostr = String.format("%.3f",baggageinfo);
        BaggageWFINAL.setText(baggageinfostr);
        BaggageWFINAL.setTextColor(Color.WHITE);

        double BaggagetotalM = resultsArry[6];
        TextView BaggageMFINAL = (TextView) findViewById(R.id.FBaggageM_num);
        String BaggagetotalMstr = String.format("%.3f",BaggagetotalM);
        BaggageMFINAL.setText(BaggagetotalMstr);
        BaggageMFINAL.setTextColor(Color.WHITE);

        double subtotalW = resultsArry[3];
        TextView STWFINAL = (TextView) findViewById(R.id.ZFCW_num);
        String subtotalWstr = String.format("%.3f",subtotalW);
        STWFINAL.setText(subtotalWstr);
        STWFINAL.setTextColor(Color.WHITE);

        double subtotalM = resultsArry[7];
        TextView STMFINAL = (TextView) findViewById(R.id.ZFCM_num);
        String subtotalMstr = String.format("%.3f",subtotalM);
        STMFINAL.setText(subtotalMstr);
        STMFINAL.setTextColor(Color.WHITE);

        double FLtotalW = resultsArry[9];
        TextView FLWFINAL = (TextView) findViewById(R.id.FLW_num);
        String FFLtotalWstr = String.format("%.3f",FLtotalW);
        FLWFINAL.setText(FFLtotalWstr);
        FLWFINAL.setTextColor(Color.WHITE);

        double FLtotalM = resultsArry[8];
        TextView FLMFINAL = (TextView) findViewById(R.id.FLM_num);
        String FLMstr = String.format("%.3f",FLtotalM);
        FLMFINAL.setText(FLMstr);
        FLMFINAL.setTextColor(Color.WHITE);

        double STRCtotalW = resultsArry[11];
        TextView STRCWFINAL = (TextView) findViewById(R.id.STRCW_num);
        String STRCWstr = String.format("%.3f",STRCtotalW);
        STRCWFINAL.setText(STRCWstr);
        STRCWFINAL.setTextColor(Color.WHITE);

        double STRCtotalM = resultsArry[10];
        TextView STRCMFINAL = (TextView) findViewById(R.id.STRCM_num);
        String STRCMstr = String.format("%.3f",STRCtotalM);
        STRCMFINAL.setText(STRCMstr);
        STRCMFINAL.setTextColor(Color.WHITE);


        double subtotalTCW = resultsArry[13];
        TextView SSTOWFINAL = (TextView) findViewById(R.id.STTOW_num);
        String SSTOWstr = String.format("%.3f",subtotalTCW);
        SSTOWFINAL.setText(SSTOWstr);
        SSTOWFINAL.setTextColor(Color.WHITE);

        double subtotalTCM = resultsArry[12];
        TextView SSTOMFINAL = (TextView) findViewById(R.id.STTOM_num);
        String SSTOMstr = String.format("%.3f",subtotalTCM);
        SSTOMFINAL.setText(SSTOMstr);
        SSTOMFINAL.setTextColor(Color.WHITE);

        double SFTDW = resultsArry[14];
        TextView SFTDWFINAL = (TextView) findViewById(R.id.SFTDW_num);
        String SFTDWStr = String.format("-%.3f",SFTDW);
        SFTDWFINAL.setText(SFTDWStr);
        SFTDWFINAL.setTextColor(Color.WHITE);

        double SFTDM = resultsArry[15];
        TextView SFTDMFINAL = (TextView) findViewById(R.id.SFTDM_num);
        String SFTDMStr = String.format("-%.3f",SFTDM);
        SFTDMFINAL.setText(SFTDMStr);
        SFTDMFINAL.setTextColor(Color.WHITE);


        double LCW = resultsArry[16];
        TextView LCWFINAL = (TextView) findViewById(R.id.LCW_num);
        String LCWStr = String.format("%.3f",LCW);
        LCWFINAL.setText(LCWStr);
        LCWFINAL.setTextColor(Color.WHITE);

        double LCM = resultsArry[17];
        TextView LCMFINAL = (TextView) findViewById(R.id.LCM_num);
        String LCMStr = String.format("%.3f",LCM);
        LCMFINAL.setText(LCMStr);
        LCMFINAL.setTextColor(Color.WHITE);

        double CofG1 = resultsArry[20];
        TextView CofG1FINAL = (TextView) findViewById(R.id.CofG1);
        String CofG1Str = String.format("%.2f",CofG1);
        CofG1FINAL.setText(CofG1Str);
        CofG1FINAL.setTextColor(Color.WHITE);

        double CofG2 = resultsArry[21];
        TextView CofG2FINAL = (TextView) findViewById(R.id.CofG2);
        String CofG2Str = String.format("%.2f",CofG2);
        CofG2FINAL.setText(CofG2Str);
        CofG2FINAL.setTextColor(Color.WHITE);

        double CofG3 = resultsArry[22];
        TextView CofG3FINAL = (TextView) findViewById(R.id.CofG3);
        String CofG3Str = String.format("%.2f",CofG3);
        CofG3FINAL.setText(CofG3Str);
        CofG3FINAL.setTextColor(Color.WHITE);

        double RearBaggageTotalW = resultsArry[23];
        TextView RBWFINAL = (TextView) findViewById(R.id.RBaggageW_num);
        String RBWStr = String.format("%.2f",RearBaggageTotalW);
        RBWFINAL.setText(RBWStr);
        RBWFINAL.setTextColor(Color.WHITE);

        double RearBaggageTotalM = resultsArry[24];
        TextView RBMFINAL = (TextView) findViewById(R.id.RBaggageM_num);
        String RBMStr = String.format("%.2f",RearBaggageTotalM);
        RBMFINAL.setText(RBMStr);
        RBMFINAL.setTextColor(Color.WHITE);

        Button gotomainactivity = (Button)findViewById(R.id.button);
        gotomainactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchViewInt = new Intent(Display2.this, MainActivity.class);
                startActivityForResult(switchViewInt, 1);
            }
        });

    }
    public void displayInterstitial() {
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

}
