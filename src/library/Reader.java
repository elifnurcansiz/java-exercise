package library;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private int age;
    private char sex;
    private List<Book> books = new ArrayList<>();

    public Reader(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void read(Book book) {
        System.out.printf("%s isimli kullanıcı %s kitabını okudu.%n", name, book.getTitle());
        books.add(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
