class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int[] answer = new int[2];

        while (left < right) {
            while (left < right && numbers[left] + numbers[right] > target) {
                right--;
            }

            while (left < right && numbers[left] + numbers[right] < target) {
                left++;
            }

            if (left < right && numbers[left] + numbers[right] == target) {
                answer = new int[] {left + 1, right + 1};
                break;
            }
        }

        return answer;
    }
}
