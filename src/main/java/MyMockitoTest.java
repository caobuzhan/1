import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by zhanglulu on 2018/1/31.
 */
public class MyMockitoTest {
    @Test
    public void testMockitoTest() {
        // you can mock concrete classes, not only interfaces
        Calculate mockedList = mock(Calculate.class);

        // stubbing appears before the actual execution
        when(mockedList.add(1, 2)).thenReturn(3);
        int sum = mockedList.add(1, 2);
        // the following prints "first"
        System.out.println(mockedList.add(1, 2));
        int expected = 3;
        assertEquals(sum, expected);
        // the following prints "null" because get(999) was not stubbed
    }
}
