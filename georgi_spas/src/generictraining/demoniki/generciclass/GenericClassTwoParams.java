package generictraining.demoniki.generciclass;

public class GenericClassTwoParams<T, V> {
    private T filed;
    private V field;


    public void setT(T param) {
        this.filed = param;
    }

    public T getT() {
        return filed;
    }


    public void setV(V value) {
        this.field = value;
    }

    public V getV() {
        return field;
    }

    public static void main(String[] args) {
        GenericClassTwoParams<String,Integer> nice=new GenericClassTwoParams<>();
        nice.setT("Stringvane");
        nice.setV(1);
        System.out.println(nice.getT());
        System.out.println(nice.getV());

    }
}
