class Solution {
public:
    int numUniqueEmails(vector<string>& e) {
        unordered_set<string> st;
        for(string s:e ){
            int at=s.find('@');
            string lo=s.substr(0,at);
            string d=s.substr(at);
            if(lo.find('+') !=-1) lo=lo.substr(0,lo.find('+'));
            lo.erase(remove(lo.begin(), lo.end(), '.'), lo.end());
            st.insert(lo+d);
        }
        return st.size();
    }
};