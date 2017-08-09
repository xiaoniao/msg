package com.liuzhuang.mq;

/**
 * Created by liuzz on 2017/8/9.
 */
public class SampleBean {

    private String name;

    public SampleBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SampleBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
