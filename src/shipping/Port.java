package shipping;

import java.util.ArrayList;

public class Port {
	
	static ArrayList<Port> Ports = new ArrayList<Port>();
	
	
	public Port(String portid) {
		super();
		Portid = portid;
	}

	
	public ArrayList<Port> getPortlist()
	{
		return Ports;
		
	}
	ArrayList<Integer> ShipHolder = new ArrayList<Integer>();
	
	String Portid;
	
	int No_Of_Bc=20 ;
	int No_Of_Hc=20 ;
	int No_Of_Lc=20 ;
	int No_Of_Rc=20 ;
	
	void updateaddBc(int a)
	{
		No_Of_Bc += a;
	}
	void updatesubBc(int a)
	{
		No_Of_Bc -= a;
	}
	
	void updateaddHc(int a)
	{
		No_Of_Hc += a;
	}
	void updatesubHc(int a)
	{
		No_Of_Hc -= a;
	}
	
	void updateaddLc(int a)
	{
		No_Of_Lc += a;
	}
	void updatesubLc(int a)
	{
		No_Of_Lc -= a;
	}
	
	void updateaddRc(int a)
	{
		No_Of_Rc += a;
	}
	void updatesubRc(int a)
	{
		No_Of_Rc -= a;
	}
	
	int PortCapacity ;//= No_Of_Bc*5000+No_Of_Hc*10000+No_Of_Lc*10000+No_Of_Rc*10000;
	
	
	
}
