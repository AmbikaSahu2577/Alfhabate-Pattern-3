class AlfhabatePattern_3
{
	public static void main(String[] args) 
	{
		for (char i = 'A';i<= 'D'; i++) 
		{
			for (char j=i;j>='A' ;j--) 
			{
			   System.out.print(j);	
			}
			System.out.println();
		}
		for (char j = 'E'; j >= 'A'; j--) 
	{
		for (char i = j; i >= 'A'; i--) 
		{
			System.out.print(i);
		}
		System.out.println();
	}
	}
}