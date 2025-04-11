package com.msa_lab.springboot_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentalDto {
    private Long id;
    private String buildingName;
    private String address;
    private Double latitude;
    private Double longitude;
//    private Long deposit;
//    private Long monthlyRent;
//    private Double area;
//    private Integer floor;
//    private String contractDate;

//    public static RentalDto fromEntity(Rental rental) {
//        return new RentalDto(
//                rental.getId(),
//                rental.getBuildingName(),
//                rental.getAddress(),
//                rental.getLatitude(),
//                rental.getLongitude(),
//                rental.getDeposit(),
//                rental.getMonthlyRent(),
//                rental.getArea(),
//                rental.getFloor(),
//                rental.getContractDate().toString()
//        );
//    }
}
