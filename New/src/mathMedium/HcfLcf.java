package mathMedium;

public class HcfLcf
{

	public static void main(String[] args) 
	{
		int num1=72,num2=120;
		/*while(num1!=num2)
		{
			if(num1>num2)
			{
				num1=num1-num2;
			}
			else
			{
				num2=num2-num1;
			}
		}
		System.out.println(num1);
		
		
	}

}*/
int hcf=0,lcm=0;
for(int i=1;i<=num1||i<=num2;i++)
{
if(num1%i==0 && num2%i==0)
{
 lcm=i;	
 hcf=i;
}
}
lcm=(num1*num2)/lcm; 
System.out.println("hcf:"+hcf);
System.out.println("lcm:"+lcm);
}}