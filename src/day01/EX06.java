package day01;

public class EX06 {
    public static void main(String[] args) {
        Person songa = new Person("손가");
        Person kelly = new Person("켈리");
        Person Jason = new Person("제이슨");
        System.out.println(kelly.name);
    }
}


// 사람 클래스>
class Person{
    // 생성자
    Person(String name){
        this.name = name;
    }

    // 변수(부품)
    String name;


}