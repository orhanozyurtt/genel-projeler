import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(String word){

        String reverse = "";
        for (int i = word.length() -1 ; i >= 0 ; i--){
            reverse += word.charAt(i);
        }

        return word.equals(reverse);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kelimeyi girin : ");

        String word = sc.next();
        if(isPalindrom(word)){
            System.out.println("Girmiş olduğunuz kelime bir palindrom kelimedir.");
        }else {
            System.out.println("Girmiş olduğunuz kelime bir palindrom kelime değildir.");
        }
    }
}
