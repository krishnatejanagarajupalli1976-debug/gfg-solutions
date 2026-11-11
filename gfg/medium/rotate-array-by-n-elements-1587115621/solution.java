class Solution {
    public void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;

        int j = 0;
        int k = 0;

        int[] temp = new int[d];

        for(int i = 0; i < d; i++)
        {
            temp[k] = arr[i];
            k++;
        }

        for(int i = d; i < n; i++)
        {
            arr[j] = arr[i];
            j++;
        }

        for(int i = 0; i < d; i++)
        {
            arr[j] = temp[i];
            j++;
        }
    }
}