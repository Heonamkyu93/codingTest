class Solution {
    public int[] solution(int[] array) {
        int count = 0;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<array.length;i++){
            if(max<array[i]) {max=array[i];
                             count=i;
                             }            
        }
        int[] answer = {max,count};
        return answer;
    }
}