package week1.day5.question5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PhoneBook {

    private ArrayList<Phone> phoneBook;

    public PhoneBook(){
        phoneBook = new ArrayList<>();
    }

    public void store() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("인원수 >> ");
        int headCount = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < headCount; i++) {
            System.out.print("이름과 전화번호(이름과 전화번호는 빈 칸없이 입력)>>> ");
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String tel = st.nextToken();
            Phone phone = new Phone(name, tel);
            phoneBook.add(phone);
        }
        System.out.println("저장되었습니다....");
    }

    public void search() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.print("검색할 이름 >> ");
            String name = br.readLine();

            if(name.equals("그만")){
                return;
            }
            boolean isSearched = false;
            for (int i = 0; i < phoneBook.size(); i++) {
                Phone phone = phoneBook.get(i);
                if(phone.getName().equals(name)){
                    System.out.println(name + "의 번호는" + phone.getTel() + " 입니다.");
                    isSearched = true;
                    break;
                }
            }
            if(isSearched == false) System.out.println(name+"이 없습니다.");
        }
    }

}
