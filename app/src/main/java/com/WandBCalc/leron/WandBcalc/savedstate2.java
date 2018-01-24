package com.WandBCalc.leron.WandBcalc;

/**
 * Created by leronbergelson on 2016-03-12.
 */
public class savedstate2 {
    static double secondFormulaFSW1;
    static double secondFormulaFSW2;
    static double secondFormulaRSW1;
    static double secondFormulaRSW2;
    static double secondFormulaBaggage1;
    static double secondFormulaBaggage2;
    static double secondFormulaBaggage3;
    static double secondFormulaBaggage4;
    static double secondFormulaFL1;
    static double secondFormulaFL2;
    static double secondFormulaFL3;
    static double secondFormulaFL4;
    static double secondFormulaSTTOC1;
    static double secondFormulaSTTOC2;
    static double secondFormulaSFTD1;
    static double secondFormulaSFTD2;
    static double secondFormulaSFTD3;
    static double secondFormulaCOFG1;
    static double secondFormulaCOFG2;
    static double secondFormulaCOFG3;

    public savedstate2(){
        this.secondFormulaFSW1 = 0;
        this.secondFormulaFSW2 = 0;
        this.secondFormulaRSW1 = 0;
        this.secondFormulaRSW2 = 0;
        this.secondFormulaBaggage1 = 0;
        this.secondFormulaBaggage2 = 0;
        this.secondFormulaBaggage3 = 0;
        this.secondFormulaBaggage4 = 0;
        this.secondFormulaFL1 = 0;
        this.secondFormulaFL2 = 0;
        this.secondFormulaFL3 = 0;
        this.secondFormulaFL4 = 0;
        this.secondFormulaSTTOC1 = 0;
        this.secondFormulaSTTOC2 = 0;
        this.secondFormulaSFTD1 = 0;
        this.secondFormulaSFTD2 = 0;
        this.secondFormulaSFTD3 = 0;
        this.secondFormulaCOFG1 = 0;
        this.secondFormulaCOFG2 = 0;
        this.secondFormulaCOFG3 = 0;


    }

    public savedstate2 (double FormulaFSW1,double FormulaFSW2, double FormulaRSW1, double FormulaRSW2, double FormulaBaggage1,
                       double FormulaBaggage2,double FormulaBaggage3,double FormulaBaggage4, double FormulaFL1, double FormulaFL2, double FormulaFL3, double FormulaFL4,
                       double FormulaSTTOC1, double FormulaSTTOC2, double FormulaSFTD1, double FormulaSFTD2, double FormulaSFTD3,
                       double FormulaCOFG1, double FormulaCOFG2, double FormulaCOFG3){

        this.secondFormulaFSW1 = FormulaFSW1;
        this.secondFormulaFSW2 = FormulaFSW2;
        this.secondFormulaRSW1 = FormulaRSW1;
        this.secondFormulaRSW2 = FormulaRSW2;
        this.secondFormulaBaggage1 = FormulaBaggage1;
        this.secondFormulaBaggage2 = FormulaBaggage2;
        this.secondFormulaBaggage3 = FormulaBaggage3;
        this.secondFormulaBaggage4 = FormulaBaggage4;
        this.secondFormulaFL1 = FormulaFL1;
        this.secondFormulaFL2 = FormulaFL2;
        this.secondFormulaFL3 = FormulaFL3;
        this.secondFormulaFL4 = FormulaFL4;
        this.secondFormulaSTTOC1 = FormulaSTTOC1;
        this.secondFormulaSTTOC2 = FormulaSTTOC2;
        this.secondFormulaSFTD1 = FormulaSFTD1;
        this.secondFormulaSFTD2 = FormulaSFTD2;
        this.secondFormulaSFTD3 = FormulaSFTD3;
        this.secondFormulaCOFG1 = FormulaCOFG1;
        this.secondFormulaCOFG2 = FormulaCOFG2;
        this.secondFormulaCOFG3 = FormulaCOFG3;

        if (FormulaFSW1 == '\0'||  FormulaFSW2 == '\0'|| FormulaRSW1 == '\0'|| FormulaRSW2 == '\0'|| FormulaBaggage1 == '\0'
                || FormulaBaggage2 == '\0'|| FormulaBaggage3 == '\0' || FormulaBaggage4 == '\0'|| FormulaFL1 == '\0'|| FormulaFL2 == '\0'|| FormulaFL3 == '\0'|| FormulaFL4 == '\0'||
                FormulaSTTOC1 == '\0'|| FormulaSTTOC2== '\0'|| FormulaSFTD1== '\0'|| FormulaSFTD2== '\0'||
                FormulaSFTD3== '\0'|| FormulaCOFG1== '\0'|| FormulaCOFG2== '\0'|| FormulaCOFG3== '\0'){
            new savedstate2();
        }

    }

    public static double getFormulaFSW1(){
        return secondFormulaFSW1;
    }
    public static double getFormulaFSW2(){
        return secondFormulaFSW2;
    }
    public static double getFormulaRSW1(){
        return secondFormulaRSW1;
    }
    public static double getFormulaRSW2(){
        return secondFormulaRSW2;
    }
    public static double getFormulaBaggage1(){
        return secondFormulaBaggage1;
    }
    public static double getFormulaBaggage2(){
        return secondFormulaBaggage2;
    }
    public static double getFormulaBaggage3(){
        return secondFormulaBaggage3;
    }
    public static double getFormulaBaggage4(){
        return secondFormulaBaggage4;
    }
    public static double getFormulaFL1(){
        return secondFormulaFL1;
    }
    public static double getFormulaFL2(){
        return secondFormulaFL2;
    }
    public static double getFormulaFL3(){
        return secondFormulaFL3;
    }
    public static double getFormulaFL4(){
        return secondFormulaFL4;
    }
    public static double getFormulaSTTOC1(){return secondFormulaSTTOC1; }
    public static double getFormulaSTTOC2(){ return secondFormulaSTTOC2;}
    public static double getFormulaSFTD1(){
        return secondFormulaSFTD1;
    }
    public static double getFormulaSFTD2(){
        return secondFormulaSFTD2;
    }
    public static double getFormulaSFTD3(){
        return secondFormulaSFTD3;
    }
    public static double getFormulaCOFG1(){
        return secondFormulaCOFG1;
    }
    public static double getFormulaCOFG2(){
        return secondFormulaCOFG2;
    }
    public static double getFormulaCOFG3(){
        return secondFormulaCOFG3;
    }


}
