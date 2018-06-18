package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData 
{
	@Test
	public void testResponsecode()
	{
		
		Response resp=RestAssured.get("http://localhost:8080/pds-geography/lookup/2/9723?active=true");
		int code=resp.getStatusCode();
		System.out.println("Status code is "+code);
		Assert.assertEquals(code, 200);
	}
	
	@Test
	public void testbody()
	{
		Response resp=RestAssured.get("http://localhost:8080/pds-geography/lookup/2/9723?active=true");
		String data=resp.asString();
		System.out.println("Data is "+data);
	}
}
