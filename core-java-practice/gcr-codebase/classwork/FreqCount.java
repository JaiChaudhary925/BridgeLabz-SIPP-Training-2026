import java.util.*;

class FreqCount{
	public static void main(String args[]){
		int digit=12334577;
		int n=(int) Math.log10(digit)+1;
		int arr[]=new int[n];
		int freq[]=new int[10];
		int temp=digit;
		int i=0;
		while(temp!=0){
			arr[i]=temp%10;
			temp/=10;
			i++;
		}
		for(int j=0; j<10;j++){		
		int count=0;
		int k=0;
			while(k<n){
			if(arr[k]==j){
				count++;			
	}
	k++;
			}
	freq[j]=count;
		}
		  for (int m = 0; m < 10; m++) {
            if (freq[m] > 0) {
                System.out.println("Digit " + m + ": " + freq[m] + " time(s)");
            }
        }
    }
}
