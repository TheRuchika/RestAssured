package com.api.tests;

import com.api.base.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class LoginAPITEST3 {

    @Test(description = "Verify if Login API is working....")

    public void loginTest(){
        AuthService authService = new AuthService();
        Response response = authService.login("{\"username\": \"ruchikapromodya@gmail.com\", \"password\": \"Gq123456\"}");


        System.out.println(response.asPrettyString());
    }
}
