package Testcategory;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;   // Static import of RESTASSURED 
import io.restassured.response.Response;

public class TestExamplesStaticREST {


	@Test
	public void test_Get() {
		Response response = get("https://reqres.in/api/users?page=2"); //In static way we remove restAssured annotation
		response.getStatusCode();
		response.getTime();

		System.out.println("Get status code"+response.getStatusCode());
		System.out.println("Get time"+response.getTime());
		System.out.println("Get body"+response.getBody().asString());
		System.out.println("Get status line "+response.getStatusLine());
		System.out.println("Get header"+response.getHeader("content-type"));

		int Statuscode = response.getStatusCode();
		Assert.assertEquals(Statuscode, 201 ); // to check if we have correct assert code or not



	}
}
