package by.tc.task01.dao.impl;



import java.io.IOException;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;


public class DAOImplInspector {

	public static void main(String[] args) throws IOException {
		
		ServiceFactory service = ServiceFactory.getInstance();
		ApplianceService aSI = service.getApplianceService();
		
		Criteria criteria = new Criteria();
		
		criteria.add(TabletPC.COLOR.toString(), "blue");
		criteria.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteria.add(TabletPC.MEMORY_ROM.toString(), 8000);
		
		List<Appliance> serviceList = aSI.find(criteria);
		for(Appliance element : serviceList) {
			System.out.println(element);
		}
		
		
		
		
		
		
		ApplianceDAO appDAO = new FileApplianceDAO();
		
		List<Appliance> appTabletPC = appDAO.find(criteria);
		for(Appliance element : appTabletPC) {
			System.out.println(element+" ");
		}
		System.out.println();
		
		criteria.clearCriteria();
		criteria.setGroupSearchName(Laptop.class.getSimpleName());
		criteria.add(Laptop.BATTERY_CAPACITY.toString(), 3);
		List<Appliance> apps = appDAO.find(criteria);
		for(Appliance element : apps) {
			System.out.println(element+" ");
		}
		System.out.println();
		
		criteria.clearCriteria();
		criteria.setGroupSearchName("");
		criteria.add(Oven.CAPACITY.toString(), 33);
		//criteria.clearCriteria();
		List<Appliance> ovens = appDAO.find(criteria);
		for(Appliance element : ovens) {
			System.out.println(element+" ");
		}
		System.out.println();
		
		
		
		
		
	}}	
