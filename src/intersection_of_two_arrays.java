import java.util.*;
// LeetCode #349 - Intersection of Two Arrays
class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) set1.add(n);
        Set<Integer> res = new HashSet<>();
        for (int n : nums2) {
            if (set1.contains(n)) res.add(n);
        }
        int[] ans = new int[res.size()];
        int i = 0;
        for (int n : res) ans[i++] = n;
        return ans;
    }
}
