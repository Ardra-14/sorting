import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public void process(int[] arr,int n) throws NegativeNumberExceptions {
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i< arr.length; i++){
            if(arr[i] < 0) {
                throw new NegativeNumberExceptions("Array contains negative number");
            }
        }
        Arrays.sort(arr,0,n);

        System.out.println("Enter the element to insert: ");
        int element = sc.nextInt();
         if(element < 0){
                throw new NegativeNumberExceptions("Element should be positive number");
         }

        int i = n - 1;
        while (i >= 0 && arr[i] > element) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = element;

        System.out.println("Sorted array after insertion: " + Arrays.toString(arr));
    }
    }



