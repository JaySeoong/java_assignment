package ch12.sec05;

public class StringTokenizer {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] parsedData = data1.split("&|,");

        for (String name : parsedData)
        {
            System.out.println(name);
        }
        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        java.util.StringTokenizer st = new java.util.StringTokenizer(data2, "/");
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }


    }
}
