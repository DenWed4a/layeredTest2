package by.tc.task01.entity;

public interface ApplianceBuilder {
	
	/*ApplianceBuilder setPowerConsumption(int pc);
	ApplianceBuilder setNumberOfSpeakers(int nos);
	ApplianceBuilder setFrequencyRange(String fr);
	ApplianceBuilder setCordLenght(int cl);
	ApplianceBuilder setFilterType(String filterType);
	ApplianceBuilder setBagType(String bagType);
	ApplianceBuilder setWandType(String wandType);
	ApplianceBuilder setMotorSpeedRegulation(int motorSpeedRegulation);
	ApplianceBuilder setCleaningWidth(int cleaningWidth);
	ApplianceBuilder setWeight(int weighr);
	ApplianceBuilder setFreezerCapacity(int freezerCapacity);
	ApplianceBuilder setOverallCapacity(double overallCapacity);
	ApplianceBuilder setHeight(int height);
	ApplianceBuilder setWidth(int width);
	ApplianceBuilder setBatteryCapacity(int batteryCapacity);
	ApplianceBuilder setOS(String oS);
	ApplianceBuilder setMemoryRom(int memoryRom);
	ApplianceBuilder setSystemMemory(int systemMemory);
	ApplianceBuilder setCPU(double cPU);
	ApplianceBuilder setDisplayInchs(int displayInchs);
	ApplianceBuilder setCapacity(int capacity);
	ApplianceBuilder setDepth(int depth);
	ApplianceBuilder setFlashMemoryCapacity(int flashMemoryCapacity);
	ApplianceBuilder setColor(String color);*/
	
	Appliance build(String[] currentAppliance);
	

}
