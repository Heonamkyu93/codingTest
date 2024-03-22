import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        switch (n) {
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                break;
            case 4:
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    arrayList.add(num_list[i]);
                }
                answer = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    answer[i] = arrayList.get(i);
                }
                break;
        }

        return answer;
    }
}