package week3.day5.question2;

import java.util.Arrays;

public class Dictionary extends PairMap{

    private Integer curPoint;

    public Dictionary(Integer capacity) {
        this.keyArray = new String[capacity];
        this.valueArray = new String[capacity];
        this.curPoint = -1;
    }

    @Override
    String get(String key) {
        int index = Arrays.asList(keyArray).indexOf(key);
        if(index == -1) return null;
        return valueArray[index];
    }

    @Override
    void put(String key, String value) {
        int index = Arrays.asList(keyArray).indexOf(key);
        //키 값이 존재하지 않는 경우
        if(index == -1){
            //사전이 가득 찬 경우
            if(curPoint+1 == keyArray.length) {
                System.out.println("사전이 가득 찼습니다.");
                return;
            }
            curPoint++;
            keyArray[curPoint] = key;
            valueArray[curPoint] = value;
        }
        //key 값이 존재하는 경우
        else{
            valueArray[curPoint] = value;
        }
    }

    @Override
    String delete(String key) {
        int index = Arrays.asList(keyArray).indexOf(key);
        if(index == -1) return null;
        String value = valueArray[index];
        String temp = "";
        //삭제된 값 뒤의 값들을 앞으로 당기기
        for(int i = index; i < curPoint; i++){
            keyArray[i] = keyArray[i+1];
            valueArray[i] = valueArray[i+1];
        }

        keyArray[curPoint] = null;
        valueArray[curPoint] = null;
        curPoint--;

        return value;
    }

    @Override
    int length() {
        return curPoint+1;
    }
}