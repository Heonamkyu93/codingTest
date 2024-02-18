class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<index_list.length;i++){
            char ch = my_string.charAt(index_list[i]);
            sb.append(ch);
        }
        
        
        
        
        
        
        
        
     
        return sb.toString();
    }
}