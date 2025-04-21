package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();
        // 잘못된 코드
        // parent.method3();
        // 이유: Parent 클래스에는 method3가 정의되어 있지 않음.
    }
}
