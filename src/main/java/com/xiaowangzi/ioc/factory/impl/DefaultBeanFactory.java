package com.xiaowangzi.ioc.factory.impl;

import com.xiaowangzi.ioc.exception.IocRuntimeException;
import com.xiaowangzi.ioc.factory.BeanFactory;
import com.xiaowangzi.ioc.model.BeanDefinition;
import com.xiaowangzi.ioc.support.lifecycle.DisposableBean;
import com.xiaowangzi.ioc.util.ClassUtils;
import com.xiaowangzi.ioc.util.ObjectUtil;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultBeanFactory implements BeanFactory, DisposableBean {

    /**
     * 对象信息map
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /**
     * 对象map
     */
    private Map<String, Object> beanMap = new ConcurrentHashMap<>();

    /**
     * 注册对象定义信息
     *
     * @param beanName
     * @param beanDefinition
     */
    protected void registerBeanDefinition(final String beanName, final BeanDefinition beanDefinition) {
        this.beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public Object getBean(String name) {
        Object bean = beanMap.get(name);
        if (ObjectUtil.isNotNull(bean)) {
            return bean;
        }

        // 获取配置信息
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (ObjectUtil.isNull(beanDefinition)) {
            throw new IocRuntimeException(name + "Not exists in bean define.");
        }
        Object newBean = createBean(beanDefinition);

        beanMap.put(name, newBean);
        return newBean;
    }

    private Object createBean(final BeanDefinition beanDefinition) {
        String className = beanDefinition.getClassName();
        Class clazz = ClassUtils.getClass(className);
        return ClassUtils.newInstance(clazz);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) {
        Object object = getBean(name);
        return (T)object;
    }

    @Override
    public boolean containsBean(String name) {
        return false;
    }

    @Override
    public boolean isTypeMatch(String name, Class<?> typeToMatch) {
        return false;
    }

    @Override
    public Class<?> getType(String name) {
        return null;
    }

    @Override
    public void destroy() {

    }
}
