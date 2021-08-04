package by.tc.task01.entity;

public class ApplianceCreator {
	
	public Appliance create(String applianceName, String[] params) {
		
		ApplianceBuilder appBuild;
		ApplianceFactory factory = ApplianceFactory.getApplianceFactory();
		Appliance appliance = null;
		switch(applianceName) {
		case("Laptop"):
			appBuild =  factory.getLaptopBuilder();
			appliance = appBuild.build(params);
			break;
		case("Oven"):
			appBuild = factory.getOvenBuilder();
			appliance = appBuild.build(params);
			break;
		case("Refrigerator"):
			appBuild = factory.getRefrigeratorBuilder();
			appliance = appBuild.build(params);
			break;
		case("Speakers"):
			appBuild = factory.getSpeakersBuilder();
			appliance = appBuild.build(params);
			break;
		case("TabletPC"):
			appBuild = factory.getTabletPCBuilder();
			appliance = appBuild.build(params);
			break;
		case("VacuumCleaner"):
			appBuild = factory.getVacuumCleanerBuilder();
			appliance = appBuild.build(params);
			break;		
		
			
		}return appliance;
	}

}
