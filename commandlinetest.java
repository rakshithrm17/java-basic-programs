class commandlinetest
{
 public static void main(String args[])
 {
  int i=0,count;
  count=args.length;
  System.out.println("the number of arguments="+count);
  while(i<count)
  {
   System.out.println(args[i]);
   i=i+1;
  }
 }
}  