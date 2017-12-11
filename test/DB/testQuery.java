package DB;

import AppObj.Sale;
import org.junit.Test;
import static org.junit.Assert.*;

public class testQuery {
    
    @Test
    public void test_SearchQuery() {
        Query test = new Query();
        Sale[] output = test.SearchQuery("adidas");
        assertEquals(1, output.length);
    }
}