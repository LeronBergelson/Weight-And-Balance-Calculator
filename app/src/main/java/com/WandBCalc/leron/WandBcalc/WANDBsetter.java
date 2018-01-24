package com.WandBCalc.leron.WandBcalc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.leron.bandwcalc.R;


public class WANDBsetter extends FragmentActivity {
    savedstate WANDBset;
    check1 setcheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wandbsetter);
        final EditText FormulaFSW_1 = (EditText) findViewById(R.id.FormulaFSW1);
        final EditText ForumlaFSW_2 = (EditText) findViewById(R.id.FormulaFSW2);
        final EditText FormulaRSW_1 = (EditText) findViewById(R.id.FormulaRSW1);
        final EditText FormulaRSW_2 = (EditText) findViewById(R.id.FormulaRSW2);
        final EditText FormulaBaggage_1 = (EditText) findViewById(R.id.FormulaBaggage1);
        final EditText FormulaBaggage_2 = (EditText) findViewById(R.id.FormulaBaggage2);
        final EditText FormulaFL_1 = (EditText) findViewById(R.id.FormulaFL1);
        final EditText FormulaFL_2 = (EditText) findViewById(R.id.FormulaFL2);
        final EditText FormulaFL_3 = (EditText) findViewById(R.id.FormulaFL3);
        final EditText FormulaFL_4 = (EditText) findViewById(R.id.FormulaFL4);
        final EditText FormulaSTTOC_1 = (EditText) findViewById(R.id.FormulaSTTOC1);
        final EditText FormulaSTTOC_2 = (EditText) findViewById(R.id.FormulaSTTOC2);
        final EditText FormulaSFTD_1 = (EditText) findViewById(R.id.FormulaSFTD1);
        final EditText FormulaSFTD_2 = (EditText) findViewById(R.id.FormulaSFTD2);
        final EditText FormulaSFTD_3 = (EditText) findViewById(R.id.FormulaSFTD3);
        final EditText FormulaCOFG_1 = (EditText) findViewById(R.id.FormulaCOFG1);
        final EditText FormulaCOFG_2 = (EditText) findViewById(R.id.FormulaCOFG2);
        final EditText FormulaCOFG_3 = (EditText) findViewById(R.id.FormulaCOFG3);

        Button calcbutton = (Button)findViewById(R.id.setbutton1);
        calcbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    double FormulaFSW1_ = Double.parseDouble(FormulaFSW_1.getText().toString());
                    double FormulaFSW2_ = Double.parseDouble(ForumlaFSW_2.getText().toString());
                    double FormulaRSW1_ = Double.parseDouble(FormulaRSW_1.getText().toString());
                    double FormulaRSW2_ = Double.parseDouble(FormulaRSW_2.getText().toString());
                    double FormulaBaggage1_ = Double.parseDouble(FormulaBaggage_1.getText().toString());
                    double FormulaBaggage2_ = Double.parseDouble(FormulaBaggage_2.getText().toString());
                    double FormulaFL1_ = Double.parseDouble(FormulaFL_1.getText().toString());
                    double FormulaFL2_ = Double.parseDouble(FormulaFL_2.getText().toString());
                    double FormulaFL3_ = Double.parseDouble(FormulaFL_3.getText().toString());
                    double FormulaFL4_ = Double.parseDouble(FormulaFL_4.getText().toString());
                    double FormulaSTTOC1_ = Double.parseDouble(FormulaSTTOC_1.getText().toString());
                    double FormulaSTTOC2_ = Double.parseDouble(FormulaSTTOC_2.getText().toString());
                    double FormulaSFTD1_ = Double.parseDouble(FormulaSFTD_1.getText().toString());
                    double FormulaSFTD2_ = Double.parseDouble(FormulaSFTD_2.getText().toString());
                    double FormulaSFTD3_ = Double.parseDouble(FormulaSFTD_3.getText().toString());
                    double FormulaCOFG1_ = Double.parseDouble(FormulaCOFG_1.getText().toString());
                    double FormulaCOFG2_ = Double.parseDouble(FormulaCOFG_2.getText().toString());
                    double FormulaCOFG3_ = Double.parseDouble(FormulaCOFG_3.getText().toString());
                    double option = 1;

                    WANDBset = new savedstate(FormulaFSW1_, FormulaFSW2_, FormulaRSW1_, FormulaRSW2_, FormulaBaggage1_,
                            FormulaBaggage2_, FormulaFL1_, FormulaFL2_, FormulaFL3_, FormulaFL4_, FormulaSTTOC1_, FormulaSTTOC2_,
                            FormulaSFTD1_, FormulaSFTD2_, FormulaSFTD3_, FormulaCOFG1_, FormulaCOFG2_, FormulaCOFG3_);
                    setcheck = new check1(option);
                    Intent switchViewInt = new Intent(WANDBsetter.this, MainActivity.class);
                    startActivityForResult(switchViewInt, 1);

                }catch(NumberFormatException FieldValidation){
                    String usertext = "Please Enter A Value For All The Fields Provided";
                    Toast.makeText(WANDBsetter.this, usertext, Toast.LENGTH_LONG).show();
                }

            }});}


}
