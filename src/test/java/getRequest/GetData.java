package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

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
	
	/* @Test
	public void testbody()
	{
		Response resp=RestAssured.get("http://localhost:8080/pds-geography/lookup/2/9723?active=true");
		//String data=resp.asString();
		String responseBody = response.getBody().asString();
		//System.out.println("Data is "+data);
		System.out.println("Response Body is => " + response.asString());
	} */
	
	@Test
	public void ResponseOutput()
	{
		RestAssured.baseURI = "http://localhost:8080/pds-geography/lookup";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/id/testId?active=true");
		//String responseBody = response.getBody().asString();
		ResponseBody<?> body = response.getBody();
		System.out.println("Response Body is =>  " + body.asString());
	}
}
