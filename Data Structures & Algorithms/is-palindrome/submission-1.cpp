#include <string>
#include <algorithm>
#include <cctype>

using namespace std;

class Solution {
public:
    bool isPalindrome(string s) {
        // 1. Convert everything to lowercase
        transform(s.begin(), s.end(), s.begin(), ::tolower);
        
        // 2. Remove all non-alphanumeric characters
        s.erase(remove_if(s.begin(), s.end(), [](char c) {
            return !isalnum(c);
        }), s.end());
        
        // 3. Check if it reads the same backwards
        return equal(s.begin(), s.begin() + s.size() / 2, s.rbegin());
    }
};
