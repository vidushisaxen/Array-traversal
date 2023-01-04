import java.util.*;
class rotateleft{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Input the length of array");
n=sc.nextInt();
int[] a = new int[n];
System.out.println("Input array elements");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int[] temp=new int[n];
int d;
System.out.println("Input units for left rotation");
d=sc.nextInt();
int k=0;
for(int i=d;i<n;i++){
temp[k]=a[i];
k++;
}
for(int i=0;i<d;i++){
temp[k]=a[i];
k++;
}
for(int i=0;i<n;i++){
a[i]=temp[i];
}
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
}


