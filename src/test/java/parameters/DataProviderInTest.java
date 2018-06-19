package parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTest {
  @Test(dataProvider = "geoLookup")
  public void testGeoLookup(Integer typeId, Integer id) {
	  System.out.println("typId: " + "id: " + id);
  }

  @DataProvider(name = "geoLookup")
  public Object[][] geoLookup() {
    return new Object[][] {
      new Object[] { 2, 14468 },
      new Object[] { 2, 1881 },
    };
  }
}
