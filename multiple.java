class student
{
 int rollnumber;
 void getnumber(int n)
 {
  rollnumber=n;
 }
void putnumber()
{System.out.println("rollnumber:"+rollnumber);
}
}
class test extends student
{ float part1,part2;
void getmarks(float m1,float m2) 
{
 part1=m1;
 part2=m2;
}
void putmarks()
{
 System.out.println("marks obtained");
 System.out.println("part1="+part1);
 System.out.println("part2="+part2);
 }
}
interface sports
{float sportwt=6.0f;
 void putwt();
}
class results extends test implements sports
{
 float total;
 public void putwt()
{System.out.println("sport wt="+sportwt);
}
void display()
{ total=part1+part2+sportwt;
putnumber();
putmarks();
putwt();
System.out.println("total score="+total);
}
}
class multiple
{public static void main(String args[])
{
 results stud=new results(); 
 stud.getnumber(1234);
 stud.getmarks(27.5f,33.0f);
 stud.display();
 }
 }