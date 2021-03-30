package com.neo.spring;

import java.util.Properties;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 15:53
 */
public class DataSource {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}
