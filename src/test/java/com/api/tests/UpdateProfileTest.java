package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.response.LoginResponse;
import com.api.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateProfileTest {

    @Test

    public void updateProfile(){

        AuthService authService = new AuthService();

        Response response = authService.login(new LoginRequest("ruchikapromodya@gmail.com","GQ12345"));
        LoginResponse loginResponse = response.as(LoginResponse.class);

        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
        response = userProfileManagementService.getProfile(loginResponse.getToken());
        System.out.println(response.asPrettyString());
        UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);

        Assert.assertEquals(userProfileResponse.getUsername(),"ruchikapromodya@gmail.com");

        System.out.println("_________________________________________________________________");


        ProfileRequest profileRequest = new ProfileRequest.Builder()
                .firstName("Ruchika")
                .lastName("Kaludewa")
                .email("ruchikapromodya@gmail.com")
                .mobileNumber("0719368140")
                .build();


        response = userProfileManagementService.updateProfile(loginResponse.getToken(),profileRequest);
        System.out.println(response.asPrettyString());

    }
}
