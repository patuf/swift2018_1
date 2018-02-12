package Calculator;

public class Calculator {
    private double a;
    private double b;
    private double result;

    public void setA(double varA){
        a = varA;
    }
    public void setB(double varB){
        b = varB;
    }
    //creating methods for different functions
    public double sum(){
        result = a + b;
        return result;
    }
    public double subtract(){
        result = b - a;
        return result;
    }
    public double multiply(){
        result = a*b;
        return result;
    }
    public double divide(){
        result = a/b;
        return result;
    }
    public double percentage(){
        result = a*(b/100.0f);
        return result;
    }
}
