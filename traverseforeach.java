import java.util.*;
class traverseforeach{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
System.out.println("Input array elements");
for(int i=0;i<10;i++){
a[i]=sc.nextInt();
}
System.out.println("Aftrt traversing");
for(int i:a){
System.out.print(i+" ");
}
}
}
