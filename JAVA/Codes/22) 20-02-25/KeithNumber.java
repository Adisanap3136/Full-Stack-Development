import java.util.*;
class KeithNumber
{
	public static void main(String[] args)
	{
		int num=19;
		int dup=num;
		int len=0;
		int sum=0;
		boolean flag=true;
		//Loop to get the lenght of number
		for(int i=num;i>0;i/=10)
			len++;
		//we used the len as a size of an array
		int [] arr=new int [len];
		//loop to store the initializa digits from a number
		for(int i=len-1;i>=0;i--){
			int rem=num%10;//fetched the last digit
			arr[i]=rem;//update the number
			num/=10;
		}
		//infinite loop which will iterate
		for( ; ; ){
			//loop to find the sum of digit
			for(int i=0;i<len;i++)
				sum+=arr[i];
			//swapping of element
			for(int i=1;i<len;i++)
				arr[i-1]=arr[i];

			arr[len-1]=sum;

			if(dup==sum)
				break;

			if(sum>dup){
				flag=false;
				break;
			}
			sum=0;
		}
		if(flag)
			System.out.println(dup+" is KEITH NUMBER!");
		else
			System.out.println(dup+" is NOT KEITH NUMBER!");
	}
}
