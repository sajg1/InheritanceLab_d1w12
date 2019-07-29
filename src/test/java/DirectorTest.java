import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Gregory McTavish", "JH343536A", 80000, "App Development", 600000 );
    }

    @Test
    public void hasName() {
        assertEquals("Gregory McTavish", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JH343536A", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(80000, director.getSalary());
    }

    @Test
    public void hasADept() {
        assertEquals("App Development", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals( 600000, director.getBudget(), 0.01);
    }

    @Test
    public void canGetRaise() {
        director.raiseSalary(2000);
        assertEquals(82000, director.getSalary());
    }

    @Test
    public void canGetBonus() {
        assertEquals(800.00, director.payBonus(), 0.01);
    }

    @Test
    public void cannotGiveNegativeRaise() {
        director.raiseSalary(-1000);
        assertEquals(80000, director.getSalary());
    }

}
