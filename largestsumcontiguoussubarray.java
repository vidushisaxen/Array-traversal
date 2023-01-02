import java.util.*;
class largestsumcontiguoussubarray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Input length of array");
n=sc.nextInt();
int[] a=new int[n];
System.out.println("Input array elements");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int csum=0,msum=0;
for(int i=0;i<n;i++){
csum=csum+a[i];
if(csum>msum)
msum=csum;
if(csum<0)
csum=0;
}
System.out.println(msum);
}
}