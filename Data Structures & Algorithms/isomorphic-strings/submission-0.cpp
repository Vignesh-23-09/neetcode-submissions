class Solution {
public:
    bool isIsomorphic(string s, string t) {
        // If lengths don't match, they cannot be isomorphic
        if (s.length() != t.length()) return false; 
        
        unordered_map<char, char> mapStoT;
        unordered_map<char, char> mapTtoS;
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s[i];
            char charT = t[i];
            
            // Check mapping from S to T
            if (mapStoT.count(charS) && mapStoT[charS] != charT) {
                return false;
            }
            
            // Check mapping from T to S
            if (mapTtoS.count(charT) && mapTtoS[charT] != charS) {
                return false;
            }
            
            // Establish the bidirectional mapping
            mapStoT[charS] = charT;
            mapTtoS[charT] = charS;
        }
        
        return true;
    }
};
