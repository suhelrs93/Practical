class Unary_op{

public static void main(String args[]){
int a = 10;
int b = 10;

System.out.println(a++);// increamenting by 1 postfix 10 (11)
System.out.println(++a);// increamenting by 1 prefix 12
System.out.println(a--);// decreamenting by 1 postfix 12 (11)
System.out.println(--a);// decreamenting by 1 pretfix 10

System.out.println(a++ + ++b);//10(11),11--  21=10+11
System.out.println(++a + a++);//12,12(13)--  24=12+12
System.out.println(b++ + ++a);//11(12),14--  25=11+14

System.out.println(a-- + --b);//(14+11=25)
System.out.println(--a + a--);//(12+12=24)
System.out.println(b-- + --a);//(11+10=21)
}
}