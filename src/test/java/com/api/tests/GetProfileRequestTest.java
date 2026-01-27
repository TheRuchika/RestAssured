package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.response.LoginResponse;
import com.api.response.UserProfileResponse;
import io.restassured.response.Response;
import org.apache.commons.logging.Log;
import org.testng.annotations.Test;

public class GetProfileRequestTest {

@Test
    public void getProfileInfo(){

    AuthService authService = new AuthService();
    Response response = authService.login(new LoginRequest("ruchikapromodya@gmail.com","Gq12345"));
    LoginResponse loginResponse = response.as(LoginResponse.class);
    System.out.println(loginResponse.getToken());

    UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
    response = userProfileManagementService.getProfile(loginResponse.getToken());
    UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
    System.out.println(userProfileResponse.getUsername());

    }


}
