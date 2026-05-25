class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue <int []> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++) {
            q.offer(new int[]{i,tickets[i]});
        }
        int t=0;
        while(!q.isEmpty()) {
            int []person=q.poll();
            int ind=person[0];
            int rem=person[1];
            rem--;
            t++;
            if(rem==0) {
                if(ind==k) {
                    return t;
                }
            }
            else {
                q.offer(new int[]{ind,rem});
            }
        }
        return t;
    }
}