package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            String[] array = {"100", "100", null, "200"};

            for (int i = 0; i <= array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }
            //ArrayIndexOutOfBoundsException 예외처리
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        //NullPointerException와 NumberFormatException는 동일한 예외처리
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
