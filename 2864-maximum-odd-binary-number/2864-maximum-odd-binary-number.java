class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        for(char c: s.toCharArray()) if(c == '1') count += 1;
        int len = s.length();
        StringBuilder stb = new StringBuilder();
        for(int i = 0; i < count - 1; i++) stb.append("1");
        int zero = len - count;
        for(int i = 0; i <zero; i++) stb.append("0");
        stb.append("1");
        return stb.toString();
    }
}