package by.tc.task01.entity;

public class TabletPCBuilder implements ApplianceBuilder{
	


	@Override
	public Appliance build(String[] currentAppliance) {
		int batteryCapacity = Integer.parseInt(currentAppliance[2]);
		int displayInchs = Integer.parseInt(currentAppliance[4]);
		int  memoryRom = Integer.parseInt(currentAppliance[6]);
		int flashMemoryCapacity = Integer.parseInt(currentAppliance[8]);
		String color  = currentAppliance[10];
		TabletPC tabletPC = new TabletPC(batteryCapacity, displayInchs, memoryRom, flashMemoryCapacity, color);
		
		return tabletPC;
	}

}
