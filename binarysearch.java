import java.util.*;
class binarysearch{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Input array length");
n=sc.nextInt();
int[] a=new int[n];
System.out.println("Input array elements in sorted manner");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int l=0,u=n-1;
int mid=(l+u)/2;
int x;
System.out.println("Input search element");
x=sc.nextInt();
while(l<=u){
mid=(l+u)/2;
if(a[mid]<x){
l=mid+1;
}
else if(a[mid]==x){
System.out.println("Element found at index"+mid);
break;
}
else{
u=mid-1;
}
}
}
}
