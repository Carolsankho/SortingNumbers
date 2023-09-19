//using built-in function
import java.util.*;
public class SortFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        System.out.println("Sorted numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
