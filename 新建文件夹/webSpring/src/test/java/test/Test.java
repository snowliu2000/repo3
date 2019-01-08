package test;


import cn.itcast.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        BookService service = ac.getBean("bookService", BookService.class);

        service.trans(1,2,10);

    }

}
