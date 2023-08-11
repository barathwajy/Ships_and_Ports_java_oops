package shipping;

public abstract class Bill_Generate {
	
	abstract double surcharges(double a,int i);
	
	double charges(int no_Of_Bc, int no_Of_Lc, int no_Of_Hc, int no_Of_Rc)
	{
		double c = 500.0*no_Of_Bc+1000.0*no_Of_Lc+1200.0*no_Of_Hc+1500.0*no_Of_Rc;
		return c;
		
	}
}
