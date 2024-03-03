class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] a = my_string.toCharArray();
        char c=a[num1];
        a[num1]=a[num2];
        a[num2]=c;
        
        
        for(int i=0;i<a.length;i++){
         answer+=a[i];   
        }
        
        
        return answer;
    }
}