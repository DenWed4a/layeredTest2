package by.tc.task01.entity;

public class RefrigeratorBuilder implements ApplianceBuilder{
	


	@Override
	public Appliance build(String[] currentAppliance) {
		
		int powerConsumption = Integer.parseInt(currentAppliance[2]);
		int weight = Integer.parseInt(currentAppliance[4]);
		int freezerCapacity = Integer.parseInt(currentAppliance[6]);
		double overallCapacity = Double.parseDouble(currentAppliance[8]);
		int height = Integer.parseInt(currentAppliance[10]);
		int width = Integer.parseInt(currentAppliance[12]);
		Refrigerator refrigerator = new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
		
		return refrigerator;
	}

}
