import java.util.*;
// LeetCode #560 - Subarray Sum Equals K
class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, prefix = 0;
        for (int n : nums) {
            prefix += n;
            count += map.getOrDefault(prefix - k, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}
