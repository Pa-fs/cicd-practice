package com.msa_lab.springboot_demo.dto.parking_info;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetParkInfo {
    private int list_total_count;
    @JsonProperty("RESULT")
    private ResultDto result;
    private List<ParkingDto> row;
}

