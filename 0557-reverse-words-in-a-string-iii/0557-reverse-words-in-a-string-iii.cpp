class Solution {
public:
    string reverseWords(string s) {
       stringstream ss(s);
        string w,l;
        while(ss>>w){
            reverse(w.begin(),w.end());
            l+=w;
            l.push_back(' ');
        }
        l.pop_back();
        return l;
    }
};