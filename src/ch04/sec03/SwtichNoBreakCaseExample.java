package ch04.sec03;

public class SwtichNoBreakCaseExample {
    public static void main(String[] args) {
        int time = 10;
        System.out.println("[현재시간: " + time + "시]");
        switch(time){
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
            // break문이 없어 선택된 case문 기준 아래 case문들도 실행되는 문제 발생
        }
    }
}
