import java.util.*;
class TestUserData
{
	public static void main(String args[])
	{
		TreeSet<Integer> tree=new TreeSet<Integer>();
		int a;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter Value, pass 0 to quit");
			a=sc.nextInt();
			if(a!=0)
			{
				if(tree.add(a))
				{
					System.out.println("Data Submitted");
				}
				else
				{
					System.out.println("Data not Submitted, Duplicate Data Found");
				}
			}
		}
		while(a!=0);
		System.out.println("Number Of Elements: " +tree.size());
		System.out.println("You have Entered: \n" +tree);
	}
}