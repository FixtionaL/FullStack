package com.birthday.harxh.service;

import com.birthday.harxh.dto.request.UserEventIdrequest;
import com.birthday.harxh.dto.request.UserEventRequest;
import com.birthday.harxh.dto.request.UserEventupdateRequest;
import com.birthday.harxh.dto.response.BasicResponse;
import com.birthday.harxh.dto.response.UserEventDetailsResponse;
import com.birthday.harxh.dto.response.UserEventResponse;

public interface EventService {
    
    UserEventResponse addEventResponse(UserEventRequest request);
    UserEventResponse UpdateEventResponse(UserEventupdateRequest request);
    UserEventResponse deleteEventResponse(UserEventIdrequest request);
    BasicResponse<UserEventDetailsResponse> getAll();
}