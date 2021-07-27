package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class itemTest {

    @Test
    void itemModTest() {
        item testing = new item();
        testing.setInfo("ABCDEFGHIJ", "Testing", 599.99);

        //Test editing serial
        testing.setSerial("ZYXABCDEFG");
        assertEquals("ZYXABCDEFG", testing.getSerial());
        //Test editing name
        testing.setName("Tested");
        assertEquals("Tested", testing.getName());
        //Test editing cost
        testing.setPrice(199.99);
        assertEquals(199.99, testing.getPrice());
    }
}