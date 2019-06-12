class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {        
        //runtime = 5ms weow joy ur so cool 
        List<Integer> l = new ArrayList<Integer>();
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            arr[val-1] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (arr[i] != -1) {
                l.add(i+1);
            }
        }
         return l;
    }
}
