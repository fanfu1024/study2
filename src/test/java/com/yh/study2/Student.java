package com.yh.study2;

import org.springframework.stereotype.Component;

/**
 * @author gaox
 * @description
 * @date 2020/2/10 16:41
 */
@Component
public class Student {
    private String stuName;

    private String stuAge;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }
}
