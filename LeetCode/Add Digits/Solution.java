class Solution {
    public int addDigits(int num) {
        int ans = ( num - 1 ) % 9 + 1 ;
        return ans;
    }
}