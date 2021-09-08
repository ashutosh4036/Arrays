public class BuyandSellStock {
    public static int maxprofit(int[]prices){
        int minprice = Integer.MAX_VALUE;
        int maxprofit=0;
        for (int price : prices) {
            if (price < minprice)
                minprice = price;
            else if (price - minprice > maxprofit)
                maxprofit = price - minprice;
        }
        System.out.println(maxprofit);
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] arr= {7,1,5,3,6,4};
        maxprofit(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
