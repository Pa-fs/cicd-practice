package com.msa_lab.springboot_demo.dto.parking_info;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetParkInfoWrapper {

    @JsonProperty("GetParkInfo")
    private GetParkInfo getParkInfo;
}

