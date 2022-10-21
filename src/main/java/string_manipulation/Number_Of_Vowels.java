package string_manipulation;

//5. Write a program that will count how many vowels in the given string:
//        "roadtosdet"
//        Output: 4

public class Number_Of_Vowels {
    public static void main(String[] args) {
        String str = "roadtosdet";
        int vowels = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
        }
        System.out.println("Total number of vowel is: " + vowels);
    }
}