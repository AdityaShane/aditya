class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{char ch;
	System.out.println("enter the character");
	Scanner s=new Scanner(System.in);
	ch=s.next().charAt(0);
	if(ch>='a'&&ch<='z')
        {System.out.println("input is char");}
	else{System.out.println("input is number");}