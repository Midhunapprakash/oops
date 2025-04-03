import java.util.Scanner;
class sports{
    String sport;
    int Rating;
    sports(String spo,int ra){
      sport = spo;
      Rating = ra;
     }
    }
    class student extends sports{
      String Grade;
      double Overall_per;
      student(String spo,int ra,String gd,double per ){
            super(spo,ra);
            Grade = gd;
            Overall_per = per;
          }
        }
        public class result extends student {
              result(String spo,int ra,String gd,double per ){
                super(spo,ra,gd,per);
               }
               void display(){
                  System.out.println("\nSports Details of student");
                  System.out.println("Sports :"+sport);
                  System.out.println("Rating :"+Rating);
                  System.out.println("\nAcademic Details of student📚️");
                  System.out.println("Academic Grade :"+Grade);
                  System.out.println("Overall percentage :"+Overall_per);
                 }
                 
                 
                 public static void main(String[] args) {
                 Scanner sc =new Scanner(System.in);
                 System.out.println("\nEnter the sports Details of Student⛹‍♂️️");
                 System.out.println("\n Sport: ");
                 String a =sc.next();
                 System.out.println("\n Sport rating out of 10: ");
                 int b =sc.nextInt();
                 System.out.println("\n Enter thye Academic Details of the Student📚️");
                 System.out.println("\n Academic Grade: ");
                 String c=sc.next();
                 System.out.println("\n Overall Percentage: ");
                 double d =sc.nextDouble();
                 sc.close();
                 result obj=new result(a,b,c,d);
                 obj.display();
                 }
               }
