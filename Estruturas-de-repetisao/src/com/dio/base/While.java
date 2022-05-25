package com.dio.base;

public class While {


    private String items[];

    public While(String... items){
        this.items = new String[]{
                "joão","maria","carlos"
        };
    }

    public void printItems(){
        int i = 0;
        while(i < items.length){
            System.out.println(items[i]);
            i++;
        }
    }


}
