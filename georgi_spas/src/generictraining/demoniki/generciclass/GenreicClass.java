package generictraining.demoniki.generciclass;

public class GenreicClass<T> {
    private T field;


    // methods
    public void set(T param) {
        this.field = param;
    }

    public T get() {
        return field;
    }


    public static void main(String[] args) {
        GenreicClass<String > strType=new GenreicClass<>();
        strType.set("String value");
        System.out.println(strType.get());

        GenreicClass blackHoll=new GenreicClass();// hre take object for params
        blackHoll.set("take all");
        System.out.println(blackHoll.get().getClass());
        blackHoll.set(123);
        System.out.println(blackHoll.get().getClass());
    }
}
