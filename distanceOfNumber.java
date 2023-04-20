public class distanceOfNumber {
    static void kucukBul(int[] arr,int aranan){
        int[][] con = new int[arr.length-1][2];
        int uzak = 0, input = aranan;
        int satir=0,sutun0=0,sutun1=1;
        boolean isRun =true;
        for (int ara : arr){
            if(aranan == ara){
                isRun = true;
                break;
            }else{
                isRun = false;
            }
        }
        if (isRun == true){
        for (int i : arr){
            if(i == input || i > input){
                continue;
            }
            if(i < input){
                uzak = input - i ;
                con[satir][sutun0] = i;
                con[satir][sutun1] = uzak;
            }
            satir++;
        }
        // con listesini ekrana yazdırıp kontrol etmek için
       /* System.out.println("sayi"+"\t | \t"+"Uzaklık");
        for (int i = 0 ; i < con.length;i++){
            System.out.println(con[i][0] + "\t | \t" + con[i][1]);
        }*/

        int min=con[0][1],sat=0;
        for(int k = 0 ; k < con.length;k++){
            if(con[k][1] < min && con[k][1] != 0 ){
                min = con[k][1];
                sat = k;
            }
        }
        System.out.println(aranan + " sayıdan küçük aranan sayıya en yakın sayı : "+ con[sat][0]);
        }else {
            System.out.println("diziden olmayan bir sayı girdiniz");
        }

    }
    static void buyukbul(int[] arr,int aranan){
        int[][] con = new int[arr.length-1][2];
        int uzak = 0, input = aranan;
        int satir=0,sutun0=0,sutun1=1;
        boolean isRun =true;
        for (int ara : arr){
            if(aranan == ara){
                isRun = true;
                break;
            }else{
                isRun = false;
            }
        }
        if (isRun == true){
            for (int i : arr){
                if(i == input || i < input){
                    continue;
                }
                if(i > input){
                    uzak = i - input ;
                    con[satir][sutun0] = i;
                    con[satir][sutun1] = uzak;
                }
                satir++;
            }
            // con listesini ekrana yazdırıp kontrol etmek için

            /*System.out.println("sayi"+"\t | \t"+"Uzaklık");
            for (int i = 0 ; i < con.length;i++){

                System.out.println(con[i][0] + "\t | \t" + con[i][1]);
            }*/

            int min=con[0][1],sat=0;
            for(int k = 0 ; k < con.length;k++){
                if(con[k][1] < min && con[k][1] != 0 ){
                    min = con[k][1];
                    sat = k;
                }
            }
            System.out.println(aranan + " sayıdan büyük aranan sayıya en yakın sayı : "+ con[sat][0]);
        }else {
            System.out.println("diziden olmayan bir sayı girdiniz");
        }


    }
    public static void main(String[] args) {
        int[] list = {65,124,123,12,-123,125,200};
        int[] list1 = {1,2,3,4,5,6,7,8,9,10,0};
        int[] neg = {-1,-2,-3,4,-6,0};
        kucukBul(neg,-1);
        System.out.println("***********************************");
        buyukbul(neg,-1);
        //buyukbul(list,124);










    }
}
