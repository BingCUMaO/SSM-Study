package top.BinGCU.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.BinGCU.dao.BookMapper;
import top.BinGCU.pojo.Book;

import java.util.List;

public class BookService {
    public void buyBook(String customerName, String bookName){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookMapper bookmapper = context.getBean(BookMapper.class);

        int i = bookmapper.deleteBooksByName(bookName);
        if(i>=1) System.out.println("顾客"+customerName+"购买"+bookName+"成功");
        else if(i==0) System.out.println("顾客"+customerName+"购买"+bookName+"失败！已无库存");
    }

    public void puchase(List<Book> list){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookMapper bookmapper = context.getBean(BookMapper.class);

        for (Book book : list) {
            bookmapper.insertOneBook(book);
        }

        System.out.println("进货完成");
    }

    public Book getBook(String bookName) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookMapper bookmapper = context.getBean(BookMapper.class);

        return bookmapper.getBookByName(bookName);
    }
}
