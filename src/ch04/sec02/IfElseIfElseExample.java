package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {

        int score = 75;

        if (90 <= score && score <= 100){
            System.out.println("점수가 90 ~ 100 입니다.");
            System.out.println("등급은 A입니다.");
        }else if (80 <= score){
            System.out.println("점수가 80 ~ 89입니다.");
            System.out.println("등급은 B입니다.");
        }else if (70 <= score){
            System.out.println("점수가 70 ~ 79입니다.");
            System.out.println("등급은 C입니다.");
        }else{
            System.out.println("점수가 0 ~69입니다.");
            System.out.println("등급은 D입니다.");
        }
    }
}
