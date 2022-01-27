package com.xiaowangzi.ioc.factory.impl;

import com.xiaowangzi.ioc.factory.ListableBeanFactory;

import java.util.List;
import java.util.Set;

public class DefaultListableBeanFactory extends DefaultBeanFactory implements ListableBeanFactory {

    @Override
    public <T> List<T> getBeans(Class<T> requiredType) {
        return null;
    }

    @Override
    public Set<String> getBeanNames(Class requiredType) {
        return null;
    }

    @Override
    public <T> T getRequiredTypeBean(Class<T> requiredType, String beanName) {
        return null;
    }

    /**
     * 获取指定优先的对象
     * @param requiredType
     * @param <T>
     * @return
     */
    protected <T> T getPrimaryBean(Class<T> requiredType) {
        return null;
    }
}
