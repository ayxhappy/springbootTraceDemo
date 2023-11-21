package com.ayx.eventDemo.controller;

import com.ayx.eventDemo.dto.UserDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.json.JSONObject;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public UserDto getUser() throws JsonProcessingException {

        UserDto source = new UserDto();
        source.setUserID(1L);
        source.setAge(18);
        source.setName("宇宙");

        log.info("user :{}", source.toString());
        log.info("tid:{}", MDC.get("tid"));
       return source;
    }
}
