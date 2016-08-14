package tw.org.iii.classroom;

public class Test20160814 {

	public static void main(String[] args) {
		int year = 2016;
				
		if(year%4==0)
		{
			if(year%100!=0)
			{
				if(year%400==0)
				{
					System.out.println("是閏年");
				}
				System.out.println("是閏年");
			}
			else if(year%100==0)
			{
				if(year%400!=0)
				{
					System.out.println("不是閏年");
				}
				else if(year%400==0)
				{
					System.out.println("是閏年");
				}
			}
		}
//		else if(year%100==0)
//		{
//			System.out.println("不是閏年");
//		}
//		else if(year%400==0)
//		{
//			System.out.println("是閏年");
//		}
		else
		{
			System.out.println("不是閏年");
		}

	}

}
