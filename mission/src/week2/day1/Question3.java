package week2.day1;

import java.util.Stack;

public class Question3 {
    static private boolean[][] isVisited;
    static int directionX[] = {1, 0, -1, 0};
    static int directionY[] = {0, 1, 0, -1};

    public static void main(String[] args) {
        int mazeBoard[][] = initMazeBoard();
        Stack<int[]> pathStack = dfsMaze(mazeBoard, 7, 7);

        System.out.println(pathStack.size());

        int size = pathStack.size();
        //행을 x 열을 y 기준으로 출력한다.
        for (int i = 0; i < size; i++) {
            int[] position = pathStack.pop();
            System.out.print("("+position[0] + ", " + position[1]+") <- ");
        }


    }

    /**
     * 이동 가능한 칸은 1 이동하지 못하는 칸은 0으로 표시
     */
    static public int[][] initMazeBoard(){
        int[][] mazeBoard = new int[][]{{1, 0,0,0,1,0,0,0}, {1,1,1,0,1,1,1,1},
                {0,0,1,1,1,0,1,0}, {0, 0, 1, 0,0,0,1,0}, {0, 1,1,0,1,1,1,1},
                {1,0,0,0,1,0,0,0}, {0, 1, 0, 0, 1,1,1,1}, {1,0,0,1,0,0,0,1}};

        return mazeBoard;
    }

    static public Stack<int[]> dfsMaze(int[][] mazeBoard, int exitX, int exitY) {
        int vertical = mazeBoard.length;
        int horizontal = mazeBoard[0].length;
        isVisited = new boolean[vertical][horizontal];

        Stack<int[]> currentPositionStack = new Stack<>();
        //출발점 추가
        currentPositionStack.add(new int[]{0, 0});
        isVisited[0][0] = true;
        while (true) {
            int[] currentPosition = currentPositionStack.peek();
            isVisited[currentPosition[0]][currentPosition[1]] = true;
            if(isVisited[exitX][exitY] == true) break;

            boolean conditionCheck = false;
            for (int direction = 0; direction < 4; direction++) {
                int nextX = currentPosition[0] + directionX[direction];
                int nextY = currentPosition[1] + directionY[direction];

                //주어진 값의 범위를 벗어나는 경우
                if (nextX < 0 || nextX >= vertical || nextY < 0 || nextY >= horizontal) {
                    continue;
                }

                //이미 방문했던 곳이거나 막힌 길인경우
                if(isVisited[nextX][nextY] == true || mazeBoard[nextX][nextY] == 0) continue;


                conditionCheck = true;
                currentPositionStack.add(new int[]{nextX, nextY});
                break;
            }

            if(conditionCheck == false) currentPositionStack.pop();
        }

        return currentPositionStack;
    }


}
