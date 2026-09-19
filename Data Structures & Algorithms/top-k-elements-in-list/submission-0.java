
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> lst = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int i : nums)
            mp.put(i, mp.getOrDefault(i, 0) + 1);
       
        for (int i : mp.keySet()) 
            lst.add(i);
      
        lst.sort((a, b) -> mp.get(b) - mp.get(a));
       
        List<Integer> topKList = lst.subList(0, k);
       
        return topKList.stream().mapToInt(i -> i).toArray();
    }
}
