import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Sheila", "HL675849A", 24000);
    }

    @Test
    public void hasName() {
        assertEquals("Sheila", databaseAdmin.getName());
    }

    @Test
    public void hasNINUmber() {
        assertEquals("HL675849A", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(24000, databaseAdmin.getSalary());
    }

    @Test
    public void canGetRaise() {
        databaseAdmin.raiseSalary(500);
        assertEquals(24500, databaseAdmin.getSalary());
    }

    @Test
    public void canGetBonus() {
        databaseAdmin.payBonus();
        assertEquals(240.00, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void cannotGiveNegativeRaise() {
        databaseAdmin.raiseSalary(-800);
        assertEquals(24000, databaseAdmin.getSalary());
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Doris");
        assertEquals("Doris", databaseAdmin.getName());
    }
}
