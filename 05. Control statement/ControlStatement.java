class ControlStatement{
	public static void main(String args[])
	{
		int parrots=1000;
		int n=0;

		//We don't know how many times the loop will run that's ehy we'll use while loop.

		while(parrots<=1500)
		{
			parrots=(int)(parrots+parrots*0.04);
			n++;
		}
		System.out.println("In "+n+" years parrots population will exceed 1500");
	}
}