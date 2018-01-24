package com.WandBCalc.leron.WandBcalc;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.content.SharedPreferences;
import com.google.android.gms.leron.bandwcalc.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    double PlaneWeight;
    double PlaneMoment;
    double select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize spinner
        spinner = (Spinner) findViewById(R.id.planeselection);
        ArrayAdapter adapt = ArrayAdapter.createFromResource(this,R.array.planeselection,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapt);
        spinner.setOnItemSelectedListener(this);

        Button calcbutton = (Button)findViewById(R.id.planebutton);
        final Button WandBsetter = (Button) findViewById(R.id.WandBset);


        calcbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (select == 1 || select == 2 ||select == 3 ||select == 4 ||select == 5 ||select == 6 ||select == 7 ||
                        select == 8 || select == 9 ||select == 10 ||select == 11 ||select == 12 ||select == 13 ||
                        select == 14 ||select == 15 || select == 16) {
                    WandBsetter.setVisibility(View.INVISIBLE);
                    if(PlaneWeight != 0 || PlaneMoment != 0) {
                        Intent switchViewInt = new Intent(MainActivity.this, WandM2.class);
                        startActivityForResult(switchViewInt, 1);
                    }
                    else{
                        Intent switchViewInt = new Intent(MainActivity.this, WandM.class);
                        startActivityForResult(switchViewInt, 2);
                    }
                }
                if (select == 17) {
                    WandBsetter.setVisibility(View.VISIBLE);
                    if (check1.getcheck() == 1 || check1.getcheck() == 2) {
                        Intent switchViewInt = new Intent(MainActivity.this, WandM.class);
                        startActivityForResult(switchViewInt, 3);

                    } else {
                        String usertext2 = "Please Enter Custom Aircraft's Weight And Balance Formula's";
                        Toast.makeText(MainActivity.this, usertext2, Toast.LENGTH_LONG).show();
                    }
                }}
        });

            WandBsetter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent formulascreen = new Intent(MainActivity.this, Option.class);
                    startActivityForResult(formulascreen, 3);

                }
            });
        }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        SharedPreferences selectoption = getSharedPreferences("selectoption", Context.MODE_PRIVATE);
        SharedPreferences planeselectionname = getSharedPreferences("planeselection", Context.MODE_PRIVATE);

        switch(position) {
            case 0:
                SharedPreferences plane17 = getSharedPreferences("Plane17", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane17.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane17.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit17 = selectoption.edit();
                selectedit17.putInt("select", 17);
                selectedit17.commit();
                SharedPreferences selectoption17= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption17.getInt("select", 17);
                SharedPreferences.Editor planeselection17 = planeselectionname.edit();
                planeselection17.putString("name", "Custom Aircraft");
                planeselection17.commit();
                break;
            case 1: // C-FSEV - Cessna 172 G
                SharedPreferences plane1 = getSharedPreferences("Plane1", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane1.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane1.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit = selectoption.edit();
                selectedit.putInt("select", 1);
                selectedit.commit();
                SharedPreferences selectoption1= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption1.getInt("select", 1);
                SharedPreferences.Editor planeselection1 = planeselectionname.edit();
                planeselection1.putString("name", "C-FSEV");
                planeselection1.commit();
                break;
            case 2: //C-GSEO - Cessna 172 G
                SharedPreferences plane2 = getSharedPreferences("Plane2", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane2.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane2.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit2 = selectoption.edit();
                selectedit2.putInt("select", 2);
                selectedit2.commit();
                SharedPreferences selectoption2= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption2.getInt("select", 2);
                SharedPreferences.Editor planeselection2 = planeselectionname.edit();
                planeselection2.putString("name", "C-GSEO");
                planeselection2.commit();

                break;
            case 3: // C-GSEU - Cessna 172 G
                SharedPreferences plane3 = getSharedPreferences("Plane3", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane3.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane3.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit3 = selectoption.edit();
                selectedit3.putInt("select", 3);
                selectedit3.commit();
                SharedPreferences selectoption3= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption3.getInt("select", 3);
                SharedPreferences.Editor planeselection3 = planeselectionname.edit();
                planeselection3.putString("name", "C-GSEU");
                planeselection3.commit();
                break;
            case 4: //C-GSEY - Cessna 172 G
                SharedPreferences plane4 = getSharedPreferences("Plane4", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane4.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane4.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit4 = selectoption.edit();
                selectedit4.putInt("select", 4);
                selectedit4.commit();
                SharedPreferences selectoption4= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption4.getInt("select", 4);
                SharedPreferences.Editor planeselection4 = planeselectionname.edit();
                planeselection4.putString("name", "C-GSEY");
                planeselection4.commit();
                break;
            case 5: //C-FSCF - Cessna 172
                SharedPreferences plane5 = getSharedPreferences("Plane5", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane5.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane5.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit5 = selectoption.edit();
                selectedit5.putInt("select", 5);
                selectedit5.commit();
                SharedPreferences selectoption5= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption5.getInt("select", 5);
                SharedPreferences.Editor planeselection5 = planeselectionname.edit();
                planeselection5.putString("name", "C-FSCF");
                planeselection5.commit();
                break;
            case 6: // C-FSCG - Cessna 172
                SharedPreferences plane6 = getSharedPreferences("Plane6", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane6.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane6.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit6 = selectoption.edit();
                selectedit6.putInt("select", 6);
                selectedit6.commit();
                SharedPreferences selectoption6= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption6.getInt("select", 6);
                SharedPreferences.Editor planeselection6 = planeselectionname.edit();
                planeselection6.putString("name", "C-FSCG");
                planeselection6.commit();
                break;
            case 7: // C-FSCL - Cessna 172
                SharedPreferences plane7 = getSharedPreferences("Plane7", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane7.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane7.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit7 = selectoption.edit();
                selectedit7.putInt("select", 7);
                selectedit7.commit();
                SharedPreferences selectoption7= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption7.getInt("select", 7);
                SharedPreferences.Editor planeselection7 = planeselectionname.edit();
                planeselection7.putString("name", "C-FSCL");
                planeselection7.commit();
                break;
            case 8: // C-GSCR - Cessna 172
                SharedPreferences plane8 = getSharedPreferences("Plane8", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane8.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane8.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit8 = selectoption.edit();
                selectedit8.putInt("select", 8);
                selectedit8.commit();
                SharedPreferences selectoption8= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption8.getInt("select", 8);
                SharedPreferences.Editor planeselection8 = planeselectionname.edit();
                planeselection8.putString("name", "C-GSCR");
                planeselection8.commit();
                break;
            case 9: // C-GSCS - Cessna 172
                SharedPreferences plane9 = getSharedPreferences("Plane9", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane9.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane9.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit9 = selectoption.edit();
                selectedit9.putInt("select", 9);
                selectedit9.commit();
                SharedPreferences selectoption9= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption9.getInt("select", 9);
                SharedPreferences.Editor planeselection9 = planeselectionname.edit();
                planeselection9.putString("name", "C-GSCS");
                planeselection9.commit();
                break;
            case 10: // C-GSCT - Cessna 172
                SharedPreferences plane10 = getSharedPreferences("Plane10", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane10.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane10.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit10 = selectoption.edit();
                selectedit10.putInt("select", 10);
                selectedit10.commit();
                SharedPreferences selectoption10= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption10.getInt("select", 10);
                SharedPreferences.Editor planeselection10 = planeselectionname.edit();
                planeselection10.putString("name", "C-GSCT");
                planeselection10.commit();
                break;
            case 11:// C-GSCX - Cessna 172
                SharedPreferences plane11 = getSharedPreferences("Plane11", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane11.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane11.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit11 = selectoption.edit();
                selectedit11.putInt("select", 11);
                selectedit11.commit();
                SharedPreferences selectoption11= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption11.getInt("select", 11);
                SharedPreferences.Editor planeselection11 = planeselectionname.edit();
                planeselection11.putString("name", "C-GSCX");
                planeselection11.commit();
                break;
            case 12: // C-GSEQ - Cessna 172
                SharedPreferences plane12 = getSharedPreferences("Plane12", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane12.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane12.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit12 = selectoption.edit();
                selectedit12.putInt("select", 12);
                selectedit12.commit();
                SharedPreferences selectoption12= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption12.getInt("select", 12);
                SharedPreferences.Editor planeselection12 = planeselectionname.edit();
                planeselection12.putString("name", "C-GSEQ");
                planeselection12.commit();
                break;
            case 13: // C-GSCU
                SharedPreferences plane13 = getSharedPreferences("Plane13", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane13.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane13.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit13 = selectoption.edit();
                selectedit13.putInt("select", 13);
                selectedit13.commit();
                SharedPreferences selectoption13= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption13.getInt("select", 13);
                SharedPreferences.Editor planeselection13 = planeselectionname.edit();
                planeselection13.putString("name", "C-GSCU");
                planeselection13.commit();
                break;
            case 14: // C-GSCV
                SharedPreferences plane14 = getSharedPreferences("Plane14", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane14.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane14.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit14 = selectoption.edit();
                selectedit14.putInt("select", 14);
                selectedit14.commit();
                SharedPreferences selectoption14= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption14.getInt("select", 14);
                SharedPreferences.Editor planeselection14 = planeselectionname.edit();
                planeselection14.putString("name", "C-GSCV");
                planeselection14.commit();
                break;
            case 15: // C-GSCW (F33A)
                SharedPreferences plane15 = getSharedPreferences("Plane15", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane15.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane15.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit15 = selectoption.edit();
                selectedit15.putInt("select", 15);
                selectedit15.commit();
                SharedPreferences selectoption15= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption15.getInt("select", 15);
                SharedPreferences.Editor planeselection15 = planeselectionname.edit();
                planeselection15.putString("name", "C-GSCW");
                planeselection15.commit();
                break;
            case 16: // C-GSCY (F33A)
                SharedPreferences plane16 = getSharedPreferences("Plane16", Context.MODE_PRIVATE);
                PlaneWeight = Double.longBitsToDouble(plane16.getLong("PlaneWeight", 0));
                PlaneMoment = Double.longBitsToDouble(plane16.getLong("PlaneMoment", 0));
                SharedPreferences.Editor selectedit16 = selectoption.edit();
                selectedit16.putInt("select", 16);
                selectedit16.commit();
                SharedPreferences selectoption16= getSharedPreferences("selectoption", Context.MODE_PRIVATE);
                select = selectoption16.getInt("select", 16);
                SharedPreferences.Editor planeselection16 = planeselectionname.edit();
                planeselection16.putString("name", "C-GSCY");
                planeselection16.commit();
                break;

            default:
               break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }
}

