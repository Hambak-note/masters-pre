package week4.day1.mission.question5;

import java.util.ArrayList;

public class MaxHeap implements HeapSort{

    private final ArrayList<Integer> heap;

    public MaxHeap(){
        heap = new ArrayList<>();
        heap.add(0); // 계산의 편의를 위해 인덱스 0에 더미 값 추가
    }

    @Override
    public void insertHeap(int value) {
        heap.add(value);
        int position = heap.size()-1;

        while(position > 1 && heap.get(position / 2) < heap.get(position)){
            int temp = heap.get(position / 2);
            heap.set(position / 2, heap.get(position));
            heap.set(position, temp);

            position = position / 2;
        }
    }

    @Override
    public void printHeap() {
        System.out.print("Max Heap : ");
        for(int i = 1; i < heap.size(); i++){
            System.out.print("[" + heap.get(i) + "] ");
        }
        System.out.println();
    }

    @Override
    public int getHeapSize() {
        return heap.size()-1;
    }

    @Override
    public int deleteHeap() {

        if (heap.size() - 1 < 1) {
            System.out.println("저장된 값이 없습니다.");
            return 0;
        }

        int deleteValue = heap.get(1);

        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int position = 1;
        while((position*2) < heap.size()){

            int max = heap.get(position * 2);
            int maxPosition = position *2;

            if(((position*2 + 1) < heap.size()) && max < heap.get(position*2+1)){
                max = heap.get(position * 2 + 1);
                maxPosition = position*2+1;
            }

            if(heap.get(position) > max){
                break;
            }

            int temp = heap.get(position);
            heap.set(position, heap.get(maxPosition));
            heap.set(maxPosition, temp);
            position = maxPosition;
        }

        return deleteValue;
    }
}
