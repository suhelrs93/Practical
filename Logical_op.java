class Logical_op{

public static void main(String args[]){
int a = 10;
int b = 5;
int c = 20;

System.out.println(a>b && a<c);// true
System.out.println(a==b || b>c);// false
System.out.println(a>c && b<a);// false
System.out.println(a<c || b>a);// true

}
}