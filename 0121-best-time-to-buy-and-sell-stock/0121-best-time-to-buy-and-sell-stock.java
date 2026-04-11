class Solution {
    public int maxProfit(int[] prices) {
        int mp=0,p=0,cp;
        cp=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++) {
            if(prices[i]<cp) 
                cp=prices[i];
            else 
            p=prices[i]-cp;
            if(p>mp)
            mp=p;
        }
        return mp;
    }
}