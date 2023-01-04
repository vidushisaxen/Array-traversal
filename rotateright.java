import java.util.*;
class rotateright{
 static void reversearray(int[]a,int start,int end){
while(start<end){
int temp=a[start];
a[start]=a[end];
a[end]=temp;
start++;
end--;
}
}
static void right(int[]a,int d,int n){
reversearray(a,0,n-1);
reversearray(a,0,d-1);
reversearray(a,d,n-1); 
}
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
System.out.println("Input units for right rotation");
d=sc.nextInt();
right(a,d,n);

for(int i=0;i<n;i++){
System.out.println(a[i]+" ");
}
}
}








