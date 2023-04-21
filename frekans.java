import java.util.*;

public class frekans {
    static void readMatris(int[][] matris) {

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if(matris[i][1] > 0) {
                    System.out.println(matris[i][0] + " sayısı " +matris[i][1] + " kere tekrar edildi  " );
                    break;

                }
            }

        }

    }
    static boolean isFindMatris(int[][] matris,int value){
        for (int i = 0; i < matris.length;i++ ){
            for (int j = 0 ; j < matris[0].length;j++){
                if(matris[i][0] == value){
                    return true;
                }
            }

        }
        return false;
    }


    static void print(int[] arr){
        System.out.print("[");
        for (int i = 0 ; i < arr.length;i++){
            if(arr.length-i != 1){
                System.out.print(arr[i] +",");
            }else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        //{10,10,20,10,20,5,7,8,9,9,7,1,2,7,7,0,0}
        int[] arr = {10,10,20,10,20,5,7,8,9,9,7,1,2,7,7,0,0};
        // int[] dupArr = new int[arr.length];
        int[][] list = new int[arr.length][2];
        int row=0,col0=0,col1=1;
        int count = 0,runCount=0;


        for(int x : arr){
            count=0;

            for (int i = 0 ; i < arr.length;i++){
                if(x == arr[i]){
                    count++;

                }
            }
            if(x == 0 && runCount == 0){
                list[row][col0] = x;
                list[row][col1] = count;
                row++;
                runCount++;
            }
            if(!isFindMatris(list,x)){
//            System.out.println("x :" + x + " "+ count );
                list[row][col0] = x;
                list[row][col1] = count;
                row++;
            }

        }
        print(arr);
        System.out.println();
        System.out.println("Tekrar Sayıları");
        readMatris(list);

    }

}




