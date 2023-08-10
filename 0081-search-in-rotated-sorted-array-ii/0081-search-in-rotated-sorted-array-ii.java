class Solution {
    public boolean search(int[] arr, int x) {
        Arrays.sort(arr);
         int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return true;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }
}