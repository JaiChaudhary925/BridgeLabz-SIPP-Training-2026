import java.util.*;

class TwoSum{
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,7,8};
		int target=9;
		for(int i=0;i<arr.length;i++){
			int j=i+1;
			while(j<arr.length){
				if(arr[i]+arr[j]==target){
					System.out.println(arr[i]+" + "+arr[j]+" = "+target);
				}
				else{
					j++;
				}
				j++;
			}
		}
	}
}
			