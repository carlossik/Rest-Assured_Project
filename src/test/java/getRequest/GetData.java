package getRequest;

import getRequest.utils.Utils;
import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
//"https://flippingbook.com

public class GetData {
    // testing that a page returns 404 error
    //flippingbook.com has a 404 page we use here
    @Test
    public void testResponseCode() {
        Response resp = RestAssured.get(Utils.getUrl());
        int code = resp.getStatusCode();
        System.out.println("Status Code is " + code);// print status code out to console

        Assert.assertEquals(code, 200);

    }

    @Test
    public void testResponseCode2() {

        Response resp2 = RestAssured.get(Utils.getUrl());
        String code1 = resp2.getSessionId();
        System.out.println("Session ID is " + code1);
        Assert.assertNull(code1);
    }


    @Test
    public void postMessages(){
        String mhJson = "{\"name\":\"Jimi Hendrix\"}";




    }


}