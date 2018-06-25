package week1;

public class BestStock {

    public static int maxProfit(int[] prices) {
        int sum = 0;
        for(int i= 0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                sum = prices[i+1] -prices[i]+sum;
            }
        }
        return sum;
    }
    public static void main(String [] args){
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
