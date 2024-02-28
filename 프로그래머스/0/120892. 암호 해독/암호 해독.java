class Solution {
    public String solution(String cipher, int code) {
        
        String answer = "";
        char[] a =cipher.toCharArray();
     for(int i=code-1;i<a.length;i+=code){
         answer+=a[i];
     }
        
        
        return answer;
    }
}