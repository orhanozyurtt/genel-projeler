import java.text.DecimalFormat;

public class Harmonik {
    private static final DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {
        //int[] list = new int[3];
        int[] list = {4,6};
        double result=0.0;

        /*for (int i = 0 ; i < list.length; i++){
            list[i] = i+1;
        }*/
        for(int i = 0 ; i < list.length;i++){
    //        result = (list.length) / (1.0/list[i]);
           result += (1.0 / list[i]);
        }


        System.out.println(df.format(list.length / result));



    }
}
