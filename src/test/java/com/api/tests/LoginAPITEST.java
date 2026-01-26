package com.api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITEST {

    @Test(description = "Verify if Login API is working....")

    public void loginTest(){
        RestAssured.baseURI = "http://64.227.160.186:8080";
        RequestSpecification requestSpecification = RestAssured.given();

        RequestSpecification header = requestSpecification.header("Content-Type", "application/json");
        RequestSpecification body = header.body("{\"username\": \"ruchikapromodya@gmail.com\", \"password\": \"Gq123456\"}");
        Response response = body.post("/api/auth/login");
        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.getStatusCode(),200);
    }
}
