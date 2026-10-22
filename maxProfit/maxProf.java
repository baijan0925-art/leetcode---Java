class maxProf {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) throws Exception {

        maxProf solution = new maxProf();
        int[] prices = {5,1,5,6,8,1};

        System.out.print(solution.maxProfit(prices));
    }
}

/*

1) iterate over the array prices to find the values of the elements
2) minPrice the first element and if next value smaller reasign
3) create a variable profit = price[i] - minPrice
4) keep track of profit and if new value is bigger then reassign
5) setup maxProfit = 0 if no profit
6) return profit




 */