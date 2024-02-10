

package com.birthday.harxh.dto.response;

import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BasicResponse<T> {
    private String message;


    @Builder.Default    //for preventing the return null in the data (i.e) list, as it is generic
    private List<T> data=Collections.emptyList();
}