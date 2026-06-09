class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        s = s.toLowerCase(); 
        while(start<=end) {

            char ch1 = s.charAt(start);
            char ch2 = s.charAt(end);

            if(!Character.isLetterOrDigit(ch1)){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch2)){
                end--;
                continue;
            }
        //    System.out.println(s.charAt(start) + "   " + s.charAt(end));
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
