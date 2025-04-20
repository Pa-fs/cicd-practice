package com.msa_lab.springboot_demo.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.msa_lab.springboot_demo.dto.parking_info.GetParkInfoWrapper;
import com.msa_lab.springboot_demo.dto.parking_info.ParkingDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/parking")
public class ParkingInfoController {

    @Value("${api.key}")  // application-api-key.yml에서 api.key 값을 읽어옴
    private String apiKey;

    @GetMapping("/info")
    public ResponseEntity<List<ParkingDto>> getParkingInfo() {
//        실시간 주차대수
//        String apiUrl = "http://openapi.seoul.go.kr:8088/" + apiKey + "/json/GetParkingInfo/1/5/강남구";
//        주차장 안내정보
        String apiUrl = "http://openapi.seoul.go.kr:8088/" + apiKey + "/json/GetParkInfo/1/5/신림/%20/1";

        List<ParkingDto> parkingDtos = new ArrayList<>();

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            // 응답 코드 확인
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // 응답 읽기
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // string -> json parsing
                ObjectMapper objectMapper = new ObjectMapper();

                GetParkInfoWrapper wrapper = objectMapper.readValue(response.toString(), GetParkInfoWrapper.class);

                int totalCount = wrapper.getGetParkInfo().getList_total_count();
                String resultCode = wrapper.getGetParkInfo().getResult().getCode();
                parkingDtos = wrapper.getGetParkInfo().getRow();

            } else {
                throw new RuntimeException("GET request failed. Response Code: " + responseCode);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error occurred: " + e.getMessage());
        }

        return ResponseEntity.ok(parkingDtos);
    }
}
