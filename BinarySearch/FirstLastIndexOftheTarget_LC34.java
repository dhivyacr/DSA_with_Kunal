class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};

        int start = binarySearch(nums,target,true);
        int end = binarySearch(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }
    int binarySearch(int[] nums, int target,boolean firststartindex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                ans = mid; //potential found
                
                //tofind the first occurance and last occurance of the potential ans 
                if(firststartindex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }

        return ans;
    }
}
