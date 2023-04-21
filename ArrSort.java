import java.util.Scanner;
public class ArrSort {

    static void printArr(int[] arr){
        System.out.print("sıralma : ");
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Dizinin boyutu n : ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Dizinin elemanlarını girin :");
        for (int x = 1 ; x <= n; x++){
            System.out.print(x + "."+" elemanı : ");
            int numb = input.nextInt();
            arr[x-1] = numb;
        }

        int temp;

        for (int i = 0 ; i < arr.length;i++){

            for (int j = i + 1 ; j<arr.length;j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        
        printArr(arr);








    }
}
