package com.xiaowangzi.test.service;

import com.github.houbb.heaven.util.guava.Guavas;
import com.github.houbb.json.bs.JsonBs;
import com.xiaowangzi.ioc.model.BeanDefinition;
import com.xiaowangzi.ioc.model.impl.DefaultBeanDefinition;

import java.util.List;

public class Apple {
    public void color() {
        System.out.println("Apple color: red. ");
    }

    public static void main(String[] args) {
        List<BeanDefinition> beanDefinitions = Guavas.newArrayList();
        BeanDefinition apple = new DefaultBeanDefinition();
        apple.setClassName("com.xiaowangzi.test.service.Apple");
        apple.setName("apple");
        beanDefinitions.add(apple);

        System.out.println(JsonBs.serialize(beanDefinitions));

        System.out.println(JsonBs.deserialize("[{\"name\":\"apple\",\"className\":\"com.xiaowangzi.test.service.Apple\"}]",
                beanDefinitions.getClass()));
    }
}
