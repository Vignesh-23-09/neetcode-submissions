class Solution {
    public int maxDifference(String s) {
      Map<Character,Integer> mp= new HashMap<>();
      for(char c:s.toCharArray()) mp.put(c,mp.getOrDefault(c,0)+1);
      int max=0; int min=10000;
        for (int freq : mp.values()) {
            if (freq % 2 == 1)   max = Math.max(max, freq);
             else   min = Math.min(min, freq); 
        }
            return max-min;
    }
}