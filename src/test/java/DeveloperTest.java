import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Steve", "KL342576C", 26000);
    }

    @Test
    public void hasName() {
        assertEquals("Steve", developer.getName());
    }

    @Test
    public void hasNINUmber() {
        assertEquals("KL342576C", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(26000, developer.getSalary());
    }

    @Test
    public void canGetRaise() {
        developer.raiseSalary(1000);
        assertEquals(27000, developer.getSalary());
    }

    @Test
    public void canGetBonus() {
        developer.payBonus();
        assertEquals(260.00, developer.payBonus(), 0.01);
    }

    @Test
    public void cannotGiveNegativeRaise() {
        developer.raiseSalary(-800);
        assertEquals(26000, developer.getSalary());
    }

    @Test
    public void canChangeName() {
        developer.setName("Doris");
        assertEquals("Doris", developer.getName());
    }
}
