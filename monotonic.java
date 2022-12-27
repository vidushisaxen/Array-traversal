import java.util.*;
class monotonic{
static boolean mono(int a[]){
boolean i=true;
boolean d=true;
for(int i=0;i<9;i++){
if(arr[i]>arr[i+1])
i=false;
}
for(int i=0;i<9;i++){
if(arr[i]<arr[i+1])
d=false;
}
return i||d;
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a[]=new int[15];
System.out.println("Input array elements");
for(int i=0;i<10;i++){
a[i]=sc.nextInt();
}
boolean ans=mono(a);
if(ans==true)
System.out.println("The array is monotonic");
else
System.out.println("The array is not monotonic");
}
}

