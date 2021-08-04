package by.tc.task01.entity;

public class OvenBuilder implements ApplianceBuilder{
	
	

	@Override
	public Appliance build(String[] currentAppliance) {
		
		int powerConsumption = Integer.parseInt(currentAppliance[2]);
		int weight = Integer.parseInt(currentAppliance[4]);
		int capacity = Integer.parseInt(currentAppliance[6]);
		int depth = Integer.parseInt(currentAppliance[8]);
		double height = Double.parseDouble(currentAppliance[10]);
		double width  = Double.parseDouble(currentAppliance[12]);
		Oven oven = new Oven(powerConsumption, weight, capacity, depth, height, width);
		return oven;
	}

}
