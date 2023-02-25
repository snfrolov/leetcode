package Roman_to_Integer;

import java.util.HashMap;

class Solution {
    public int romanToInt(String number) {
        int n = number.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = map.get(number.charAt(i));
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || nums[i] >= nums[i + 1]) {
                sum += nums[i];
            } else {
                sum -= nums[i];
            }
        }
        return sum;
    }
}