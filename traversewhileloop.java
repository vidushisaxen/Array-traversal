import java.util.*;
class traversewhileloop{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
System.out.println("input array elements");
for(int i=0;i<10;i++){
a[i]=sc.nextInt();
}
System.out.println("Array traversing");
int i=0;
while(i<10){
System.out.print(a[i]+" ");
i++;
}
}
}
