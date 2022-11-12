package week2.day4.question2;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class ReadAndWrite {

    private BufferedReader br;
    private BufferedWriter bw;

    public ArrayList<String> fileRead(String fileName) throws IOException {
        String path = System.getProperty("user.dir") + "\\src\\week2\\day4\\question2\\";
        br = new BufferedReader(new FileReader(path + fileName));

        ArrayList<String> inputList = new ArrayList<>();
        String input = br.readLine();
        while(input != null){
            inputList.add(input);
            input = br.readLine();
        }

        br.close();
        return inputList;
    }

    public String consoleRead() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public void writeFile(String fileName, String output) throws IOException {
        String path = System.getProperty("user.dir") + "\\src\\week2\\day4\\question2\\";
        bw = new BufferedWriter(new FileWriter(path + fileName, true));
        System.out.println(path);
        bw.write(output);
        bw.newLine();
        bw.flush();
    }

    public void modifyFile(String fileName, Map<Integer, Student> students) throws IOException{
        String path = System.getProperty("user.dir") + "\\src\\week2\\day4\\question2\\";
        new FileWriter(path + fileName, false).close();
        bw = new BufferedWriter(new FileWriter(path + fileName, true));
        for (Integer key : students.keySet()) {
            Student student = students.get(key);
            bw.write(student.toString());
            bw.newLine();
        }
        bw.flush();
    }


}
