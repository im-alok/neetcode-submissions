class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.MAX_VALUE);
        list.add(Integer.MAX_VALUE);

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if((nums[i] + nums[j]) == target) {
                    list.set(0, Math.min(list.get(0), i));
                    list.set(1, Math.min(list.get(1), j));
                }
            }
        }

        if(list.get(0) == Integer.MAX_VALUE || list.get(1) == Integer.MAX_VALUE)
            return new int[0];
            
        int[] arr = new int[list.size()];

        arr[0] = list.get(0);
        arr[1] = list.get(1);

        return arr;
    }
}
