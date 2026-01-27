package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITEST3 {

    @Test(description = "Verify if Login API is working....")

    public void loginTest(){

        LoginRequest loginRequest = new LoginRequest("ruchikapromodya@gmail.com","Gq123456");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);

        System.out.println(response.asPrettyString());
        System.out.println(loginResponse.getToken());
        System.out.println(loginResponse.getEmail());
        System.out.println(loginResponse.getUsername());

        Assert.assertTrue(loginResponse.getToken() !=null);
        Assert.assertEquals(loginResponse.getEmail(),"ruchikapromodya@gmail.com");
        Assert.assertEquals(loginResponse.getId(),3985);
    }
}
