package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class exportTest {

    @Test
    void testTSVExport() {
        ArrayList<item> testList= new ArrayList<>();
        item Example = new item();

        Example.setInfo("ABCDEFSHJ", "Testing", 599.99);
        testList.add(Example);

        item Example2 = new item();
        Example2.setInfo("YYADHDAIS", "Tested", 199.99);
        testList.add(Example2);

        export newExport = new export();
        newExport.exportTSV(testList);

        System.out.print(System.getProperty("user.dir") + "/export.tsv");
        File existFile = new File(System.getProperty("user.dir") + "/export.tsv");
        assertTrue(existFile.exists());
    }

    @Test
    void testHTMLExport(){

    }

}