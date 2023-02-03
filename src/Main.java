import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("array size : ");
        int size =input.nextInt();
        System.out.println("enter array values: ");
        int[] myArray =new int[size];

        for (int i = 0; i<size; i++){
            int value = input.nextInt();
            myArray[i]+=value;
            System.out.println( i +" value : " + myArray[i]);

        }
        Arrays.sort(myArray);
        System.out.println("my new Array is : " +  Arrays.toString(myArray));


    }


}