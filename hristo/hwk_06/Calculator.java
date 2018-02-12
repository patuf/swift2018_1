package swift2018_1.hristo.hwk_06;

public class Calculator {

    public double a;
    public double b;
    public double c;


    public void Calculator(double newA, double newB) {
        newA = a;
        newB = b;
        double newC = c;
    }

    public void sum (double a, double b) {
        c = a + b;
    }

    public void substract (double a, double b){
        c = b - a;
    }

    public void multiply (double a, double b){
        c = a*b;
    }

    public void divide (double a, double b){
        c = a/b;
    }

    public void percentage (double a, double b){
        c = a*(b/100.000);

    }
}
