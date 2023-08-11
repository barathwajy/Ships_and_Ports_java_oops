package shipping;

import java.util.Scanner;


public class Main extends Bill_Generate{
	
	@Override
	double surcharges(double totalCharges, int i) {
		if(i>=3)
		{
			return totalCharges+250.0;
		}
		return totalCharges;
		// TODO Auto-generated method stub
		
		
	}
	
	
	static void displayReport(String a)
	{
		//System.out.println(a);
		for(int i=0;i<Port.Ports.size();i++)
		{
			//System.out.println(Port.Ports.get(i).Portid);
			if(Port.Ports.get(i).Portid.equals(a))
			{
				
				
				System.out.print("Container Type: "+Container.btype+" Container Weight: "+Container.weightBC+" Total Basic Containers ");
				System.out.println(Port.Ports.get(i).No_Of_Bc);
				
				System.out.print("Container Type: "+Container.ltype+" Container Weight: "+Container.weightLC+" Total Basic Containers ");
				System.out.println(Port.Ports.get(i).No_Of_Lc);
				
				System.out.print("Container Type: "+Container.htype+" Container Weight: "+Container.weightHC+" Total Basic Containers ");
				System.out.println(Port.Ports.get(i).No_Of_Hc);
				
				System.out.print("Container Type: "+Container.rtype+" Container Weight: "+Container.weightRC+" Total Basic Containers ");
				System.out.println(Port.Ports.get(i).No_Of_Rc);
				
				System.out.println();
				//System.out.println("Port Capacity "+Port.Ports.get(i).PortCapacity);
				
				
			}
		}
		
		
	}

	static void IntialPorts()
	{
		
		Port p1 = new Port("A");
		Port.Ports.add(p1);
		
		Port p2 = new Port("B");
		Port.Ports.add(p2);
		
		Port p3 = new Port("C");
		Port.Ports.add(p3);
		
		Port p4 = new Port("D");
		Port.Ports.add(p4);
		
		Port p5 = new Port("E");
		Port.Ports.add(p5);
		
	
	}
	
