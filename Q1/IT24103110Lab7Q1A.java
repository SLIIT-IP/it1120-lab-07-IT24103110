import java.util.Scanner;
public class IT24103110Lab7Q1A
{
	public static void main(String[]args) 
	{
		
		System.out.println("\n");
		System.out.println("Enter marks for four subject :");
		System.out.println("\n");

		
		Scanner input=new Scanner(System.in);
		double marks[] = new double[4];
		double total = 0;
		for(int i=0;i<marks.length;i++)
		{
			System.out.print("Enter mark "+(i+1)+": ");
			marks[i] = input.nextInt();
		}
		for(int i=0;i<marks.length;i++)
		{
			total+=marks[i];
		}
		double Average = total/4;
		System.out.println("\n");
		System.out.println("Average is : "+(Average));
		
		String grade="";
		if(Average<50)
			grade="Fail";
		
		
		if(Average>49 && Average<75)
			grade="Credit";
		
		if(Average>74 && Average<101)
			grade="Distination";
		System.out.println("Overall Grade is : "+grade);

	}
}