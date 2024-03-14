class Solution {
    public String solution(String letter) {
       String answer = "";
        String[] mo = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
         char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] a=letter.split(" ");
        for(String b:a){
            for(int i=0;i<mo.length;i++){
                if(b.equals(mo[i])) {answer+=alpha[i];break;}
            }
        }
        
        
        return answer;
    }
}