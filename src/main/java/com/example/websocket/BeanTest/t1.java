package com.example.websocket.BeanTest;

import org.springframework.beans.factory.FactoryBean;

/** 工厂bean, 用户可以通过实现该接口定制实例化bean的逻辑。
 * @author wss
 * @created 2020/10/13 11:27
 * @since 1.0
 */
public class t1 implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
