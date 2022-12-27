import java.util.*;
class largestsmallest{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int a[]=new int[10];
System.out.println("Input array elements");
for(int i=0;i<10;i++){
a[i]=sc.nextInt();
}
int min=a[0],max=a[0];
for(int i=0;i<10;i++){
if(a[i]<min)
min=a[i];
if(a[i]>max)
max=a[i];
}
System.out.println("Largest element="+max);
System.out.println("Smallest element="+min);
}
}