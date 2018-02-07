import java.util.Scanner;

class ALTARAY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] ans = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            ans[n - 1] = 1;
            for (int j = n - 2; j >= 0; j--) {
                if ((arr[j] > 0 && arr[j + 1] < 0) || (arr[j] < 0 && arr[j + 1] > 0))
                    ans[j] = ans[j + 1] + 1;
                else ans[j] = 1;
            }
            for (int j = 0; j < n; j++) {
                System.out.print(ans[j] + " ");
            }
            System.out.println();
        }
    }
}