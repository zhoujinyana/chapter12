package com.zjyedu.exception_;

public class trycatch_ {
    public static void main(String[] args) {
        try {
            String str = "周晋燕";
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("被执行");
        }
    }
}
