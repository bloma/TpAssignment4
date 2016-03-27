package za.ac.cput; /**
 * Created by Aphish on 2016/03/26.
 */
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.services.StudentImpl;


public class TestPerson {

    StudentImpl student;

    @Before
    public void setUp() throws Exception {

        student = new StudentImpl();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testName() throws Exception {
        System.out.println("printing :" + student.describePosition().getName());
        Assert.assertEquals(student.describePosition().getName(),"Aphiwe");
    }

    @Test
    public void testSurname() throws Exception {
        System.out.println("printing :" + student.describePosition().getSurname());
        Assert.assertEquals(student.describePosition().getSurname(),"Blom");
    }

    @Test
    public void testAge() throws Exception {
        System.out.println("printing :" + student.describePosition().getAge());
        Assert.assertEquals(student.describePosition().getAge(),25);

    }
}
