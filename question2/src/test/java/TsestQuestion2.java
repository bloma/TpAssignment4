import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.Job;
import za.ac.cput.domain.Person;

/**
 * Created by Aphish on 2016/03/27.
 */
public class TsestQuestion2 {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testQuestion2() throws Exception {
        Person person = new Person();
        Job role = new Job();
        Assert.assertSame(person.getJob(),role.getJobdescption());
    }
}
