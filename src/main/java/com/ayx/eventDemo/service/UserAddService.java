package com.ayx.eventDemo.service;

import com.ayx.eventDemo.event.UserInsertEvent;

public interface UserAddService {

    boolean AfterUserAdd(UserInsertEvent userInsertEvent);
}
