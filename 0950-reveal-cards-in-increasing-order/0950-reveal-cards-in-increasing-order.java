class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Arrays.sort(deck);
        Queue <Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++) {
            q.offer(i);
        }
        int []ans=new int[n];
        for(int num:deck) {
            int ind=q.poll();
            ans[ind]=num;
            if(!q.isEmpty()) {
                q.offer(q.poll());
            }
        }
        return ans;
    }
}