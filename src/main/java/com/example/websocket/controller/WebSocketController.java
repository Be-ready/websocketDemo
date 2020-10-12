package com.example.websocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wss
 * @created 2020/10/12 15:25
 * @since 1.0
 */
@RestController
public class WebSocketController {

    @Autowired
    private com.example.websocket.service.testService service;

    @RequestMapping(value = "/t", method = RequestMethod.GET)
    public String t() {
        return "ss";
    }
    @RequestMapping(value = "/user/t1", method = RequestMethod.GET)
    public void t1() {
        service.sendMessage("1",1);
    }
    @RequestMapping(value = "/user/t2", method = RequestMethod.GET)
    public void t2() {
        service.sendMessage("2",2);
    }

}
