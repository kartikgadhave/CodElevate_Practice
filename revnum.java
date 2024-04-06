public class revnum
{
public static void main(String args[])
{
   int num=1546;
   int a=num%10;
   num=num/10;
   
   int b=num%10;
   num=num/10;

   int c=num%10;
   num=num/10;

 int add=(a*1000)+(b*100)+(c*10)+num;
 System.out.println(add);

}
}