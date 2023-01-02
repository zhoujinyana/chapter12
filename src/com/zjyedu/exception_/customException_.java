package com.zjyedu.exception_;

public class customException_ {
    public static void main(String[] args) {
        int age = 180;
        if(!(age > 18 && age < 120)){
            //这里我们通过构造器指定异常信息
            throw new AgeException("年龄不在正常范围内");
        }
        System.out.println("年龄正确");

    }
}
//自定义异常
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}