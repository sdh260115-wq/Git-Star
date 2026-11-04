class Solution {
    public int solution(int[] array) {
        int[] count = new int[1001];
        
        for (int num : array) {
            count[num]++;
        }
        
        int maxCount = 0;
        int answer = 0;
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                answer = i;
            } 
            else if (count[i] == maxCount && maxCount != 0) {
                answer = -1;
            }
        }
        
        return answer;
    }
}