	static void IntialShips()
	{
		Ship s1 = new Ship(1);
		Ship.Ships.add(s1);	
		
		Ship s2 = new Ship(2);
		Ship.Ships.add(s2);
		
		Ship s3 = new Ship(3);
		Ship.Ships.add(s3);
		
		Ship s4 = new Ship(4);
		Ship.Ships.add(s4);
		
		Ship s5 = new Ship(5);
		Ship.Ships.add(s5);
		
	}
 
	
	public static void main(String[] args) throws InterruptedException {

		IntialShips();
		IntialPorts();
		
		System.out.println("Welcome to Shipping");
		while(true) {
			System.out.println("Select 1 to start transport | Select 2 for Report | Select 3 to exit");
			Scanner sc = new Scanner(System.in);
			int sl = sc.nextInt();

				if(sl==1)
				{
					System.out.println("Select Current Location A| B| C| D| E");
					String currLoc = sc.next();
					System.out.println("Select Destination Location A| B| C| D| E");
					String DestinationLoc = sc.next();
					if(currLoc.equals(DestinationLoc))
					{
						String upDloc=sc.next();
						DestinationLoc = upDloc;
					}
					System.out.print("Select Ship ");
					for(int i=0;i<Ship.Ships.size();i++)
					{
						if(Ship.BusyShips.contains(Ship.Ships.get(i).ShipID))
						{
							
						}
						else {
							System.out.print(" "+Ship.Ships.get(i).ShipID+" ");
						}
					}
					int shipsel = sc.nextInt();
					if(Ship.BusyShips.contains(shipsel))
					{
						int upshipsel = sc.nextInt();
						shipsel = upshipsel;
					}
					int nBc=0;
					int nHc=0;
					int nLc=0;
					int nRc=0;
					int flag=0;
					
					while(true)
					{
						System.out.println("Maximum Quantity of the Ship - 30,000");
						System.out.println("Basic Container - 5000| Heavy,Liquid,Refrigerated - 10000 | \n");
						System.out.println("Select 1-Basic Container| 2-Heavy Container | 3-Liquid Container | 4-Refrigerated Container | 5 End \n");
						int selCon = sc.nextInt();
				
						
						
						if(selCon==1)
						{
							System.out.println("Enter the No of Basic Containers");
							 int tempnBc=sc.nextInt();
							 nBc = tempnBc;
						}
						else if(selCon==2)
						{
							System.out.println("Enter the No of Heavy Containers");
							int tempnHc=sc.nextInt();
							nHc=tempnHc;
						}
						else if(selCon==3)
						{
							System.out.println("Enter the No of Liquid Containers");
							int tempnLc=sc.nextInt();
							nLc=tempnLc;
						}
						else if(selCon==4)
						{
							System.out.println("Enter the No of Refrigerated Containers");
							int tempnRc=sc.nextInt();
							nRc=tempnRc;
						}
						else if(nBc*5000 + nHc*10000 + nLc*10000 +nRc*10000==Ship.ShipMaxQuantity)
						{
							break;
						}
						else if(selCon==5&&flag==0)
						{
							//System.out.println(nBc*5000 + nHc*10000 + nLc*10000 +nRc*10000);
							break;
						}
						else {
							System.out.println("Sorry wrong input - Re Enter");
							int upSelcon=sc.nextInt();
						
							selCon=upSelcon;
						}
						
						//System.out.println(nBc+" "+nHc+" "+nLc+" "+nRc);
						if(nBc*5000 + nHc*10000 + nLc*10000 +nRc*10000>Ship.ShipMaxQuantity)
						{
							flag=1;
							System.out.println("Sorry Re Enter limit exceeded - Inputs Resetted to Nil");
							nBc = 0;
							nHc = 0;
							nLc = 0;
							nRc = 0;
						}
						
						Ship.Ships.get(shipsel-1).updateaddSnBc(nBc);
						Ship.Ships.get(shipsel-1).updateaddSnHc(nHc);
						Ship.Ships.get(shipsel-1).updateaddSnLc(nLc);
						Ship.Ships.get(shipsel-1).updateaddSnRc(nRc);
						//Thread.sleep(5000);
						
						
						
						

						for(int i=0;i<Port.Ports.size();i++)
						{
							if(Port.Ports.get(i).Portid.equals(currLoc))
							{
						
								Port.Ports.get(i).updatesubBc(nBc);
								Port.Ports.get(i).updatesubHc(nHc);
								Port.Ports.get(i).updatesubLc(nLc);
								Port.Ports.get(i).updatesubRc(nRc);
							}
						//Ship.Ships.get(shipsel-1).setSnBc(0);
						//Ship.Ships.get(shipsel-1).setSnHc(0);
					//	Ship.Ships.get(shipsel-1).setSnLc(0);
						//Ship.Ships.get(shipsel-1).setSnRc(0);
						
						
						}
						

						
						for(int i=0;i<Port.Ports.size();i++)
						{
							if(Port.Ports.get(i).Portid.equals(DestinationLoc))
							{
								Port.Ports.get(i).updateaddBc(nBc);
								Port.Ports.get(i).updateaddHc(nHc);
								Port.Ports.get(i).updateaddLc(nLc);
								Port.Ports.get(i).updateaddRc(nRc);
								Port.Ports.get(i).ShipHolder.add(shipsel);
								Ship.BusyShips.add(shipsel);
								//System.out.println(Ship.BusyShips);
								
								Main m1 = new Main();
								double totalCharges = m1.charges(nBc,nLc,nHc,nRc);
								double StotalCharges = m1.surcharges(totalCharges,shipsel);
								System.out.println("Total Charges($): "+StotalCharges);
							}
						
						}
						
						//Ship.Ships.get(shipsel-1).setSnBc(0);
						//Ship.Ships.get(shipsel-1).setSnHc(0);
					//	Ship.Ships.get(shipsel-1).setSnLc(0);
						//Ship.Ships.get(shipsel-1).setSnRc(0);		
						
						//if(Ship.BusyShips.add(null))
			//			System.out.println(Ship.Ships.get(shipsel-1).SnBc);
			//			Ship.Ships.get(shipsel-1).setSnBc(nBc);
						
						
					}
					
				}
				else if(sl==2)
				{
					System.out.println("Select Port A| B| C| D| E");
					String Repport = sc.next();
					displayReport(Repport);
					
				}
				else {
					break;
				}
		}
		
		
		
		
		
		
		
	}

	

}
