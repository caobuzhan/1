package test.UnitExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Person Tester.
 *
 * @author <Authors name>
 * @since <pre>���� 22, 2016</pre>
 * @version 1.0
 */
public class PersonTest {

    @Before
    public void before() throws Exception {
        System.out.println("before");
    }

    @After
    public void after() throws Exception {
        System.out.println("after");
    }

    /**
     *
     * Method: watch()
     *
     */
    @Test
    public void testWatch() throws Exception {
        Person person = new Person();
        person.watch();
    }



    /**
     *
     * Method: setName(String name)
     *
     */
    @Test
    public void testSetName() throws Exception {
        Person person = new Person();
        person.setName("emma");
    }
    /**
     *
     * Method: getName()
     *
     */
    @Test
    public void testGetName() throws Exception {
        Person person = new Person();
        person.setName("emma");
        System.out.println(person.getName());
    }

}
