package com.example.inclassassignment06_seank;

import java.io.Serializable;

public class Student implements Serializable {
    String stuName;
    int stuAge;
    String stuInfo;
    boolean graduated;
    String maleOrFemale;


    public Student(String stuName, int stuAge, String stuInfo, boolean graduated, String maleOrFemale) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuInfo = stuInfo;
        this.graduated = graduated;
        this.maleOrFemale = maleOrFemale;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuInfo() {
        return stuInfo;
    }

    public void setStuInfo(String stuInfo) {
        this.stuInfo = stuInfo;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean stuSweets) {
        this.graduated = stuSweets;
    }

    public String getMaleOrFemale() {
        return maleOrFemale;
    }

    public void setMaleOrFemale(String maleOrFemale) {
        this.maleOrFemale = maleOrFemale;
    }

    @Override
    public String toString() {
        return "Student's Name: "+stuName+
                "\nAge: "+ stuAge+
                "\n"+ maleOrFemale+
                "\nGraduated from college? "+ graduated+
                "\nOther Information: " + stuInfo;
    }
}