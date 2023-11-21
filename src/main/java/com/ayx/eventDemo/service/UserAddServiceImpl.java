package com.ayx.eventDemo.service;


import com.ayx.eventDemo.event.UserInsertEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserAddServiceImpl implements UserAddService {


    @Override
    public boolean AfterUserAdd(UserInsertEvent userInsertEvent) {
        System.out.println("用户插入成功之后的事件监听！");
        return false;
    }
}
