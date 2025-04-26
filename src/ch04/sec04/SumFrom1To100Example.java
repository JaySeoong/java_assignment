package ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        // for문 사용
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("1 ~ 100 합 : " + sum);

        // while문 사용
        sum = 0;
        int i = 0;
        while( i <= 100){
            sum = sum + i;
            i++;
        }
        System.out.println("1 ~ 100 합 : " + sum);

    }
}
