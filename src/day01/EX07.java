package day01;

public class EX07 {
    public static void main(String[] args) {
        // 객체 생성
        Laptop samsung = new Laptop("삼성");
        Laptop LG = new Laptop("엘지");
        System.out.println(samsung.brand);
        System.out.println(LG.brand);
        // 2개 : 삼성, LG
        // 객체의 변수 (브랜드) 출력
    }
}

class Laptop{

    String brand;

    Laptop(String brand){
        this.brand = brand;
    }
}
