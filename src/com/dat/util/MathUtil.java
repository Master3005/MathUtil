/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dat.util;

/**
 *
 * @author ASUS
 */
//class nay chứa những hàm toàn học , tính gì đó, giúp cho mọi nơi khác
//phàm là gì mang tính chất xài chung cho mọi nơi, ta sẽ dùng kĩ thuật
//STATIC
public class MathUtil {
    
    //tính n! = 1.2.3....n--> vì n! tăng kết quả rất nhanh, sẽ tràn kiểu int sớm
    //do int chỉ tối đa 2 tỷ 1, do đó xài long an toàn hơn
    //tuy thế 15! đã to lắm, mình hạn chế chỉ tính 15! trở lại
    public static long computeFactorial(int n) {
        
        //hàm sẽ ném về n
        if (n < 0 || n > 15) 
            throw new IllegalArgumentException("Invalid argument, n must be >= 0 & <= 15");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}
