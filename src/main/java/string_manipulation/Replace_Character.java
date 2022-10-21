package string_manipulation;

//6. Replace "R" from Rahim with "F" from the given String:
//        Input: Ratul and Rahim lives in Rangpur
//        Output: Ratul and Fahim lives in Rangpur

public class Replace_Character {
    public static void main(String[] args) {
        String str = "Ratul and Rahim lives in Rangpur";
        String str1 = str.replace("Rahim", "Fahim");
        System.out.println("Before replace: " + str);
        System.out.println("After replace: " + str1);
    }
}