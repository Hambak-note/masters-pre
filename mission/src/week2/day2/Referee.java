package week2.day2;

public class Referee {

    public boolean isValid(String preStr, String curStr){
        char preLast = preStr.charAt(preStr.length() - 1);
        char curFirst = curStr.charAt(0);

        if(preLast == curFirst && curStr.length() > 1){
            return true;
        }
        return false;
    }
}
