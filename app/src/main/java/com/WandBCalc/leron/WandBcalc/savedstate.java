package com.WandBCalc.leron.WandBcalc;

public class savedstate {
    static double FormulaFSW1;
    static double FormulaFSW2;
    static double FormulaRSW1;
    static double FormulaRSW2;
    static double FormulaBaggage1;
    static double FormulaBaggage2;
    static double FormulaFL1;
    static double FormulaFL2;
    static double FormulaFL3;
    static double FormulaFL4;
    static double FormulaSTTOC1;
    static double FormulaSTTOC2;
    static double FormulaSFTD1;
    static double FormulaSFTD2;
    static double FormulaSFTD3;
    static double FormulaCOFG1;
    static double FormulaCOFG2;
    static double FormulaCOFG3;

    public savedstate(){
        this.FormulaFSW1 = 0;
        this.FormulaFSW2 = 0;
        this.FormulaRSW1 = 0;
        this.FormulaRSW2 = 0;
        this.FormulaBaggage1 = 0;
        this.FormulaBaggage2 = 0;
        this.FormulaFL1 = 0;
        this.FormulaFL2 = 0;
        this.FormulaFL3 = 0;
        this.FormulaFL4 = 0;
        this.FormulaSTTOC1 = 0;
        this. FormulaSTTOC2 = 0;
        this.FormulaSFTD1 = 0;
        this.FormulaSFTD2 = 0;
        this.FormulaSFTD3 = 0;
        this.FormulaCOFG1 = 0;
        this.FormulaCOFG2 = 0;
        this.FormulaCOFG3 = 0;


    }

    public savedstate(double FormulaFSW1, double FormulaFSW2, double FormulaRSW1, double FormulaRSW2, double FormulaBaggage1,
                      double FormulaBaggage2, double FormulaFL1, double FormulaFL2, double FormulaFL3, double FormulaFL4,
                      double FormulaSTTOC1, double FormulaSTTOC2, double FormulaSFTD1, double FormulaSFTD2, double FormulaSFTD3,
                      double FormulaCOFG1, double FormulaCOFG2, double FormulaCOFG3){

        this.FormulaFSW1 = FormulaFSW1;
        this.FormulaFSW2 = FormulaFSW2;
        this.FormulaRSW1 = FormulaRSW1;
        this.FormulaRSW2 = FormulaRSW2;
        this.FormulaBaggage1 = FormulaBaggage1;
        this.FormulaBaggage2 = FormulaBaggage2;
        this.FormulaFL1 = FormulaFL1;
        this.FormulaFL2 = FormulaFL2;
        this.FormulaFL3 = FormulaFL3;
        this.FormulaFL4 = FormulaFL4;
        this.FormulaSTTOC1 = FormulaSTTOC1;
        this.FormulaSTTOC2 = FormulaSTTOC2;
        this.FormulaSFTD1 = FormulaSFTD1;
        this.FormulaSFTD2 = FormulaSFTD2;
        this.FormulaSFTD3 = FormulaSFTD3;
        this.FormulaCOFG1 = FormulaCOFG1;
        this.FormulaCOFG2 = FormulaCOFG2;
        this.FormulaCOFG3 = FormulaCOFG3;

        if (FormulaFSW1 == '\0'||  FormulaFSW2 == '\0'|| FormulaRSW1 == '\0'|| FormulaRSW2 == '\0'|| FormulaBaggage1 == '\0'
                || FormulaBaggage2 == '\0'|| FormulaFL1 == '\0'|| FormulaFL2 == '\0'|| FormulaFL3 == '\0'|| FormulaFL4 == '\0'||
                FormulaSTTOC1 == '\0'|| FormulaSTTOC2== '\0'|| FormulaSFTD1== '\0'|| FormulaSFTD2== '\0'||
                FormulaSFTD3== '\0'|| FormulaCOFG1== '\0'|| FormulaCOFG2== '\0'|| FormulaCOFG3== '\0'){
         new savedstate();
        }

    }

    public static double getFormulaFSW1(){
        return FormulaFSW1;
    }
    public static double getFormulaFSW2(){
        return FormulaFSW2;
    }
    public static double getFormulaRSW1(){
        return FormulaRSW1;
    }
    public static double getFormulaRSW2(){
        return FormulaRSW2;
    }
    public static double getFormulaBaggage1(){
        return FormulaBaggage1;
    }
    public static double getFormulaBaggage2(){
        return FormulaBaggage2;
    }
    public static double getFormulaFL1(){
        return FormulaFL1;
    }
    public static double getFormulaFL2(){
        return FormulaFL2;
    }
    public static double getFormulaFL3(){
        return FormulaFL3;
    }
    public static double getFormulaFL4(){
        return FormulaFL4;
    }
    public static double getFormulaSTTOC1(){
        return FormulaSTTOC1;
    }
    public static double getFormulaSTTOC2(){return FormulaSTTOC2;}
    public static double getFormulaSFTD1(){
        return FormulaSFTD1;
    }
    public static double getFormulaSFTD2(){
        return FormulaSFTD2;
    }
    public static double getFormulaSFTD3(){
        return FormulaSFTD3;
    }
    public static double getFormulaCOFG1(){
        return FormulaCOFG1;
    }
    public static double getFormulaCOFG2(){
        return FormulaCOFG2;
    }
    public static double getFormulaCOFG3(){
        return FormulaCOFG3;
    }
}
