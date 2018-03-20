package generictraining.demoniki.genericmethods;

public class DemoNiki {


    public static void main(String[] args) {
        int i = add100(20);
        double d = add100(20d);
        System.out.println(i);
        System.out.println(d);
        //int j=add100(20d);
        i=createRandomValue(Integer.class);
        d=createRandomValue(Double.class);
        boolean b= createRandomValue(Boolean.class);
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
       // String s = createRandomValue(String.class);
//        boolean b = createRandomValue(String.class);


    }

    private static <T> T add100(T var) {
        if (var instanceof Integer) {
            return (T) (Integer) ((Integer) var + 100);
        } else if (var instanceof Double) {
            return (T) (Double) ((Double) var + 100);
        } else {
            throw new IllegalArgumentException("Only int and double supported");
        }
    }

    private static <V> V createRandomValue(Class<V> type) {
        if (type.equals(Integer.class)) {
            return (V) new Integer((int) Math.round(Math.random() * 100));
        }
        if (type.equals(Double.class)) {
            return (V) new Double(Math.round(Math.random() * 100));
        }
        if (type.equals(Boolean.class)) {
            return (V) new Boolean(Math.random() > 0.5 ? true : false);
        } else {
            throw new IllegalArgumentException("Only int, double and boolean supported!");
        }
    }


}
