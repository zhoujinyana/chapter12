package com.zjyedu.exception_;

public class exception01 {
    public static void main(String[] args) {
        try {
            int num = 100;
            int num2 = 0;
            System.out.println(num / num2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
