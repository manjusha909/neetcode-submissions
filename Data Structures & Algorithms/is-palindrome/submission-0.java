class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String clean = "";

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                clean = clean+ch;

            }

        }
        String reverse = "";
        for(int i= clean.length()-1; i>=0; i--)
        {
        reverse = reverse + clean.charAt(i);
    }
    return clean.equals(reverse);
}
}
