package datanucleus;

import java.time.LocalDate;
import java.time.Month;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.junit.Assert;
import org.junit.Test;

import datanucleus.dao.Passenger;
import datanucleus.dao.PassengerDAO;
import datanucleus.dao.dn.PassengerDAOImpl;

public class PassengerDaoImplTest {

	@Test
	public void test() {
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("Passenger");
		PassengerDAO passengerDao = new PassengerDAOImpl(pmf);

		Assert.assertEquals(null, passengerDao.getPassenger("passenger.id"));

		Passenger passenger = new Passenger("Aidan", "Bonnefond",
			LocalDate.of(1999, Month.AUGUST, 22),"Male", "1 Toto Street", "0102030405", 
			"toto@mail.com", "toto84");

		passengerDao.addPassenger(passenger);

		Assert.assertEquals(passenger, passengerDao.getPassenger(passenger.id));
	}

}
