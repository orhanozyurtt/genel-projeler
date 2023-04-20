public class ModArr {

    static boolean isFind(int[] arr,int value){
        for (int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] list = {1,1,2,2,3,3,3,3,3,3,4,4,5,6,7,6,9,9,9,8,9,9,9,98,8};
        int[] newList = new int[list.length];
        int startIndex=0;

        for (int i = 0 ; i < list.length;i++){

            for(int j = i+1; j < list.length;j++){
                if((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)){
                    if(!isFind(newList,list[i])){
                        newList[startIndex++] = list[i];
                    }
                    break;
                }

            }
        }
        for (int x : newList ){
            if(x != 0){
                System.out.print(x + " ");

            }
        }


        /*
        for (int i = 0 ; i < list.length;i++){

            for(int j = i+1; j < list.length;j++){
                if((i != j) && (list[i] == list[j])){
                    if(!isFind(newList,list[i])){
                        newList[startIndex++] = list[i];
                    }
                    break;
                }

            }
        }
        for (int x : newList ){
            if(x != 0){
                System.out.print(x + " ");

            }
        }
*/
    }
}
