package com.gwc.demo.template.course;

public class BigDataCourse extends NetWorkCourse{

    private boolean needHomeWorkFlag = false;

    public BigDataCourse(boolean needHomeWorkFlag) {
        this.needHomeWorkFlag = needHomeWorkFlag;
    }
    void checkHomeWork(){
        System.out.println("checkBigData");
    }

    @Override
    protected boolean needHomeWork() {
        return this.needHomeWorkFlag;
    }
}
