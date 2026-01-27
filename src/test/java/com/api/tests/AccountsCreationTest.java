package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountsCreationTest {

    @Test(description = "Verify if SignUp API is working....")

    public void createAccountTest(){

        SignUpRequest signUpRequest = new SignUpRequest.Builder()
                    .userName("TheRuchika")
                    .firstName("Ruchika")
                    .lastName("Pramodya")
                    .mobileNumber("0719368140")
                    .password("Gq12334")
                    .build();

        AuthService authService = new AuthService();
        Response response = authService.signUp(signUpRequest);

        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.asPrettyString(),"User Registered successfully!\r\n");

    }
}
