package by.tc.task01.entity;

public class VacuumCleanerBuilder implements ApplianceBuilder{
	


	@Override
	public Appliance build(String[] currentAppliance) {
		int powerConsumption = Integer.parseInt(currentAppliance[2]);
		String filterType = currentAppliance[4];
		String bagType = currentAppliance[6];
		String wandType = currentAppliance[8];
		int motorSpeedRegulation = Integer.parseInt(currentAppliance[10]);
		int cleaningWidth = Integer.parseInt(currentAppliance[12]);
		VacuumCleaner vacuumCleaner = new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
		
		return vacuumCleaner;
	}

}
