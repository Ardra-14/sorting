import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of elements in array: ");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("Array size is zero");
            return;
        }

        int[] arr = new int[n + 1];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sorting s = new sorting();
        while (true) {
            try {
                s.process(arr,n);
                break;

            } catch (NegativeNumberExceptions e) {
                System.out.println(e.getMessage());
            }
        }
    }
}