package by.tc.task01.entity;

public class ApplianceFactory {

	private static final ApplianceFactory applianceFactory = new ApplianceFactory();
	private final LaptopBuilder laptopBuilder = new LaptopBuilder();
	private final OvenBuilder ovenBuilder = new OvenBuilder();
	private final RefrigeratorBuilder refrigeratorBuilder = new RefrigeratorBuilder();
	private final SpeakersBuilder speakersBuilder = new SpeakersBuilder();
	private final TabletPCBuilder tabletPCBuilder = new TabletPCBuilder();
	private final VacuumCleanerBuilder vacuumCleanerBuilder = new VacuumCleanerBuilder();

	private ApplianceFactory() {
	}

	public static ApplianceFactory getApplianceFactory() {
		return applianceFactory;
	}

	public LaptopBuilder getLaptopBuilder() {
		return laptopBuilder;
	}

	public OvenBuilder getOvenBuilder() {
		return ovenBuilder;
	}

	public RefrigeratorBuilder getRefrigeratorBuilder() {
		return refrigeratorBuilder;
	}

	public SpeakersBuilder getSpeakersBuilder() {
		return speakersBuilder;
	}

	public TabletPCBuilder getTabletPCBuilder() {
		return tabletPCBuilder;
	}

	public VacuumCleanerBuilder getVacuumCleanerBuilder() {
		return vacuumCleanerBuilder;
	}

}
