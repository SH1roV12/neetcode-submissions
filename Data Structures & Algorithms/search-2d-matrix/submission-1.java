class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int right = matrix.length-1;
        int mid;
        int left = 0;
        int needRow = -1;
        while (left <= right){
            mid = left + ((right - left)/2);
            if (matrix[mid][0] <= target && target <= matrix[mid][matrix[mid].length-1]){
                needRow = mid;
                break;
            }
            if (target < matrix[mid][0]){
                right = mid-1;
                continue;
            }
            if (target > matrix[mid][matrix[mid].length-1]){
                left = mid+1;
                continue;
            }
        }
        if (needRow == -1){
            return false;
        }
        left = 0;
        int[] needArr = matrix[needRow];
        right = needArr.length-1;
        while (left <= right){
            mid = left + ((right - left)/2);
            
            if (needArr[mid] == target){
                return true;
            }
            if (needArr[mid] > target){
                right = mid-1;
                continue;
            }
            if (needArr[mid] < target){
                left = mid+1;
                continue;
            }
        }
        return false; 
    }
}
