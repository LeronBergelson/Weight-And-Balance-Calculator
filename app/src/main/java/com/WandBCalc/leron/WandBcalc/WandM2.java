package com.WandBCalc.leron.WandBcalc;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.leron.bandwcalc.R;


public class WandM2 extends FragmentActivity {

        public final static String WandMMessage1 = "com.example.leron.flightcalc.Transfer";
        public final static String WandMMessage2 = "com.example.leron.flightcalc.Transfer2";
        private AdView mAdView;
        double PlaneWeight;
        double PlaneMoment;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.wandm2);

            Intent resultsInt = getIntent();
            mAdView = (AdView) findViewById(R.id.ad_view);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);

            SharedPreferences planeselection = getSharedPreferences("planeselection", Context.MODE_PRIVATE);
            final String planestring = planeselection.getString("name", "");
            String Planeselected = planestring;
            TextView PSFINAL = (TextView) findViewById(R.id.planeselected);
            CharSequence charValPS = "" + Planeselected;
            PSFINAL.setText(charValPS);
            PSFINAL.setTextColor(Color.RED);

            SharedPreferences selectoption = getSharedPreferences("selectoption", Context.MODE_PRIVATE);
            final double select = selectoption.getInt("select", 0);

            if(select == 1) {
                SharedPreferences plane1 = getSharedPreferences("Plane1", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane1.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane1.getLong("PlaneMoment", 0));
                TextView PlaneWset = (TextView) findViewById(R.id.textView33);
                String PlaneWeightstring = String.format("%.3f", PlaneWeight);
                PlaneWset.setText(PlaneWeightstring);
                PlaneWset.setTextColor(Color.WHITE);
                TextView PlaneMset = (TextView) findViewById(R.id.textView34);
                String PlaneMomentstring = String.format("%.3f", PlaneMoment);
                PlaneMset.setText(PlaneMomentstring);
                PlaneMset.setTextColor(Color.WHITE);
        }
        if(select == 2){
            SharedPreferences plane2 = getSharedPreferences("Plane2", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane2.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane2.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);
        }
        if(select == 3){
            SharedPreferences plane3 = getSharedPreferences("Plane3", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane3.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane3.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);

        }
        if(select == 4){
            SharedPreferences plane4 = getSharedPreferences("Plane4", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane4.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane4.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);
        }
        if(select == 5){
            SharedPreferences plane5 = getSharedPreferences("Plane5", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane5.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane5.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);

        }
        if(select == 6){
            SharedPreferences plane6 = getSharedPreferences("Plane6", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane6.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane6.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);
        }
        if(select == 7){
            SharedPreferences plane7 = getSharedPreferences("Plane7", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane7.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane7.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);
        }
        if(select == 8){
            SharedPreferences plane8 = getSharedPreferences("Plane8", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane8.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane8.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);
        }
        if(select == 9){
            SharedPreferences plane9 = getSharedPreferences("Plane9", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane9.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane9.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);
        }
        if(select == 10){
            SharedPreferences plane10 = getSharedPreferences("Plane10", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane10.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane10.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);
        }
        if(select == 11){
            SharedPreferences plane11 = getSharedPreferences("Plane11", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane11.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane11.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);
        }
        if(select == 12){
            SharedPreferences plane12 = getSharedPreferences("Plane12", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane12.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane12.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);
        }
        if(select == 13){
            SharedPreferences plane13 = getSharedPreferences("Plane13", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane13.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane13.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);
        }
        if(select == 14){
            SharedPreferences plane14 = getSharedPreferences("Plane14", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane14.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane14.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);
        }
        if(select == 15){
            SharedPreferences plane15 = getSharedPreferences("Plane15", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane15.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane15.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);

        }
        if(select == 16){
            SharedPreferences plane16 = getSharedPreferences("Plane16", Context.MODE_PRIVATE);
            PlaneWeight = Double.longBitsToDouble(plane16.getLong("PlaneWeight", 0));
            PlaneMoment = Double.longBitsToDouble(plane16.getLong("PlaneMoment", 0));
            TextView PlaneWset = (TextView) findViewById(R.id.textView33);
            String PlaneWeightstring = String.format("%.3f", PlaneWeight);
            PlaneWset.setText(PlaneWeightstring);
            PlaneWset.setTextColor(Color.WHITE);
            TextView PlaneMset = (TextView) findViewById(R.id.textView34);
            String PlaneMomentstring = String.format("%.3f", PlaneMoment);
            PlaneMset.setText(PlaneMomentstring);
            PlaneMset.setTextColor(Color.WHITE);
        }



            Button calcbutton = (Button)findViewById(R.id.flightbutton);
            calcbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    final String planeselection = planestring;
                    double[] results = {PlaneWeight,PlaneMoment};


                    if(select == 1 || select == 2 ||select == 3 ||select == 4 ||select == 5 ||select == 6 ||
                            select == 7 ||select == 8 ||select == 9 ||select == 10 ||select == 11
                            ||select == 12){
                        Intent switchViewInt = new Intent(WandM2.this, Value2.class);
                        switchViewInt.putExtra(WandMMessage1, results);
                        switchViewInt.putExtra(WandMMessage2, planeselection);
                        startActivityForResult(switchViewInt, 1);
                    }

                    if(select == 13 || select == 14 || select == 15 || select == 16) {
                        Intent switchViewInt = new Intent(WandM2.this, Value.class);
                        switchViewInt.putExtra(WandMMessage1, results);
                        switchViewInt.putExtra(WandMMessage2, planeselection);
                        startActivityForResult(switchViewInt, 2);

                    }}});

        Button setnew = (Button)findViewById(R.id.setnewvals);
        setnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchViewInt = new Intent(WandM2.this, WandM.class);
                startActivityForResult(switchViewInt, 5);
            }});
        }

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    /** Called when returning to the activity */
    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    /** Called before the activity is destroyed */
    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
}



};

