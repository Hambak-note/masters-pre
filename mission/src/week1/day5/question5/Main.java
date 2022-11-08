package week1.day5.question5;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.store();
        phoneBook.search();
    }
}
