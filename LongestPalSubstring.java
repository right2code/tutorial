
public class LongestPalSubstring 
{
	public static boolean checkPal(String str)
	{
		int l=str.length();
		int count=0;
		
		if(l==1)
		{
			return false;
		}
		
		for(int i=0;i<l/2;i++)
		{
				if((str.charAt(i))==(str.charAt(l-i-1)))
				{
					count++;
				}
		}
		if(count>=l/2)
		{
			return true;
		}
		return false;
	}
	
	public static int longestPal(String s)
	{
		int l = s.length();
		int temp=0;
		int great;
		if(l==1)
		{
			return 1;
		}
		else if(checkPal(s))
		{
			return l;
		}
		else
		{
			String sub;
			int flag=0;
			for(int i=0;i<l-1;i++)
			{
				for(int j=l;j>=i+1;j--)
				{
					sub=s.substring(i,j);
					great=sub.length();
					if(checkPal(sub) && (great>temp))
					{
						temp=great;
						flag=1;
						break;
					}
				}
				if(flag==1)
					break;
			}
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		String in="malayalam";
		System.out.println(longestPal(in));
	}
}

