package za.ac.cput.srp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.srp.obey.domain.Person;
import za.ac.cput.srp.violate.services.PersonInterface;

/**
 * Created by Aphish on 2016/03/27.
 */
public class SrpTest {


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        
    }

    @Test
    public void testSrpObey() throws Exception {
         Person learner = new Person("Aphiwe","Blom",15);
        Assert.assertEquals(learner.getAge(),15);

    }

    @Test
    public void testSrpViolate() throws Exception {
        Person learner = new Person("Aphiwe","Blom",15);
        Assert.assertEquals(learner.getAge(),15);

    }
}
