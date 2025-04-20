package com.msa_lab.springboot_demo.dto.parking_info;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingDto {
    @JsonProperty("PKLT_NM")
    private String pklt_nm; // 주차장명

    @JsonProperty("ADDR")
    private String addr; // 주소

    @JsonProperty("PKLT_CD")
    private String pklt_cd; // 주차장코드

    @JsonProperty("PKLT_KND")
    private String pklt_knd; // 주차장 종류

    @JsonProperty("PKLT_KND_NM")
    private String pklt_knd_nm; // 주차장 종류명

    @JsonProperty("OPER_SE")
    private String oper_se; // 운영구분

    @JsonProperty("OPER_SE_NM")
    private String oper_se_nm; // 운영구분명

    @JsonProperty("TELNO")
    private String telno; // 전화번호

    @JsonProperty("PRK_NOW_INFO_PVSN_YN")
    private String prk_now_info_pvsn_yn; // 주차현황 정보 제공여부

    @JsonProperty("PRK_NOW_INFO_PVSN_YN_NM")
    private String prk_now_info_pvsn_yn_nm; // 주차현황 정보 제공여부명

    @JsonProperty("TPKCT")
    private String tpkct; // 총 주차면

    @JsonProperty("CHGD_FREE_SE")
    private String chgd_free_se; // 유무료구분

    @JsonProperty("CHGD_FREE_NM")
    private String chgd_free_nm; // 유무료구분명

    @JsonProperty("NGHT_FREE_OPN_YN")
    private String nght_free_opn_yn; // 야간무료개방여부

    @JsonProperty("NGHT_FREE_OPN_YN_NAME")
    private String nght_free_opn_yn_name; // 야간무료개방여부명

    @JsonProperty("WD_OPER_BGNG_TM")
    private String wd_oper_bgng_tm; // 평일 운영 시작시각(HHMM)

    @JsonProperty("WD_OPER_END_TM")
    private String wd_oper_end_tm; // 평일 운영 종료시각(HHMM)

    @JsonProperty("WE_OPER_BGNG_TM")
    private String we_oper_bgng_tm; // 주말 운영 시작시각(HHMM)

    @JsonProperty("WE_OPER_END_TM")
    private String we_oper_end_tm; // 주말 운영 종료시각(HHMM)

    @JsonProperty("LHLDY_BGNG")
    private String lhldy_bgng; // 공휴일 운영 시작시각(HHMM)

    @JsonProperty("LHLDY")
    private String lhldy; // 공휴일 운영 종료시각(HHMM)

    @JsonProperty("LAST_DATA_SYNC_TM")
    private String last_data_sync_tm; // 최종데이터 동기화 시간

    @JsonProperty("SAT_CHGD_FREE_SE")
    private String sat_chgd_free_se; // 토요일 유,무료 구분

    @JsonProperty("SAT_CHGD_FREE_NM")
    private String sat_chgd_free_nm; // 토요일 유,무료 구분명

    @JsonProperty("LHLDY_YN")
    private String lhldy_yn; // 공휴일 유,무료 구분

    @JsonProperty("LHLDY_NM")
    private String lhldy_nm; // 공휴일 유,무료 구분명

    @JsonProperty("MNTL_CMUT_CRG")
    private String mntl_cmut_crg; // 월 정기권 금액

    @JsonProperty("CRB_PKLT_MNG_GROUP_NO")
    private String crb_pklt_mng_group_no; // 노상 주차장 관리그룹번호

    @JsonProperty("PRK_CRG")
    private String prk_crg; // 기본 주차 요금

    @JsonProperty("PRK_HM")
    private String prk_hm; // 기본 주차 시간(분 단위)

    @JsonProperty("ADD_CRG")
    private String add_crg; // 추가 단위 요금

    @JsonProperty("ADD_UNIT_TM_MNT")
    private String add_unit_tm_mnt; // 추가 단위 시간(분 단위)

    @JsonProperty("BUS_PRK_CRG")
    private String bus_prk_crg; // 버스 기본 주차 요금

    @JsonProperty("BUS_PRK_HM")
    private String bus_prk_hm; // 버스 기본 주차 시간(분 단위)

    @JsonProperty("BUS_PRK_ADD_HM")
    private String bus_prk_add_hm; // 버스 추가 단위 시간(분 단위)

    @JsonProperty("BUS_PRK_ADD_CRG")
    private String bus_prk_add_crg; // 버스 추가 단위 요금

    @JsonProperty("DLY_MAX_CRG")
    private String dly_max_crg; // 일 최대 요금

    @JsonProperty("LAT")
    private String lat; // 위도

    @JsonProperty("LOT")
    private String lot; // 경도
}
