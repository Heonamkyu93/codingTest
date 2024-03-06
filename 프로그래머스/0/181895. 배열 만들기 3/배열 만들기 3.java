class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int first = intervals[0][0];
        int first2 = intervals[0][1];
        
        int second = intervals[1][0];
        int second2= intervals[1][1];
        int l = (first2-first+1)+(second2-second+1);
        int[] answer=new int[l];
       
        int idx=0;
      for(int i=first;i<=first2;i++){
          answer[idx++]=arr[i];
      }
        for(int j=second;j<=second2;j++){
            answer[idx++]=arr[j];
        }
        
        return answer;
    }
}