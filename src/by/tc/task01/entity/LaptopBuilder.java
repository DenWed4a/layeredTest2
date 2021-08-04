package by.tc.task01.entity;

public class LaptopBuilder implements ApplianceBuilder{
	
	

	@Override
	public Appliance build(String[] currentAppliance) {
		int batteryCapacity = Integer.parseInt(currentAppliance[2]);
		String oS = currentAppliance[4];
		int memoryRom = Integer.parseInt(currentAppliance[6]);
		int systemMemory = Integer.parseInt(currentAppliance[8]);
		double cPU = Double.parseDouble(currentAppliance[10]); 
		double displayInchs = Double.parseDouble(currentAppliance[12]);
		Laptop laptop = new Laptop(batteryCapacity, oS, memoryRom, systemMemory, cPU, displayInchs);
		
		
		return laptop;
	}

	
	



}
