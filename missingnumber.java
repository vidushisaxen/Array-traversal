import java.util.*;
class missingnumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=new int[100];
System.out.println("Input array elements");
for(int i=0;i<100;i++){
a[i]=sc.nextInt();
}
int n=a.length;
int tsum=n*(n+1)/2;
System.out.println("Sum of n elements from 1 to n ="+tsum);
int asum=0;
for(int i=0;i<n-1;i++){
asum=asum+s[i];
}
System.out.println("Sum of array elements="+asum);
int misnum=tsum-asum;
System.out.println("Missing number="+misnum);
}
}

