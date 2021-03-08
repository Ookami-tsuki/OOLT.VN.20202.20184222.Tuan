import java.util.Scanner;
public class SortArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int [] arr = new int [n];
        System.out.print("Enter the elements of the array: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        // sắp xếp dãy số theo thứ tự tăng dần
        sortArr(arr);
        System.out.println("Array Sort ");
        show(arr);
        SumArr(arr);
    }
 public static void sortArr(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void SumArr(int [] arr) {
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            k+=arr[i];
        }
        System.out.println("Sum of Array : "+k);
        System.out.println("Average of Array: "+(double)k/arr.length);
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}