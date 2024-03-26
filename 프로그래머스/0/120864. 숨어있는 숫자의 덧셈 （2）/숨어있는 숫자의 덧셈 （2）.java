class Solution {
    public int solution(String my_string) {
        int sum = 0;
        StringBuilder c = new StringBuilder();

        for (char a : my_string.toCharArray()) {
            if (Character.isDigit(a)) { 
                c.append(a);
            } else { 
                if (c.length() > 0) { 
                    sum += Integer.parseInt(c.toString()); 
                    c.setLength(0); 
                }
            }
        }

        
        if (c.length() > 0) {
            sum += Integer.parseInt(c.toString());
        }

        return sum;
    }
}
