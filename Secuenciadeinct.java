import java.util.*;

public class Secuenciadeinct {

    public static int[] holasoyjordipaul(int[] nums) {
        if (nums.length == 0) return new int[0];
        
        int[] dp = new int[nums.length];
        int[] prev = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        
        int maxLength = 0, lastIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                lastIndex = i;
            }
        }
        
        List<Integer> lis = new ArrayList<>();
        for (int i = lastIndex; i >= 0; i = prev[i]) {
            lis.add(nums[i]);
            if (prev[i] == -1) break;
        }
        
        Collections.reverse(lis);
        return lis.stream().mapToInt(Integer::intValue).toArray();
    }
    //--------------------------------------
    public static void main(String[] args) {
        int[] nums = {18, 19, 14, 22, 26, 31, 26, 12};
        int[] result = holasoyjordipaul(nums);
        System.out.println(Arrays.toString(result));
    }
}