import java.util.*;
public class ques704{
    public static int search(int nums[],int target){
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[]={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(nums,target));
    }
}