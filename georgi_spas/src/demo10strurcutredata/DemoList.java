package demo10strurcutredata;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoList {

    // get list collection
    // Use List interface
    // ,ake implemetation on list whit linkedlist
 static List<Character> getLinkdeList(){
     List<Character> list=new LinkedList<>();
     list.add('a');
     list.add('b');
     list.add('c');
     list.add('d');
     list.add('e');
     list.add('f');
     return list;
 }
    // implementation whit array list
    static List<Character> getArrayList(){
     List<Character> arrayList=new ArrayList<>();
     arrayList.add('a');
        arrayList.add('b');
        arrayList.add('c');
        arrayList.add('d');
        arrayList.add('e');
        arrayList.add('f');
        return arrayList;
    }


    public static void main(String[] args) {
    // take collection must make reference point
        List<Character>linkedList=getLinkdeList();
        List<Character>arrayList=getArrayList();

        //System.out.println(linkedList);
        //System.out.println(arrayList);
// Retriving elemtn by index is slower for linklist and faster for arraylist.
        // reason is; linked list has to traverese elements and count
        int a,b;
        a=linkedList.get(5);
        b=arrayList.get(5);

    }


}
