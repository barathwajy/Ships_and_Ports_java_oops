package shipping;

public class Container implements BasicContainer,HeavyContainer,LiquidContainer,RefrigeratedContainer{

	@Override
	public void refrigerated() {
		// TODO Auto-generated method stub
		System.out.print(weightRC);
		System.out.print(rtype);
	}

	@Override
	public void liquid() {
		// TODO Auto-generated method stub
		System.out.print(weightLC);
		System.out.print(ltype);		
	}

	@Override
	public void heavy() {
		// TODO Auto-generated method stub
		System.out.print(weightHC);
		System.out.print(htype);
	}

	@Override
	public void basic() {
		// TODO Auto-generated method stub
		System.out.print(weightBC);
		System.out.print(btype);
	}
	
	
	
}
