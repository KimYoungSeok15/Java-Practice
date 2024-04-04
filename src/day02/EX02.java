package day02;

import java.util.concurrent.BrokenBarrierException;

public class EX02 {
    public static void main(String[] args) {
        Coffee americano = new Coffee(4500, "ice", "tall");
        americano.setPrice(6000);
//        americano.getInfo();
        Barista chunsik = new Barista("춘식");
        chunsik.getCoffeeInfo(americano);
        chunsik.makeCoffee();
    }
}

// 커피
// 필드 : 가격, 핫 or 아이스, 사이즈
// 메소드 : getInfo - sout(가격, 핫 or 아이스, 사이즈)

class Coffee {
    private int price;
    private String temperature;
    private String size;

    Coffee(int price, String temperature, String size){
        this.price = price;
        this.temperature = temperature;
        this.size = size;
    }

    void setPrice(int price){
        // 필드 값 설정 'set'
        if (price>=0){
            this.price = price;
        }
    }

    void getInfo(){
        System.out.println(
                "이 커피는 가격이 " + price + "원이고, " +
                "온도는 " + temperature + "이고, " +
                        size + "입니다.;"
        );
    }

    int getPrice(Coffee coffee){
        return coffee.price;
    }
}

class Barista {
    String name;

    Barista(String name){
        this.name = name;
    }

    void getCoffeeInfo(Coffee coffee){
        System.out.println("이 커피는" + coffee.getPrice(coffee) + "원 입니다.");
    }

    void makeCoffee(){
        System.out.println("커피 여기 있습니다");
    }
}