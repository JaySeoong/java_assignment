package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        // parent 정의되어 있지 않음
        // parent.field2 = "data2";
        //((child)parent).method3();

        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}
