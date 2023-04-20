public class CokBoyutluHarf {
    public static void main(String[] args) {
        String[][] matris = new String[7][4];

        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++){
                if(i==0 || i==3 || i==6 || j==0 || j==3){
                    matris[i][j] = " * ";
                }else {
                    matris[i][j] = "   ";
                }
            }
        }
        for(String[] row: matris) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
