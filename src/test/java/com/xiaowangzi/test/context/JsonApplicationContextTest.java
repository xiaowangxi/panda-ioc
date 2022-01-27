package com.xiaowangzi.test.context;

import com.xiaowangzi.ioc.context.JsonApplicationContext;
import com.xiaowangzi.ioc.factory.BeanFactory;
import com.xiaowangzi.test.service.Apple;
import org.junit.Test;

public class JsonApplicationContextTest {

    @Test
    public void simpleTest() {
        BeanFactory beanFactory = new JsonApplicationContext("apple.json");
        Apple apple = beanFactory.getBean("apple", Apple.class);
        apple.color();
    }
}
