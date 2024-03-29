package com.birthday.harxh.dto.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEventDetailsResponse {
    private String eventid;
    private String eventname;
    private String eventdestination;
    private String price;
    private Long maxparticipants;
    
}
