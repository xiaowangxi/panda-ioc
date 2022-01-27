package com.xiaowangzi.ioc.model.impl;

import com.xiaowangzi.ioc.model.BeanDefinition;

public class DefaultBeanDefinition implements BeanDefinition {
    /**
     * 名称
     */
    private String name;

    /**
     * 类名称
     */
    private String className;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String getScope() {
        return null;
    }

    @Override
    public void setScope(String scope) {

    }

    @Override
    public boolean isLazyInit() {
        return false;
    }

    @Override
    public void setLazyInit(boolean isLazyInit) {

    }

    @Override
    public void setInitialize(String initialize) {

    }

    @Override
    public String getInitialize() {
        return null;
    }

    @Override
    public void setDestroy(String destroy) {

    }

    @Override
    public String getDestroy() {
        return null;
    }

    @Override
    public void setFactoryMethod(String factoryMethod) {

    }

    @Override
    public String getFactoryMethod() {
        return null;
    }

    @Override
    public boolean isAbstractClass() {
        return false;
    }

    @Override
    public void setAbstractClass(boolean abstractClass) {

    }

    @Override
    public String getParentName() {
        return null;
    }

    @Override
    public void setParentName(String parentName) {

    }
}
