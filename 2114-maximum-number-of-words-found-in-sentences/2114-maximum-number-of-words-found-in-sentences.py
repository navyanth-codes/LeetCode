class Solution:
    def mostWordsFound(self, ss: List[str]) -> int:
        n=len(ss)
        ans=0
        for i in range(n):
            z=ss[i].split(" ")
            ans=max(ans,len(z))
        return ans