import java.util.Arrays;
import java.util.Scanner;
//---------------------------------find higher value in a nonsorted array
public class FindHigherValue {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();
        //creation of an array with random values
        int[] numbers = new int[n];


        for (int i = 0; i < n; i++){
            int randomNum = (int)(Math.random()*101);
            numbers[i] = randomNum;
        }
        System.out.println(Arrays.toString(numbers));     //type created array
        int higherValue = numbers[0];
        for (int j = 0; j < numbers.length - 1; j++){      //compare to first array element to find the highest value
            if (numbers[j] > higherValue){
                higherValue = numbers[j];
            }

        }
        System.out.println("higher value of this array is : " + higherValue);
        //type higher value
    }

}
