class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count=0, maxFeq=0;
        Map<Integer, Integer> map= new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
            maxFeq=Math.max(maxFeq, map.get(i));
        }

        for(int i: map.values()){
            if(i==maxFeq){
                count+=i;
            }
        }
        return count;
    }
}
