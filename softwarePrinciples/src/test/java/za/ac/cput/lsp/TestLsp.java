package za.ac.cput.lsp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.srp.obey.domain.Person;

/**
 * Created by Aphish on 2016/03/27.
 */
public class TestLsp {

    @Before
    public void setUp() throws Exception {
        

    }

    @After
    public void tearDown() throws Exception {
        

    }

    @Test
    public void lspObey() throws Exception {
        Person learner = new Person("Anovuyo","Blom",8);
        Assert.assertTrue(8==learner.getAge());
    }

    @Test
    public void lspViolate() throws Exception {
        Person learner = new Person("Anovuyo","Blom",8);
        Assert.assertTrue(8==learner.getAge());
    }
}
