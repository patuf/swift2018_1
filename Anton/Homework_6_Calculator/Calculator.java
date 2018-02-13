public class Calculator {
    private double A;
    private double B;

    public double SUM(double a, double b) {
        this.A = a;
        this.B = b;
        return (a + b);
    }
    public double SUB(double a, double b) {
        this.A = a;
        this.B = b;
        return (b - a);
    }
    public double MUL(double a, double b) {
        this.A = a;
        this.B = b;
        return (a * b);
    }
    public double DIV(double a, double b) {
        this.A = a;
        this.B = b;
        return (a / b);
    }
    public double PER(double a, double b) {
        this.A = a;
        this.B = b;
        return b * a / 100;
    }
    public double getA(){
        return A;
    }
    public double getB(){
        return B;
    }
    public void setA(double a){
        this.A = a;
    }
    public void setB(double b){
        this.B = b;
    }
}
