import java.util.Scanner;
class GradeCalculator
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Number of Subjects:");
      int n=s.nextInt();
      double totalmarks=0;
      for(int i=0;i<n;i++)
        {
          System.out.println("Enter marks for subject "+(i+1)+":");
          double marks=s.nextDouble();
          totalmarks+=marks;
        }
      System.out.println("Total marks:"+totalmarks);
      double average=totalmarks/n;
      System.out.println("Average marks:"+average);
      if(average>=90)
      {
        System.out.println("Grade:A");
      }
      else if(average>=80)
      {
        System.out.println("Grade:B");
      }
      else if(average>=70)
      {
        System.out.println("Grade:C");
      }
      else if(average>=60)
      {
        System.out.println("Grade:D");
      }
      else
      {
        System.out.println("Grade:F");
      }
      s.close();
    }
  }
