
import java.util.Scanner;

public class task15o {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int destroyed = 0;
        boolean removed = true;

        while (removed) {
            removed = false;

            for (int i = 0; i < n; ) {
                int j = i;

                while (j < n && arr[j] == arr[i]) {
                    j++;
                }

                if (j - i >= 3) {
                    destroyed += j - i;

                    for (int k = j; k < n; k++) {
                        arr[k - (j - i)] = arr[k];
                    }

                    n -= (j - i);
                    removed = true;
                    break;
                }

                i = j;
            }
        }

        System.out.println(destroyed);
    }
}
