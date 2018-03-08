package StackMax;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class Stek {
    private List<Integer> stack = new ArrayList<>();
    private int maxNumber = 0;
    public void push(int number){
        stack.add(number);
    }
    public void pop(){
        stack.remove(stack.size()-1);
    }

    public int max(){
        for(int i=0;i<stack.size();i++){
            if(stack.get(i) > maxNumber)
                maxNumber = stack.get(i);
        }
        return maxNumber;
    }
    public List<Integer> getStack() {
        return stack;
    }

    public int getLastNumber(){
        return stack.get(stack.size()-1);
    }
}
