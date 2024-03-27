package co.simplon.cdahopitalback;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import co.simplon.cdahopitalback.persistance.entity.Patient;

@SpringBootTest
class CdahopitalbackApplicationTests {

	@Test
	public void testPatienCreation() {

		Patient patient = new Patient();

		patient.setId(1);
		patient.setName("Poteau");
		patient.setFirstname("Florian");
		patient.setDatebirth(new Date());
		patient.setSexe("masculin");
		patient.setNotel(123456789);
		patient.setNosecu(1923929392);
		patient.setDatearrivee(new Date());
		patient.setDatesortie(new Date());

		assertNotNull(patient);

		assertEquals(1, patient.getId());
		assertEquals("Poteau", patient.getName());
		assertEquals("Florian", patient.getFirstname());
		assertEquals("masculin", patient.getSexe());
		assertEquals(123456789, patient.getNotel());
		assertEquals(1923929392, patient.getNosecu());
		assertNotNull(patient.getDatebirth());
		assertNotNull(patient.getDatearrivee());
		assertNotNull(patient.getDatesortie());
	}
}
