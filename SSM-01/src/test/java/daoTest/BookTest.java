package daoTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.BinGCU.dao.BookMapper;
import top.BinGCU.pojo.Book;

public class BookTest {

    @Test
    public void getBookByNameTest(){
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookMapper bookmapper = applicationContext.getBean(BookMapper.class);
        System.out.println(bookmapper.getBookByName("《XX1》"));
    }

    @Test
    public void insertOneBookTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookMapper bookmapper = applicationContext.getBean(BookMapper.class);

        Book book = new Book("《YY》", "YYYYXC");
        System.out.println(bookmapper.insertOneBook(book));
    }

    @Test
    public void deleteBooksByNameTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookMapper bookmapper = applicationContext.getBean(BookMapper.class);

        System.out.println(bookmapper.deleteBooksByName("《YY》"));
    }
}
