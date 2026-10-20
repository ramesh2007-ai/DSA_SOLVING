class Square_root_binary
	{
		 static int square2(int x)
		{
			int l=1;
			int h=x;
			int ans=0;
			while(l<=h)
			{
				int mid=l+(h-l)/2;
				int sqr=mid*mid;
				if(sqr<=x)
				{
					ans=mid;
					l=mid+1;
				}
				else
				{
					h=mid-1;
				}
			}
			return ans;	
		}
	public static void main(String args[])
	{
		int x=25;
		System.out.println(Square_root_binary.square2(x));
		
		
	}
	
	}