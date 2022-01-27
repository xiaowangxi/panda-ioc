package com.xiaowangzi.ioc.factory;

import com.sun.istack.internal.Nullable;

/**
 * Bean 工厂接口
 */
public interface BeanFactory {

    /**
     * 根据名称获取对应的实例信息
     * 1）属性不存在，抛出不存在异常 {@link com.xiaowangzi.ioc.exception.IocRuntimeException}
     * 2）存在多个对象实现，直接抛出异常  {@link com.xiaowangzi.ioc.exception.IocRuntimeException}
     *
     * @param name beanName
     * @return 对象信息
     */
    Object getBean(String name);

    /**
     * 获取指定类型的Bean
     *
     * @param name         beanName 属性名称
     * @param requiredType requiredType 类型
     * @param <T>          泛型
     * @return 对象信息
     */
    <T> T getBean(String name, @Nullable Class<T> requiredType);

    /**
     * 是否包含指定的 bean
     *
     * @param name bean 名称
     * @return
     */
    boolean containsBean(String name);

    /**
     * 指定的 bean 和需要的类型二者是否匹配。
     *
     * @param name
     * @param typeToMatch
     * @return
     */
    boolean isTypeMatch(String name, @Nullable Class<?> typeToMatch);

    /**
     * 获取 bean 对应的类型
     *
     * @param name
     * @return
     */
    @Nullable
    Class<?> getType(String name);
}
