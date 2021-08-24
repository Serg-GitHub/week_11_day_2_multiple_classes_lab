import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BusStopTest {


    private Person person;
    private BusStop busstop;

    @Before
    public void before() {
        person = new Person();
        busstop = new BusStop("London");
    }

    @Test
    public void canAddToQueue() {
        busstop.addPerson(person);
        assertEquals(1, busstop.getQueueCount());
    }

    @Test
    public void canRemoveFromQueue(){
        busstop.addPerson(person);
        Person removed = busstop.removePerson();
        assertNotNull(removed);
        assertEquals(0, busstop.getQueueCount());
    }

}
