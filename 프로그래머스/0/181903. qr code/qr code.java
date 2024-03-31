class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] a =code.split("");
        for(int i=0;i<a.length;i++){
            if(i%q==r) answer+=a[i];
        }
        return answer;
    }
}