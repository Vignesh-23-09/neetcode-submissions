class Solution:
    def minWindow(self, s: str, t: str) -> str:
        # Array to store character frequencies (size 256 for ASCII)
        a = [0] * 256
        for c in t:
            a[ord(c)] += 1
            
        l = 0
        cnt = len(t)
        st = 0
        min_len = float('inf')
        
        for r in range(len(s)):
            c = s[r]
            c_ord = ord(c)
            
            # If the character is needed, decrease our missing character counter
            if a[c_ord] > 0:
                cnt -= 1
            a[c_ord] -= 1  # Equivalent to a[c]--
            
            # When all characters are matched, try to shrink the window
            while cnt == 0:
                if r - l + 1 < min_len:
                    min_len = r - l + 1
                    st = l
                
                # Slide left pointer: recover character
                left_char_ord = ord(s[l])
                a[left_char_ord] += 1
                if a[left_char_ord] > 0:
                    cnt += 1
                l += 1
                
        return "" if min_len == float('inf') else s[st : st + min_len]
