package com.example.websocket.service.impl;

import com.example.websocket.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author wss
 * @created 2020/10/12 15:27
 * @since 1.0
 */
@Service
public class testServiceImpl implements testService {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Async
    @Override
    public void sendMessage(String userId, Integer count) {

        if (count != null) {
            // 订阅链接为/user/{userId}/messCount的用户能收到消息，convertAndSendToUser会自动加上'/user/'前缀
            // （count才是要传输的数据）
            this.simpMessagingTemplate.convertAndSendToUser(userId, "/messCount", count);
            System.out.println("消息发送成功！userId:"+ userId + " count:"+count);
        }

    }
}
