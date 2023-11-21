package com.ayx.eventDemo;


import com.ayx.eventDemo.dto.UserDto;
import com.ayx.eventDemo.event.UserInsertEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AfterUserInsertTest {

    @Autowired
    public ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public ApplicationContext applicationContext;


    //SpringBoot事件发布写法一
    @Test
    public void test01(){
        UserDto source = new UserDto();
        source.setUserID(1L);
        source.setAge(18);
        source.setName("宇宙");
        //推送事件
        applicationEventPublisher.publishEvent(new UserInsertEvent(source));



    }
}
