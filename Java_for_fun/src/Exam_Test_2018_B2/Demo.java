package Exam_Test_2018_B2;

import java.util.ArrayList;

public class Demo {
    public static double totalTax(ArrayList<House> arr_house, ArrayList<Shop> arr_shop){
        double total_tax = 0;
        for(House h : arr_house){
            total_tax += h.houseTax(1,1);
        }
        for(Shop s : arr_shop){
            total_tax += s.shopTax(1);
        }
        //测试输出
        System.out.println(total_tax);
        return total_tax;
    }

    public static void main(String[] args) {
        House h1 = new House("a",300000);
        House h2 = new House("b",90000);
        House h3 = new House("c",700000);
        Shop s1 = new Shop("d",900000);
        Shop s2 = new Shop("e",800000);

        ArrayList<House> arr_house = new ArrayList<>();
        ArrayList<Shop> arr_shop = new ArrayList<>();

        arr_house.add(h1);
        arr_house.add(h2);
        arr_house.add(h3);
        arr_shop.add(s1);
        arr_shop.add(s2);

        Demo.totalTax(arr_house,arr_shop);

    }
}
