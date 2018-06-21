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
		
		Response resp=RestAssured.get("http://fr-pds-api.xenon.forrent.com/pds-geography/lookup/2/9723?active=true");
		int code=resp.getStatusCode();
		System.out.println("Status code is "+code);
		Assert.assertEquals(code, 200);
	}
	
	/* @Test
	public void testbody()
	{
		Response resp=RestAssured.get("http://fr-pds-api.xenon.forrent.com/pds-geography/lookup/2/9723?active=true");
		//String data=resp.asString();
		String responseBody = response.getBody().asString();
		//System.out.println("Data is "+data);
		System.out.println("Response Body is => " + response.asString());
	} */
	
	@Test //test to get zip code response
	public void ZipCodesResponseOutput()
	{
		RestAssured.baseURI = "http://fr-pds-api.xenon.forrent.com/pds-geography/lookup";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/2/9723?active=true");
		
		//TODO parameterize zip code tests
		
		/*
		 * Additional zip codes for testing: Zipcode (2):14468, 1881, 9723
		 */
		
		ResponseBody<?> body = response.getBody();
		System.out.println("Response Body is =>  " + body.asString());
	}
	
	@Test //test to get cities code response
	public void CitiesResponseOutput()
	{
		RestAssured.baseURI = "http://fr-pds-api.xenon.forrent.com/pds-geography/lookup";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/3/46627?active=true");
		
		//TODO parameterize cities tests
		
		/*
		 * Additional cities codes for testing: Cities (3): 46627, 21523, 21525, 46629
		 */
		
		ResponseBody<?> body = response.getBody();
		System.out.println("Response Body is =>  " + body.asString());
	}
	


	@Test //test to get county code response
	public void CountyResponseOutput()
	{
		RestAssured.baseURI = "http://fr-pds-api.xenon.forrent.com/pds-geography/lookup";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/10/1863?active=true");
		
		//TODO parameterize county tests
		
		/*
		 * Additional county codes for testing: County (10):
        Can't be used currently but: 1863, 1821, 1728
		 */
		
		ResponseBody<?> body = response.getBody();
		System.out.println("Response Body is =>  " + body.asString());
	
	}
	
	@Test //test to get state code response
	public void StateResponseOutput()
	{
		RestAssured.baseURI = "http://fr-pds-api.xenon.forrent.com/pds-geography/lookup";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/11/1?active=true");
		
		//TODO parameterize state tests
		
		/*
		 * Additional state codes for testing: States (11):
         Any Number between 1-51 will work here.
		 */
		
		ResponseBody<?> body = response.getBody();
		System.out.println("Response Body is =>  " + body.asString());
	
	}
	
	
}
