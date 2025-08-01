import java.util.Arrays;
//---------------------------------Mathematical MEAN calculator of random 10 values
public class FindMathMean {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i =0; i < 10; i++) {                     //generate random values
            int creatValue = (int)(Math.random()*10);
            numbers[i] = creatValue;
        }
            int sum = 0;
        for (int i =0; i < 10; i++) {                 //sum of values
            sum = sum + numbers[i];
        }
            int mathMean = sum/10;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Mean result is : " + mathMean);
    }
}
