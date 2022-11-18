package week3.day5.question1;

import java.util.ArrayList;

public class StringStack implements Stack{

    private Integer top;
    private String[] stringStack;

    public StringStack(Integer capacity) {
        this.stringStack = new String[capacity];
        this.top = -1;
    }

    @Override
    public int length() {
        return top+1;
    }

    @Override
    public int capacity() {
        return stringStack.length;
    }

    @Override
    public String pop() {
        if(top == -1) return "스택이 비었습니다.";

        String value = stringStack[top];
        stringStack[top] = null;
        top--;
        return value;
    }

    @Override
    public boolean push(String val) {
        if(top == stringStack.length-1){
            return false;
        }
        top++;
        stringStack[top] = val;
        return true;
    }
}
