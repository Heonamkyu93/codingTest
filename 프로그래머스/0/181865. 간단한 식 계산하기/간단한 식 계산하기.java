class Solution {
    public int solution(String binomial) {
        String[] a = binomial.split(" ");
        int result = 0;
        switch (a[1]) {
            case "+":
                result = Integer.parseInt(a[0]) + Integer.parseInt(a[2]);
                break;
            case "-":
                result = Integer.parseInt(a[0]) - Integer.parseInt(a[2]);
                break;
            case "*":
                result = Integer.parseInt(a[0]) * Integer.parseInt(a[2]);
                break;
          
        }
        return result;
    }
}
