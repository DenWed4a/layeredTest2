package by.tc.task01.entity;





public class Laptop implements Appliance{

	private int batteryCapacity;
	private String oS;
	private int memoryRom;
	private int systemMemory;
	private double cPU;
	private double displayInchs;
	
	
	public Laptop() {}


	public Laptop(int batteryCapacity, String oS, int memoryRom, int systemMemory, double cPU, double displayInchs) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.oS = oS;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cPU = cPU;
		this.displayInchs = displayInchs;
	}
	
	


	public int getBatteryCapacity() {
		return batteryCapacity;
	}


	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}


	public String getoS() {
		return oS;
	}


	public void setoS(String oS) {
		this.oS = oS;
	}


	public int getMemoryRom() {
		return memoryRom;
	}


	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}


	public int getSystemMemory() {
		return systemMemory;
	}


	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}


	public double getcPU() {
		return cPU;
	}


	public void setcPU(double cPU) {
		this.cPU = cPU;
	}


	public double getDisplayInchs() {
		return displayInchs;
	}


	public void setDisplayInchs(double displayInchs) {
		this.displayInchs = displayInchs;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batteryCapacity;
		long temp;
		temp = Double.doubleToLongBits(cPU);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(displayInchs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + memoryRom;
		result = prime * result + ((oS == null) ? 0 : oS.hashCode());
		result = prime * result + systemMemory;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (Double.doubleToLongBits(cPU) != Double.doubleToLongBits(other.cPU))
			return false;
		if (Double.doubleToLongBits(displayInchs) != Double.doubleToLongBits(other.displayInchs))
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		if (oS == null) {
			if (other.oS != null)
				return false;
		} else if (!oS.equals(other.oS))
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}
	
	


	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", oS=" + oS + ", memoryRom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", cPU=" + cPU + ", displayInchs=" + displayInchs + "]";
	}


	@Override
	public void setParametrs(String[] s) {
		// TODO Auto-generated method stub
		
	}


	
	
	



	




	
	
	
	
	
	
	
	
	
	
	
	// you may add your own code here
}
