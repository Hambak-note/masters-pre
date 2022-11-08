package week2.day1;

import java.util.ArrayList;

public class Question2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Book> onLibrary = new ArrayList<>();
        onLibrary.add(new Book("태백산맥", "조정래"));
        onLibrary.add(new Book("이기적 유전자", "리처드 도킨즈"));
        onLibrary.add(new Book("자전거 도둑", "박완서"));
        onLibrary.add(new Book("토지", "박경리"));
        onLibrary.add(new Book("대변동", "제레드 다이아몬드"));

        //복사본 생성(얕은복사)
        ArrayList<Book> onLibraryCopy = new ArrayList<>();
        for (Book book : onLibrary) {
            onLibraryCopy.add((Book) book.clone());
        }


        //두마을 도서관 개관 - 깊은 복사
        ArrayList<Book> doLibrary = new ArrayList<>();
        for (Book book : onLibrary) {
            doLibrary.add((Book) book.clone());
        }

        //온마을 도서관 3번째 목록 수정 및 복사본 추가
        int index = 0;
        Book newBook = new Book("그 많던 싱아는 누가 다 먹었을까", "박완서");
        for (Book book : onLibrary) {
            if(book.getTitle() == "자전거 도둑"){
                onLibrary.set(index, newBook);
                break;
            }
            index++;
        }

        onLibraryCopy.add(newBook);


        //두마을 도서관 도서 목록 추가
        doLibrary.add(new Book("사피엔스", "유발 하라리"));

        //출력
        System.out.println("====온마을 도서관====");
        for (Book book : onLibrary) {
            System.out.println(book.toString());
        }
        System.out.println("====온마을 도서관(복사본)====");
        for (Book book : onLibraryCopy) {
            System.out.println(book.toString());
        }
        System.out.println("====두마을 도서관====");
        for (Book book : doLibrary) {
            System.out.println(book.toString());
        }

    }
}

class Book implements Cloneable{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}