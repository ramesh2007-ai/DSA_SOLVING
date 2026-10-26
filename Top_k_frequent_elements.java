import java.util.*;
class Top_k_frequent_elements
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the n:");
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 System.out.println("Enter the array elements:");
	 for(int i=0;i<n;i++)
	 {
		arr[i]=sc.nextInt();	
	 }
	 System.out.println("Enter the k:");
	 int k=sc.nextInt();
	 TreeMap<Integer,Integer> tm=new TreeMap<>();
	 for(int x:arr)
	 {
		tm.put(x,tm.getOrDefault(x,0)+1);
	 }
		ArrayList<Integer>al=new ArrayList<>();
		al.addAll(tm.keySet()); 
		al.sort((a,b)->tm.get(b)-tm.get(a)); 
		for(int i=0;i<k&&i<al.size();i++) 
		{ 
		System.out.print(al.get(i)+" "); 
		}
	}
}