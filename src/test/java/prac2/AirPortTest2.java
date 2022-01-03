package prac2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AirPortTest2 {

	@Test
	public void testEconomyFlightUsualPassenger() {
		Flight economyFlight = new EconomyFlight("1");
		Passenger mike = new Passenger("mike",false);
		
		assertEquals("1",economyFlight.getId());
		assertEquals(true, economyFlight.addPassenger(mike));
		assertEquals(1,economyFlight.getPassengerList().size());
		assertEquals("mike",economyFlight.passengerList.get(0).getName());
		
		assertEquals(true,economyFlight.removePassenger(mike));
		assertEquals(0, economyFlight.getPassengerList().size());
	}
	
	@Test
	public void testEconomyFlightVipPassenger() {
		Flight economyFlight = new EconomyFlight("1");
		Passenger john = new Passenger("john",true);
		
		assertEquals("1",economyFlight.getId());
		assertEquals(true, economyFlight.addPassenger(john));
		assertEquals(1,economyFlight.getPassengerList().size());
		assertEquals("john",economyFlight.passengerList.get(0).getName());
		
		assertEquals(false,economyFlight.removePassenger(john));
		assertEquals(1, economyFlight.getPassengerList().size());
	}
	
	@Test
	public void testBusinessFlightUsualPassenger() {
		Flight businessFlight = new BusinessFlight("2");
		Passenger mike = new Passenger("mike",false);
		
		assertEquals(false, businessFlight.addPassenger(mike));
		assertEquals(0,businessFlight.getPassengerList().size());
		assertEquals(false,businessFlight.removePassenger(mike));
		assertEquals(0,businessFlight.getPassengerList().size());
	}
	
	@Test
	public void testBusinessFlightVipPassenger() {
		Flight businessFlight = new BusinessFlight("2");
		Passenger john = new Passenger("john",true);
		
		assertEquals(true, businessFlight.addPassenger(john));
		assertEquals(1,businessFlight.getPassengerList().size());
		assertEquals(false,businessFlight.removePassenger(john));
		assertEquals(1,businessFlight.getPassengerList().size());
	}

}
