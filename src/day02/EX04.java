package day02;

//
public class EX04 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        bus.ride();
        taxi.ride();

        bus.getWheelNum();
        taxi.getWheelNum();
    }
}
// 부모클래스는 자식클래스의 공통된 특징!
// 자식부터 설계하고, 부모 설계해야 쉽다!
class Car {
    int wheels = 4;
    void getWheelNum(){
        System.out.println("바퀴 수는"+this.wheels+"개 입니다.");
    }
    void ride(){
        System.out.println("부아앙");
    }
}

// 버스
class Bus extends Car {
    void bell(){
        System.out.println("삐~~");
    }
}
// 택시
class Taxi extends Car {
}
// 메소드 : 달린다 (버스-부릉부릉, 택시-빵빵)