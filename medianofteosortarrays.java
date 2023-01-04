import java.util.*;
import java.io.*;
public class medianofteosortarrays{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int m,n;
System.out.println("Input the length of two arrays");
m=sc.nextInt();
n=sc.nextInt();
int[] a=new int[m];
int[] b=new int[n];
System.out.println("Input elements of first array");
for(int i=0;i<m;i++){
a[i]=sc.nextInt();
}
System.out.println("Input elements of second array");
for(int i=0;i<n;i++){
b[i]=sc.nextInt();
}
int x=m+n;
int median=0;
int[] c=new int[x];
for(int i=0;i<m;i++){
c[i]=a[i];
}
for(int i=0;i<n;i++){
c[m+i]=b[i];
}

Arrays.sort(c);
for(int i=0;i<x;i++){
System.out.print(c[i]+" ");
}
if(x%2==0){
median=(c[x/2]+c[(x/2)+1])/2;
System.out.println("the median is " + median);
}
else
median=c[x/2];
System.out.println("the median is " + median);
}
}