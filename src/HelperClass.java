public class HelperClass {
    static  int[] sortArray(int[]arr){
        for (int i=0; i<arr.length;i++){
            for (int k = i+1; k<arr.length; k++){
                int temp = arr[i];
                if (arr[i]>arr[k]){
                    arr[i]=arr[k];
                    arr[k]=temp;
                }
            }

        }
        return arr;
    }
}
