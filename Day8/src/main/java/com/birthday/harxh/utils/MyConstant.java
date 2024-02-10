package com.birthday.harxh.utils;

import static org.springframework.http.HttpMethod.*;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;

public class MyConstant {
    public static final String AUTH="/api/v1/auth";
    public static final String USER = "api/v1/user";

    //endpoints
    public static final String REGISTER="/register";
    public static final String LOGIN="/login";
    public static final String USERLIST = "/userList";
    public static final String ADDEVENT="/addevent";
    public static final String UPDATEVENT="/updatevent";
    public static final String DELETEEVENT="/deleteevent";
    public static final String EVENTLIST="/eventlist";



    public static final List<String> ORIGINS=Arrays.asList("https://localhost:8181");
    public static final List<String> HEADERS=Arrays.asList(HttpHeaders.AUTHORIZATION,HttpHeaders.CONTENT_TYPE);
    public static final List<String> METHODS=Arrays.asList(GET.name(),POST.name(),
    PUT.name(),PATCH.name(),DELETE.name(),HEAD.name());

    //JsonWebTokens
    public static final String SWAGGER_LOCALHOST_URL = "http://localhost:8181";
    public static final String SWAGGER_SECURITY_SCHEME_NAME= "bearerAuth";
    public static final String SWAGGER_SCHEME = "bearer";
    public static final String SWAGGER_BEARER_FORMAT = "JWT";
    public static final String SWAGGER_DESCRIPTION = "Produce a Json Web Token.";
    

}
