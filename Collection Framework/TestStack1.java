import java.util.*;
class TestStack1
{
	public static void main(String args[])
	{
		Stack <Integer> st=new Stack <Integer>();
		st.push(5);
		st.push(6);
		st.push(2);
		st.push(4);
		st.push(3);
		st.push(1);
		st.push(1);
		System.out.println(st);

		st.pop();
		st.pop();
		st.pop();
		System.out.println(st);
	}
}