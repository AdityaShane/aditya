class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{char ch;
	System.out.println("enter the character");
	Scanner s=new Scanner(System.in);
	ch=s.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){System.out.println("input is vowel");}
	else{System.out.println("input is consonant");}