package com.example.websocket.BeanTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author wss
 * @created 2020/10/13 9:56
 * @since 1.0
 */
public class t implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {

    public t() {
        System.out.println("this is constructor");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("this is postConstruct");
    }


    // 设置Bean名称
    @Override
    public void setBeanName(String s) {

    }

    // 设置
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    // 后置处理器的方法postProcessBeforeInitialization和postProcessAfterInitialization
    // 在
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        return null;
        System.out.println("postProcessBeforeInitialization " + bean + ", " + beanName);
        return bean;
    }

    // 在调用init-method方法之后执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        return null;
        System.out.println("postProcessAfterInitialization " + bean + ", " + beanName);
        return bean;
    }


    // 如果实现了InitializingBean接口，会调用这个方法,之后会调用用户自定义的init-method方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing bean...");
    }

    // 添加@PreDestroy注解的方法会在destroy方法之前调用
    @PreDestroy
    public void preDestroy() {
        System.out.println("this is preDestroy");
    }

    // 销毁bean
    @Override
    public void destroy() throws Exception {

    }
}
