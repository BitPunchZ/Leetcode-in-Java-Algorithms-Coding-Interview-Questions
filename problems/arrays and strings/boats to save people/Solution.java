class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int left = 0;
        int right = people.length - 1;
        int boats_number = 0;
        
        while(left<=right){
            if(left==right){
                boats_number++;
                break;
            }
            if(people[left]+people[right]<=limit){
                right--;
                left++;
            }
            else{
                right--;
            }
            boats_number++;
        }
        return boats_number;
    }
}