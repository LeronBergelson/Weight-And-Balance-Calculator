package com.WandBCalc.leron.WandBcalc;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.leron.bandwcalc.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class WandM extends FragmentActivity {

        public final static String WandMMessage1 = "com.example.leron.flightcalc.Transfer";
        public final static String WandMMessage2 = "com.example.leron.flightcalc.Transfer2";
        private AdView mAdView;
        double PlaneWeight;
        double PlaneMoment;
        EditText PW;
        EditText PM;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.wandm);

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

              PW = (EditText) findViewById(R.id.PW_num);
              PM = (EditText) findViewById(R.id.PM_num);

              SharedPreferences selectoption = getSharedPreferences("selectoption", Context.MODE_PRIVATE);
              final double select = selectoption.getInt("select", 0);

            Button calcbutton = (Button)findViewById(R.id.flightbutton);
            calcbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    final String planeselection = planestring;
                    double[] results = {PlaneWeight,PlaneMoment};

                    try {
                        double PW2 = Double.parseDouble(PW.getText().toString());
                        double PM2 = Double.parseDouble(PM.getText().toString());
                        if(select == 1){
                            SharedPreferences plane1 = getSharedPreferences("Plane1", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane1edit = plane1.edit();
                            plane1edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane1edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane1edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane1", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value2.class);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage1, results);
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 1);
                        }

                        if(select == 2){
                            SharedPreferences plane2 = getSharedPreferences("Plane2", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane2edit = plane2.edit();
                            plane2edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane2edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane2edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane2", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value2.class);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage1, results);
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 2);
                        }
                        if(select == 3){
                            SharedPreferences plane3 = getSharedPreferences("Plane3", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane3edit = plane3.edit();
                            plane3edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane3edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane3edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane3", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value2.class);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage1, results);
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 3);
                        }

                        if(select == 4){
                            SharedPreferences plane4 = getSharedPreferences("Plane4", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane4edit = plane4.edit();
                            plane4edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane4edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane4edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane4", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value2.class);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage1, results);
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 4);
                        }
                        if(select == 5){
                            SharedPreferences plane5 = getSharedPreferences("Plane5", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane5edit = plane5.edit();
                            plane5edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane5edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane5edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane5", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value2.class);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage1, results);
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 5);
                        }
                        if(select == 6){
                            SharedPreferences plane6 = getSharedPreferences("Plane6", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane6edit = plane6.edit();
                            plane6edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane6edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane6edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane6", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value2.class);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage1, results);
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 6);
                        }
                        if(select == 7){
                            SharedPreferences plane7 = getSharedPreferences("Plane7", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane7edit = plane7.edit();
                            plane7edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane7edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane7edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane7", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value2.class);
                            switchViewInt.putExtra(WandMMessage1, results);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 7);
                        }
                        if(select == 8){
                            SharedPreferences plane8 = getSharedPreferences("Plane8", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane8edit = plane8.edit();
                            plane8edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane8edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane8edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane8", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value2.class);
                            switchViewInt.putExtra(WandMMessage1, results);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 8);
                        }
                        if(select == 9){
                            SharedPreferences plane9 = getSharedPreferences("Plane9", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane9edit = plane9.edit();
                            plane9edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane9edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane9edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane9", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value2.class);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage1, results);
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 9);
                        }
                        if(select == 10){
                            SharedPreferences plane10 = getSharedPreferences("Plane10", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane10edit = plane10.edit();
                            plane10edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane10edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane10edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane10", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value2.class);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage1, results);
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 10);
                        }
                        if(select == 11){
                            SharedPreferences plane11 = getSharedPreferences("Plane11", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane11edit = plane11.edit();
                            plane11edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane11edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane11edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane11", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value2.class);
                            switchViewInt.putExtra(WandMMessage1, results);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 11);
                        }
                        if(select == 12){
                            SharedPreferences plane12 = getSharedPreferences("Plane12", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane12edit = plane12.edit();
                            plane12edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane12edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane12edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane12", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value2.class);
                            switchViewInt.putExtra(WandMMessage1, results);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 12);
                        }
                        if(select == 13){
                            SharedPreferences plane13 = getSharedPreferences("Plane13", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane13edit = plane13.edit();
                            plane13edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane13edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane13edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane13", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value.class);
                            switchViewInt.putExtra(WandMMessage1, results);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 13);
                        }
                        if(select == 14){
                            SharedPreferences plane14 = getSharedPreferences("Plane14", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane14edit = plane14.edit();
                            plane14edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane14edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane14edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane14", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value.class);
                            switchViewInt.putExtra(WandMMessage1, results);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 14);
                        }
                        if(select == 15){
                            SharedPreferences plane15 = getSharedPreferences("Plane15", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane15edit = plane15.edit();
                            plane15edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane15edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane15edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane15", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value.class);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage1, results);
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 15);
                        }
                        if(select == 16){
                            SharedPreferences plane16 = getSharedPreferences("Plane16", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane16edit = plane16.edit();
                            plane16edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane16edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane16edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane16", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            Intent switchViewInt = new Intent(WandM.this, Value.class);
                            results[0] = PlaneWeight;
                            results[1] = PlaneMoment;
                            switchViewInt.putExtra(WandMMessage1, results);
                            switchViewInt.putExtra(WandMMessage2, planeselection);
                            startActivityForResult(switchViewInt, 16);
                        }
                        if(select == 17){
                            SharedPreferences plane17 = getSharedPreferences("Plane17", Context.MODE_PRIVATE);
                            SharedPreferences.Editor plane17edit = plane17.edit();
                            plane17edit.putLong("PlaneWeight", Double.doubleToRawLongBits(PW2));
                            plane17edit.putLong("PlaneMoment", Double.doubleToRawLongBits(PM2));
                            plane17edit.commit();
                            SharedPreferences plane1extra = getSharedPreferences("Plane17", Context.MODE_PRIVATE);
                            PlaneWeight = Double.longBitsToDouble(plane1extra.getLong("PlaneWeight", 0));
                            PlaneMoment = Double.longBitsToDouble(plane1extra.getLong("PlaneMoment", 0));
                            if (check1.getcheck() == 1) {
                                Intent switchViewInt = new Intent(WandM.this, Value3.class);
                                results[0] = PlaneWeight;
                                results[1] = PlaneMoment;
                                switchViewInt.putExtra(WandMMessage1, results);
                                switchViewInt.putExtra(WandMMessage2, planeselection);
                                startActivityForResult(switchViewInt, 4);
                            }
                            if (check1.getcheck() == 2) {
                                Intent switchViewInt = new Intent(WandM.this, Value4.class);
                                results[0] = PlaneWeight;
                                results[1] = PlaneMoment;
                                switchViewInt.putExtra(WandMMessage1, results);
                                switchViewInt.putExtra(WandMMessage2, planeselection);
                                startActivityForResult(switchViewInt, 5);
                            }
                        }
                    }catch(NumberFormatException FieldValidation){
                        String usertext = "Please Enter A Value For All The Fields Provided";
                        Toast.makeText(WandM.this, usertext, Toast.LENGTH_LONG).show();
       }}})
            ;
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

