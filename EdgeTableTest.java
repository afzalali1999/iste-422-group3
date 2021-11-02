import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class EdgeTableTest {
    EdgeTable testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new EdgeTable("1|testName");
    }

    @Test
    public void testGetNumFigure() {
        assertEquals("numFigure was intialized to 1",1,testObj.getNumFigure());
    }

    @Test
    public void testGetName() {
        assertEquals("","testName",testObj.getName());
    }

    @Test
    public void testAddRelatedTable() {
        testObj.addRelatedTable(1);
        testObj.makeArrays();
        assertArrayEquals("", new int[]{1}, testObj.getRelatedTablesArray());
    }

    @Test
    public void testGetRelatedTable() {
        testObj.addRelatedTable(1);
        testObj.makeArrays();
        assertArrayEquals("", new int[]{1}, testObj.getRelatedTablesArray());
    }

    @Test
    public void testGetRelatedFieldsArray() {
        testObj.addNativeField(1);
        testObj.makeArrays();
        testObj.setRelatedField(0,0);
        assertArrayEquals("", new int[]{0}, testObj.getRelatedFieldsArray());
    }

    @Test
    public void testSetRelatedField() {
        testObj.addNativeField(1);
        testObj.makeArrays();
        testObj.setRelatedField(0,0);
        assertArrayEquals("", new int[]{0}, testObj.getRelatedFieldsArray());
    }

    @Test
    public void testGetNativeFieldsArray() {
        testObj.addNativeField(1);
        testObj.makeArrays();
        assertArrayEquals("", new int[]{1}, testObj.getNativeFieldsArray());
    }

    @Test
    public void testAddNativeFieldsArray() {
        testObj.addNativeField(1);
        testObj.makeArrays();
        assertArrayEquals("", new int[]{1}, testObj.getNativeFieldsArray());
    }

    @Test
    public void testMoveFieldUp() {
        testObj.addNativeField(1);
        testObj.addNativeField(2);
        testObj.addRelatedTable(1);
        testObj.addRelatedTable(2);
        testObj.makeArrays();
        testObj.moveFieldUp(1);
    }

    @Test
    public void testMoveFieldDown() {
        testObj.addNativeField(1);
        testObj.addNativeField(2);
        testObj.addRelatedTable(1);
        testObj.addRelatedTable(2);
        testObj.makeArrays();
        testObj.moveFieldUp(1);
    }
}
