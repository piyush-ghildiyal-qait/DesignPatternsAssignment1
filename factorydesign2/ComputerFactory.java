package factorydesign2;

public class ComputerFactory {

	private static ComputerFactory computerfactory;
	
	private ComputerFactory() {}
	
	public static ComputerFactory getInstance() {
		if(computerfactory==null)
		{
			return computerfactory=new ComputerFactory();
			
		}
		return computerfactory;
	}
	
	public static Computer create(String type) {
		
		if(type.equalsIgnoreCase("server")) {return new Server();}
		
		if(type.equalsIgnoreCase("PC")) {return new PC();}
		return null;
	}
	
}
