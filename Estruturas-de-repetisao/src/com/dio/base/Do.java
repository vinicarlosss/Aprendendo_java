package com.dio.base;

public class Do {
    private String items[];

    public Do(String... items){
        this.items = new String[]{
                "joão","maria","carlos"
        };
    }

    public void printItems(){
        int i = 0;
        do{
            System.out.println(items[i]);
            i++;
        } while(i<items.length);
    }
}
