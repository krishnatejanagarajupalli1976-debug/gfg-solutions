import java.util.Arrays;

class Solution {
    int countPairs(int arr[], int target) {

        Arrays.sort(arr);

        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            int sum = arr[left] + arr[right];

            if(sum == target) {

                if(arr[left] == arr[right]) {
                    int n = right - left + 1;
                    count += (n * (n - 1)) / 2;
                    break;
                }

                int a = arr[left];
                int b = arr[right];

                int c1 = 0;
                int c2 = 0;

                while(left <= right && arr[left] == a) {
                    c1++;
                    left++;
                }

                while(right >= left && arr[right] == b) {
                    c2++;
                    right--;
                }

                count += c1 * c2;
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return count;
    }
}