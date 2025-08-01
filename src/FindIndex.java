import java.util.Arrays;
import java.util.Scanner;
//-----------------------------------find index of element in a nonsorted array
public class FindIndex {
    public static void main(String[] args) {

        int[] numbers = {5,1,4,7,3,6,1,2,1,10,2,3,21,15,11};
        System.out.println(Arrays.toString(numbers));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of this array you want to know its index : ");
        int x = input.nextInt();
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("number found in index : " + i);
            }
        }
    }
}
