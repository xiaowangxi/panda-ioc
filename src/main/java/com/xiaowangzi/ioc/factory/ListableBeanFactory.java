package com.xiaowangzi.ioc.factory;

import java.util.List;
import java.util.Set;

public interface ListableBeanFactory extends BeanFactory {
    <T> List<T> getBeans(final Class<T> requiredType);

    Set<String> getBeanNames(final Class requiredType);

    <T> T getRequiredTypeBean(final Class<T> requiredType, final String beanName);
}
