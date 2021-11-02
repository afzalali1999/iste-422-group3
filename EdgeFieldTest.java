import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest {
    EdgeField testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new EdgeField("1|testName");
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
    public void testGetTableID() {
        assertEquals("",0,testObj.getTableID());
    }

    @Test
    public void testSetTableID() {
        testObj.setTableID(1);
        assertEquals("", 1, testObj.getTableID());
    }

    @Test
    public void testGetTableBound() {
        assertEquals("", 0, testObj.getTableBound());
    }

    @Test
    public void testSetTableBound() {
        testObj.setTableBound(1);
        assertEquals("", 1, testObj.getTableBound());
    }

    @Test
    public void testGetFieldBound() {
        assertEquals("", 0, testObj.getFieldBound());
    }

    @Test
    public void testSetFieldBound() {
        testObj.setFieldBound(1);
        assertEquals("", 1, testObj.getFieldBound());
    }

    @Test
    public void testGetDisallowNull() {
        assertEquals("", false, testObj.getDisallowNull());
    }

    @Test
    public void testSetDisallowNull() {
        testObj.setDisallowNull(true);
        assertEquals("", true, testObj.getDisallowNull());
    }

    @Test
    public void testGetIsPrimaryKey() {
        assertEquals("", false, testObj.getIsPrimaryKey());
    }

    @Test
    public void testSetIsPrimaryKey() {
        testObj.setIsPrimaryKey(true);
        assertEquals("", true, testObj.getIsPrimaryKey());
    }

    @Test
    public void testGetDefaultValue() {
        assertEquals("", "", testObj.getDefaultValue());
    }

    @Test
    public void testSetDefaultValue() {
        testObj.setDefaultValue("test");
        assertEquals("", "test", testObj.getDefaultValue());
    }

    @Test
    public void testGetVarcharValue() {
        assertEquals("", 1, testObj.getVarcharValue());
    }

    @Test
    public void testSetVarcharValue() {
        testObj.setVarcharValue(2);
        assertEquals("", 2, testObj.getVarcharValue());
    }

    @Test
    public void testGetDataType() {
        assertEquals("", 0, testObj.getDataType());
    }

    @Test
    public void testSetDataType() {
        testObj.setDataType(1);
        assertEquals("", 1, testObj.getDataType());
    }

    @Test
    public void testGetStrDataType() {
        Assert.assertArrayEquals("", new String[]{"Varchar", "Boolean", "Integer", "Double"}, EdgeField.getStrDataType());
    }
}
