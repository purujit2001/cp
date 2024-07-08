class Solution {
    public String largestOddNumber(String num) {
      int n = num.length()-1;
      for(int i=n;i>=0;i--){
        char c=num.charAt(i);
        if(c%2==1){
            return num.substring(0,i+1);
        }
        
      }  return "";
    }
}