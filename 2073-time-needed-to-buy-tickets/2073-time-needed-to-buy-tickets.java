class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue <int []> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++) {
            q.offer(new int[]{tickets[i],i});
        }
        int t=0;
        while(!q.isEmpty()) {
            int curr[]=q.poll();
            curr[0]--;
            t++;
            if(curr[1]==k && curr[0]==0) {
                return t;
            }
            if(curr[0]>0) {
                q.offer(curr);
            }
        }
        return t;
    }
}