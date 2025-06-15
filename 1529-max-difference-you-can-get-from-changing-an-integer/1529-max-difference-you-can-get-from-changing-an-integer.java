
     class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);

        // -------- Maximum value --------
        int maxNum = num;
        for (char c : s.toCharArray()) {
            if (c != '9') {
                maxNum = Integer.parseInt(s.replace(c, '9'));
                break;
            }
        }

        // -------- Minimum value --------
        int minNum = num;
        if (s.charAt(0) == '1') {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != '1' && s.charAt(i) != '0') {
                    minNum = Integer.parseInt(s.replace(s.charAt(i), '0'));
                    break;
                }
            }
        } else {
            minNum = Integer.parseInt(s.replace(s.charAt(0), '1'));
        }

        return maxNum - minNum;
    }
}