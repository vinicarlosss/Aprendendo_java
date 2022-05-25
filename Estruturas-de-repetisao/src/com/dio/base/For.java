package com.dio.base;

public class For {
    private String items[];

    public For(String... items){
        this.items = new String[]{
                "joão","maria","carlos"
        };
    }

    public void printItems(){
        for (int i = 0; i<items.length; i++){
            System.out.println(items[i]);
        }
    }
}
