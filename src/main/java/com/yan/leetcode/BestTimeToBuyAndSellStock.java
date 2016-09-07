package com.yan.leetcode;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int min = Integer.MAX_VALUE;
        int[] maxProfit = new int[prices.length];
        if (prices[0] < min)
            min = prices[0];
        int profit;
        maxProfit[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            profit = prices[i] - min;
            maxProfit[i] = Math.max(maxProfit[i - 1], profit);
        }
        return maxProfit[prices.length - 1];
    }
}
