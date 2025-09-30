class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int pile:piles){
            r = Math.max(pile,r);
        }
        while(l<r){
            int mid = (l+r)/2;
            if(caneat(piles,h,mid)){
                r=mid;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
    public boolean caneat(int[] piles,int h,int s){
        long time=0;
        for(int p:piles){
            time+=(p+s-1)/s;
        }
        return time<=h;
    }
} 
