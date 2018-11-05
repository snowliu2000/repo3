package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试接口ItemsDao中 public Items findById(Integer id); 这个方法
 */
public class ItemsTest {
    @Test
    public void findById(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService service = ac.getBean(ItemsService.class);
        Items byId = service.findById(1);
        System.out.println(byId);
    }
}
