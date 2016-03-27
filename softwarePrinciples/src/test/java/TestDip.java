import dip.obey.domain.Lecturer;
import dip.obey.domain.Student;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Aphish on 2016/03/27.
 */
public class TestDip {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testDipObey() throws Exception {

        Student student = new Student();
        Lecturer lecturer = new Lecturer();
        Assert.assertSame(student.getRole(),lecturer.getRole());

    }
}
