package week4.day1.mission.question5;

public class HeapSortTest {

    public static void main(String[] args) {
        HeapSort maxHeap = new MaxHeap();
        HeapSort minHeap = new MinHeap();

        maxHeap.insertHeap(80);
        maxHeap.insertHeap(50);
        maxHeap.insertHeap(70);
        maxHeap.insertHeap(10);
        maxHeap.insertHeap(60);
        maxHeap.insertHeap(20);

        minHeap.insertHeap(80);
        minHeap.insertHeap(50);
        minHeap.insertHeap(70);
        minHeap.insertHeap(10);
        minHeap.insertHeap(60);
        minHeap.insertHeap(20);

        System.out.println("최대힙 출력 : ");
        maxHeap.printHeap();
        System.out.println("최소힙 출력 : ");
        minHeap.printHeap();

        int n, data;
        n = maxHeap.getHeapSize();
        System.out.print("최대힙 출력 : ");
        for (int i = 0; i < n; i++) {
            data = maxHeap.deleteHeap();
            System.out.printf("\n 출력 : [%d]", data);
        }

        System.out.println();

        n = minHeap.getHeapSize();
        System.out.print("최소힙 출력 : ");
        for (int i = 0; i < n; i++) {
            data = minHeap.deleteHeap();
            System.out.printf("\n 출력 : [%d]", data);
        }



    }
}
