package com.revision;
class Mobile{
    static String name;
    String brand;   
    int price;

    public void show(){
        System.out.println("Name: " + name + " Brand: " + brand + " Price: " + price);
    }
}
public class StaticC {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        Mobile.name = "iPhone 14 Pro Max";
        obj1.brand = "Apple";
        
        obj1.price = 120000;
        obj1.show();

        Mobile obj2 = new Mobile();
        Mobile.name = "Samsung Galaxy S23 Ultra";
        obj2.brand = "Samsung";
        obj2.price = 110000;
        obj2.show();
    }
}