import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
   public  static void main(String[] args) {

       //collect array elements and size from user
        int size;
        int[] Numbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers of digits you want to bubble");
        size = sc.nextInt();
        Numbers = new int[size];

        for(int n = 0; n < size; n++){
            System.out.println("Enter numbers for each operation");
            Numbers[n] = sc.nextInt();
        }
        System.out.println("Numbers before sort are : " +  Arrays.toString(Numbers));

       //Bubble sort logic
        for(int i = 0; i<Numbers.length; i++){
            for(int j = 0; j<Numbers.length-1; j++){
                if(Numbers[j] > Numbers[j+1]){
                    int temp = Numbers[j];
                    Numbers[j] = Numbers[j+1];
                    Numbers[j+1] = temp;
                }
            }
        }
        System.out.println("the result after sort is : " + Arrays.toString(Numbers));
        sc.close();
   }
}
