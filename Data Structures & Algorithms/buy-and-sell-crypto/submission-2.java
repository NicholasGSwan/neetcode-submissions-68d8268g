class Solution {
    public int maxProfit(int[] prices) {
        int L = 0;
		int R = 1;
		int max = 0;

		while (R < prices.length) {
			if(prices[L] > prices[R]){
				L = R;
			}else {
				max = Math.max(max, prices[R] - prices[L]);
			}
			R++;
		}
		return max;
    }
}
