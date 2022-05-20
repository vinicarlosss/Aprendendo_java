package com.dio;

import com.dio.base.*;

public class Mainclass {
    public static void main(String[] args){
        While array = new While();
        System.out.println("-----While-----\n");
        array.printItems();
        System.out.println("-----DO-----\n");
        Do outroArray = new Do();
        outroArray.printItems();
        System.out.println("-----FOR-----\n");
        For maisumArray = new For();
        maisumArray.printItems();
        System.out.println("-----Enhanced For-----\n");
        Enhanced qualquerArray = new Enhanced();
        qualquerArray.printItems();
    }
}
