package com.dio.base;

public class Enhanced {
    private String items[];

    public Enhanced(String... items){
        this.items = new String[]{
                "joão","maria","carlos"
        };
    }

    public void printItems(){
        for (String i: items){
            System.out.println(i);
        }
    }
}
