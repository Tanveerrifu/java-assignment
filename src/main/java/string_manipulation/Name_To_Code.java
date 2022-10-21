package string_manipulation;

//4. Writea program that will give following output:
//        Input: chattogram
//        Output: C8M

public class Name_To_Code {
    public static void main(String[] args) {

        String str = "chattogram";

        String str1 = String.valueOf(str.charAt(0)).toUpperCase();
        int len = str.length()-2;
        String str2 = String.valueOf(str.charAt(str.length()-1)).toUpperCase();
        System.out.println(str1+len+str2);
    }
}