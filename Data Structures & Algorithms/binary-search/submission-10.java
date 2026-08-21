class Solution {
    public int search(int[] nums, int target) {
         
        int right = nums.length-1;
        int mid;
        int left = 0;
        while (left <= right){
            mid = left + ((right-left)/2);
            System.out.println(mid);
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                left = mid+1;
                continue;
            }
            if (nums[mid] > target){
                right = mid-1;
                continue;
            }
        }
        return -1;
    }
    }

