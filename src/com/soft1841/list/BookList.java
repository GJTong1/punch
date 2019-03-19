package com.soft1841.list;

import com.soft1841.list.Book;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    public static void main(String[] args) {

        List<Book> book = new ArrayList<>();
        book.add(new Book(1,"java",65.9));
        book.add(new Book(2,"高数",35.8));
        book.add(new Book(3,"高职英语",41.36));
        System.out.println("----------书籍信息-----------");
        System.out.println(book);
        book.add(1,new Book(3,"java零基础",32.4));
        System.out.println(book);
        book.remove(2  );
        System.out.println(book);
        book.set(2,new Book(3,"雄安猪",12.25));
        System.out.println(book);
        System.out.println(book.get(1));
        book.add(new Book(1,"高数",35.8));
        System.out.println(book);
        System.out.println(book.indexOf("2"));
        System.out.println(book.lastIndexOf("2"));




    }
}