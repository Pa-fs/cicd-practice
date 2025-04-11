package com.msa_lab.springboot_demo;

import com.msa_lab.springboot_demo.dto.RentalDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/rentals")
public class MapController {

    @GetMapping
    public List<RentalDto> getAllRentals() {
        // https://dapi.kakao.com/v2/local/search/address.json?query=서울 구로구 천왕동 0273-0000
        // 공공데이터API -> 카카오 주소변환 API -> 좌표 INSERT 후 DB에서 쿼리했다고 가정
        List<RentalDto> rentalDtos = new ArrayList<>();
        rentalDtos.add(new RentalDto(
                1L,
                "천왕 이펜하우스 4단지",
                "서울 구로구 천왕동 273",
                37.4806068586758,
                126.837972197254
        ));
        return rentalDtos;
    }
}
