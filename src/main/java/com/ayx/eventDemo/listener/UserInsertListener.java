package com.ayx.eventDemo.listener;

import com.ayx.eventDemo.dto.UserDto;
import com.ayx.eventDemo.event.UserInsertEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserInsertListener implements ApplicationListener<UserInsertEvent> {

    //@EventListener //监听该事件
    @Override
    public void onApplicationEvent(UserInsertEvent event) {
        System.out.println("用户插入之后监听事件启动");
        UserDto userDto = event.getUserDto();
        System.out.println(userDto.toString());
        System.out.println("用户："+userDto.getUserID()+" 插入成功");
    }
}
