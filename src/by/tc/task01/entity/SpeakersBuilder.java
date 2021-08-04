package by.tc.task01.entity;

public class SpeakersBuilder implements ApplianceBuilder{
	
	
	


	
	@Override
	public Appliance build(String[] currentAppliance) {
		int powerConsumption = Integer.parseInt(currentAppliance[2]);
		int numberOfSpeakers  = Integer.parseInt(currentAppliance[4]);
		String frequencyRange = currentAppliance[6];
		int cordLength = Integer.parseInt(currentAppliance[8]);
		Speakers speakers = new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
		return speakers;
	}

}
