package com.ayx.eventDemo.event;

import com.ayx.eventDemo.dto.UserDto;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 用户插入事件
 */
public class UserInsertEvent extends ApplicationEvent {

    @Getter
    private UserDto userDto;
    public UserInsertEvent(UserDto source) {
        super(source);
        this.userDto =  source;
    }
}
