class SimpleInterest{
	public static void main(String args[])
	{
		int rateOfInterest=Integer.parseInt(args[0]);
		int years=Integer.parseInt(args[1]);
		int principal=Integer.parseInt(args[2]);
	
		int simpleInterest=(rateOfInterest*years*principal)/100;
		System.out.println(simpleInterest);
	}
}