class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l=0;
        int h=str.length()-1;
        while(l<h){
            if(str.charAt(l) != str.charAt(h)) return false;
            l++;h--;
        }
        return true;
    }
}