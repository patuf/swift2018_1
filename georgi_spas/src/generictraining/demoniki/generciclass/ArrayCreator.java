package generictraining.demoniki.generciclass;

import java.lang.reflect.Array;

public class ArrayCreator {

    static <T> T[] create(int lenght, T item) {
        T[] array = (T[]) new Object[lenght];

        for (int i = 0; i < lenght; i++) {
            array[i] = item;
        }
        return array;
    }
    static <T> T[] create(Class<T> cl,int lenght,T item){
                T[] array=(T[]) Array.newInstance(cl,lenght);
        for (int i = 0; i < array.length; i++) {
            array[i]=item;
        }
        return array;
    }
    public static void main(String[] args) {
       Object[] arr= ArrayCreator.create(3,1);

    }

}
