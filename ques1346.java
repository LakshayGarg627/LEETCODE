import java.util.*;

public class ques1346{
    public static boolean checkIfExist(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i!=j) && (arr[i]==2*arr[j])){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
int arr[]={3,1,7,11};
System.out.println(checkIfExist(arr));
    }
}