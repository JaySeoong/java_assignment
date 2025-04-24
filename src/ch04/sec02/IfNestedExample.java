package ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20)+81;
        System.out.println("점수: " + score);
        if (95 <= score && score <=100){
            System.out.println("학점: A+");
        }else if (90 <= score && score <=94){
            System.out.println("학점: A");
        }else if (85 <= score && score <=89){
            System.out.println("학점: B+");
        }else if(81 <= score && score <=84){
            System.out.println("학점: B");
        }
    }
}
