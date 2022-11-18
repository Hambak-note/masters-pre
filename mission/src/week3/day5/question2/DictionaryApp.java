package week3.day5.question2;

public class DictionaryApp {

    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("Shine","자바");
        dic.put("Silver","파이선");
        dic.put("Silver","C++"); // Silver의 값을 C++로 수정
        System.out.println("Silver의 값은 " + dic.get("Silver"));
        System.out.println("Shine의 값은 " + dic.get("Shine"));
        dic.delete("Shine"); // Shine 아이템 삭제
        System.out.println("Shine의 값은 " + dic.get("Shine")); //삭제된 아이템 접근
    }
}
