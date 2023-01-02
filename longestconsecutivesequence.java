import java.util.*;
import java.io.*;
class longestconsecutivesequence{
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
Arrays.sort(a);
int ans=0,c=0;
ArrayList<Integer> list=new ArrayList<>();
list.add(a[0]);
for(int i=1;i<n;i++){
if(a[i]!=a[i-1])
list.add(a[i]);
}
for(int i=0;i<list.size();i++){
if(i>0 && list.get(i)==list.get(i-1)+1){
c++;
}
}
ans=Math.max(ans,c);
System.out.println(ans);
}
}






