
class Solution {
    public int numUniqueEmails(String[] s) {
       Set<String> set=  new HashSet<>();
        for(String e:s){
            int at=e.indexOf('@');
            String lo=e.substring(0,at);
            String d=e.substring(at);
            if(lo.contains("+")) lo=lo.substring(0,lo.indexOf('+'));
            lo=lo.replace(".","");
            set.add(lo+d);
        }
        return set.size();
    }
}
