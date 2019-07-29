import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", "JL324576B", 30000, "Marketing" );
    }

    @Test
    public void hasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JL324576B", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void hasADept() {
        assertEquals("Marketing", manager.getDeptName());
    }

    @Test
    public void canGetRaise() {
        manager.raiseSalary(200);
        assertEquals(30200, manager.getSalary());
    }

    @Test
    public void canGetBonus() {
        assertEquals(300.00, manager.payBonus(), 0.01);
    }
}
