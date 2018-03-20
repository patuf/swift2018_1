package generictraining.demoniki.genericmethods;

import generictraining.demoniki.generciclass.GenreicClass;
import sun.net.www.content.text.Generic;

public class GenericMethods {

    public static <T> boolean isEqual(GenreicClass<T> g1,GenreicClass<T>g2){
        return g1.get().equals(g2.get());
    }


    public static <T> boolean genericMethod(T p1,T p2){
        return p1.equals(p2);
    }

    public static void main(String[] args) {
        GenreicClass<String> str1=new GenreicClass<>();
        str1.set("male");

        GenreicClass<String> str2=new GenreicClass<>();
            str2.set("male");
        System.out.println(GenericMethods.isEqual(str1,str2));

        GenreicClass<String> str=new GenreicClass<>();
        str.set("1");
        GenreicClass<Integer> inT=new GenreicClass<>();
        inT.set(1);
        System.out.println(GenericMethods.genericMethod(str.toString(),inT));
    }


}
