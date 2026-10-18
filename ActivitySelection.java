
import java.util.*;

public class ActivitySelection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = sc.nextInt();
            activities[i][1] = sc.nextInt();
        }
        Arrays.sort(activities, (a, b) -> a[1] - b[1]);

        int count2 = 0;
        int lastFinish = 0;
        for (int i = 0; i < n; i++) {
            int start = activities[i][0];
            int finish = activities[i][1];

            if (start >= lastFinish) {
                count2++;
                lastFinish = finish;
            }
        }
        System.out.println(count2);
        sc.close();
    }
}
