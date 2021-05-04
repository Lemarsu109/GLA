package datanucleus.dao.fake;

import datanucleus.dao.Pilot;
import datanucleus.dao.PilotDAO;

public class PilotDAOFakeImpl implements PilotDAO {

	@Override
	public void addPilot(Pilot pilot) {
		System.out.println("newPilot");
	}
	
	@Override
	public Pilot getPilot(String id){
		System.out.println("getPilot");
		return null;
	}

}
