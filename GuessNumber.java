import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int createNumb = rand.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int guessNumb,right=5;
        System.out.println(createNumb);
        while (right>0){

            System.out.print("Tahmin et : ");
            guessNumb = sc.nextInt();

            if (guessNumb< 0 || guessNumb >99){
                System.out.println("Lütfen 0-100 arasında bir değer girin");
                continue;
            }
            if(guessNumb == createNumb ){
                System.out.println("*****************");

                System.out.println("Doğru tahmin");

                System.out.println("*****************");

                break;
            }else {
                System.out.println("***************************");
                System.out.println("Yanlış tahmin tekrar dene");
                right--;
                System.out.println("kalan hak : "+right);
                if (guessNumb > createNumb){
                    System.out.println("tahminin üstünde bir değer girdiniz");
                }else {
                    System.out.println("tahminin altında bir değer girdiniz");

                }
                System.out.println("***************************");

                continue;
            }

        }

    }

}
