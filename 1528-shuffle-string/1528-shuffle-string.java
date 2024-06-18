class Solution {
  public String restoreString(String s, int[] indices) {
    char[] arrChar = new char[indices.length];
 
    for(int i=0; i<indices.length; i++) {
    	arrChar[indices[i]] = s.charAt(i);
    }
 
    String output = String.valueOf(arrChar);
    
    return output;
  }
}