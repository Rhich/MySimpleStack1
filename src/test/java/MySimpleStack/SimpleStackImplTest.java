package MySimpleStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.beans.editors.StringEditor;

import static org.junit.Assert.*;

public class SimpleStackImplTest {
private SimpleStackImpl simpleStack;
    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl();
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true,simpleStack.isEmpty());
        String test1 = "test";
        simpleStack.push(new Item(new String (test1)));
        Assert.assertEquals(false,simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(0,simpleStack.getSize());


    }

    @Test
    public void testPush() throws Exception {
        /*commentaire pour exigence2*/
    }

    @Test
    public void testPeek() throws Exception {

    }

    @Test
    public void testPop() throws Exception {

    }
}