package SumNumber;


public class Method {

    public double sum(double a, double b)throws MyException{
        if (a==b) throw new MyException("Numbers cant be equal.");
        if (a<0 || b<0) throw new MyException("Numbers can't be negative.");
        return a + b;
    }
}
