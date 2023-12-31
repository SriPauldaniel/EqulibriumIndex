import java.util.Scanner;
public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findEqulibriumIndex(arr, n));
    }

    static int findEqulibriumIndex(int[] arr,int n) {
        int[] arr1 = new int[n];
        int sum = arr[0];
        arr1[0] = sum;
        for(int i=1;i<n-1;i++) {
            sum += arr[i];
            arr1[i] = sum;
        }
        int i=0;
        if(arr1[n-1]-arr1[i] == 0){
            return 0;
        }
        for(i=1;i<n;i++) {
            if(arr1[i-1] == arr1[n-1]-arr1[i]) {
                return i;
            }
        }
        if(arr1[n-2] == 0) {
            return n-1;
        }
        return -1;
    }
}
