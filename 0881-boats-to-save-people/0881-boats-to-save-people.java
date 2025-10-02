class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int i = 0;
        int n = people.length-1;
        while(i <= n){
            if(people[i]+people[n]<=limit){
                i++;
            }
            n--;
            count++;
        }
        return count;
    }
}