package com.smc.test;

import com.smc.pojo.Book;
import com.smc.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author : SongMc
 * @date : 2020/11/22 20:53
 * className : AddressTest
 * package: com.smc.test
 * version : 1.0
 * Description
 */
public class AddressTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean(BookService.class);
        List<Book> books = bookService.queryBooks();
        System.out.println(books);
    }



}
