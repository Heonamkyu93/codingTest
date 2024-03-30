class Solution {
    public String[] solution(String[] str_list) {
       
        int len = str_list.length;
        
       
        int index = 0;
        while (index < len && !(str_list[index].equals("l") || str_list[index].equals("r"))) {
            index++;
        }
        
       
        if (index == len) {
            return new String[0];
        }
        
       
        int size = (str_list[index].equals("l")) ? index : len - index - 1;
        String[] result = new String[size];
        
       
        for (int i = 0; i < size; i++) {
            if (str_list[index].equals("l")) {
                result[i] = str_list[i];
            } else {
                result[i] = str_list[i + index + 1];
            }
        }
        
        return result;
    }
}
