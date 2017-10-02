package com.example.demo.myapp1002;

/**
 * Created by Administrator on 2017/10/2.
 */


//建立一個Product的資料檔
public class Product implements java.io.Serializable{
    String name;
    int price;

    public Product (String n, int p)
    {
        name = n;
        price = p;
    }

    public String toString(){
        return "Name:" + name + "Price:" + price;
    }

}
