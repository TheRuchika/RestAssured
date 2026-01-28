package com.api.filters;

import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;

public class LoginFilter implements Filter {

    private static final Logger logger = LogManager.getLogger(LoginFilter.class);

    public Response filter(FilterableRequestSpecification requestSpecification, FilterableResponseSpecification responseSpecification,
                           FilterContext context){
        logRequest(requestSpecification);
        Response response = context.next(requestSpecification,responseSpecification);//request is going to be executed
        logResponse(response);
        return response; //test for assertion
    }

    public void logRequest(FilterableRequestSpecification requestSpecification){
        logger.info("BASE URI : " + requestSpecification.getBaseUri());
        logger.info("Request Header : " + requestSpecification.getHeaders());
        logger.info("Request PayLoad : "+ requestSpecification.getBody());


    }

    public void logResponse(Response response){
        logger.info("Status Code" + response.getStatusCode());
        logger.info("Response Header" + response.headers());
        logger.info("Response body"+ response.getBody().prettyPrint());

    }

}
