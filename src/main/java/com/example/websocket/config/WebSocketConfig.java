package com.example.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/** websocket的配置类
 * @author wss
 * @created 2020/10/12 15:25
 * @since 1.0
 */
@Configuration
@EnableWebSocketMessageBroker  // 注解表示开启使用STOMP协议来传输基于代理的消息，Broker就是代理的意思。
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /**
     * 注册一个端点叫 websocket, 前端就能通过这个链接连接到服务器实现双工通讯
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/websocket").withSockJS();  // SockJs 是解决浏览器不支持 ws 的情况
    }

    /**
     * 配置消息代理
     * @param registry
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/user", "/topic");  // 推送消息的前缀
        registry.setApplicationDestinationPrefixes("/app");  // 前端 /app 链接前缀过来的消息都会进入消息代理。
    }


}
