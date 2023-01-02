import java.util.*;
import java.io.*;
class containermostwater{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int n;
System.out.println("Input the length of array");
n=sc.nextInt();
int[] a=new int[n];
System.out.println("Input array elements");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int area=0;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
area=Math.max(area,Math.min(a[i],a[j])*(j-i));
}
}
System.out.println(area);
}
}
