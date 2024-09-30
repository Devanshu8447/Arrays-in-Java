import java.util.*;

public class maxsubarrays {
    public static void maxsubarrays(int numbers[])  {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i< numbers.length; i++){
            for (int j = i; j< numbers.length; j++) {
                sum = 0;
                for (int k = i; k<=j; k++){

                    sum = sum + numbers[k];
                }
                if (max < sum){
                    max = sum;
                }

            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        int numbers[] = { 2,4,6,8,10};
        maxsubarrays(numbers);
    }
}
