public class MatrisTranspoz {
    static void printMatris(int[][] matris){
        for (int i = 0 ; i < matris.length;i++){
            for (int j = 0; j < matris[0].length;j++){
                System.out.print(matris[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //int[][] matris = new int[5][3];
        int[][] matris = {{2,3,4},{5,6,4}};
        int[][] trans = new int[matris[0].length][matris.length];
        int number=1;

        for (int i = 0 ; i < matris.length;i++){
            for (int j = 0 ; j < matris[0].length;j++){
                matris[i][j] = number++;
            }
        }

        for (int k = 0 ; k < matris[0].length;k++){
            for (int a = 0; a < matris.length;a++){
                trans[k][a] = matris[a][k];
            }
        }
        printMatris(matris);
        System.out.println();
        printMatris(trans);



/*
        printMatris(matris);
        printMatris(trans);
        */

    }
}
