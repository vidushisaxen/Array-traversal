import java.util.*;
class searchtarget{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Input array length");
n=sc.nextInt();
int[] a=new int[n];
System.out.println("Input array elements");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int x,c=0;
System.out.println("Input search element");
x=sc.nextInt();
for(int i=0;i<n;i++){
if(a[i]==x)
c++;
}
if(c>0)
System.out.println("Element found at index: "+c);
else
System.out.println("Element not found");
}
}