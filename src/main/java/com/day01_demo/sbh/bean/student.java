package com.day01_demo.sbh.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel("学生类")
public class student implements Serializable {
    @ApiModelProperty("学号")
    private String id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("性别")
    private char sex;
    @ApiModelProperty("年龄")
    private int age;
    @ApiModelProperty("学院")
    private String college;
    @ApiModelProperty("班级")
    private String cla;
    @ApiModelProperty("排名")
    private int rank;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", college='" + college + '\'' +
                ", cla='" + cla + '\'' +
                ", rank=" + rank +
                '}';
    }
}
