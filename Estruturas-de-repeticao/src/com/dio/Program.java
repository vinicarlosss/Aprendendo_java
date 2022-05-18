package com.dio;

import com.dio.base.Order;

public class Program {

    public static void main(String[] args){
        final Order order = new Order("code1234", 100);
        System.out.println(order.calculateFee());
    }
}
