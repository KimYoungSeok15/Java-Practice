package day01;

public class EX02 {
    // num 변수 값이 9면 "A"
    // 8이면 "B"
    // 7이면 "C"
    // 6이하면 "F"
    public static void main(String[] args) {
        int age = 27;
        switch (age/10){
            case  3: {
                System.out.println("30대입니다");
                break;
            }
            case 2 : {
                System.out.println("20대입니다");
                break;
            }
            case 1 : {
                System.out.println("10대입니다");
                break;
            }
            default: System.out.println("어린이입니다");
        }
    }
}
