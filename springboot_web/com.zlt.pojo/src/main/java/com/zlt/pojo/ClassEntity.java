package com.zlt.pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/* 班级信息表*/


public class ClassEntity implements Serializable {

    private Integer id;
    private String class_name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    @Override
    public String toString() {
        return "ClassEntity{" +
                "id=" + id +
                ", class_name='" + class_name + '\'' +
                '}';
    }

    public ClassEntity(Integer id, String class_name) {
        this.id = id;
        this.class_name = class_name;
    }

    public ClassEntity() {
    }
}
