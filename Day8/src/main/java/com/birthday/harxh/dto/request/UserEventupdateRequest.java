package com.birthday.harxh.dto.request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEventupdateRequest {
    private String eventid;
    private String eventname;
    private String eventdestination;
    private String price;
    private Long maxparticipants;
}