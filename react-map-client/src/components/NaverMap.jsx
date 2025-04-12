import { useEffect, useRef } from "react";

const NaverMap = () => {
  const mapRef = useRef(null); // div 요소 참조용
  const mapInstanceRef = useRef(null); // map 객체 저장

  useEffect(() => {
    // 네이버 지도 API 스크립트 삽입
    const script = document.createElement("script");
    script.src =
      "https://oapi.map.naver.com/openapi/v3/maps.js?ncpKeyId=ilsjkbuxu2";
    script.async = true;
    script.onload = () => {
      // 지도 인스턴스 생성
      const map = new window.naver.maps.Map(mapRef.current, {
        center: new window.naver.maps.LatLng(37.5665, 126.978), // 서울 시청 좌표
        zoom: 13,
      });

      mapInstanceRef.current = map;

      // fetch로 서버에서 전월세 좌표 가져옴
      fetch("/api/rentals")
        .then((res) => res.json())
        .then((data) => {
          data.forEach((rental) => {
            if (!rental.latitude || !rental.longitude) return;

            // 여기서 공식문서 방식 그대로 사용
            const marker = new window.naver.maps.Marker({
              position: new window.naver.maps.LatLng(
                rental.latitude,
                rental.longitude
              ),
              map: map, // 명시적으로 map 객체 넘겨줌
            });

            const infoWindow = new window.naver.maps.InfoWindow({
              content: `
                <div style="padding:8px;">
                  <strong>${rental.buildingName || "건물명 없음"}</strong><br/>
                  ${rental.address}
                </div>
              `,
            });

            window.naver.maps.Event.addListener(marker, "click", () => {
              infoWindow.open(map, marker);
            });
          });
        });
    };

    document.head.appendChild(script);
  }, []);

  return (
    <div
      ref={mapRef}
      style={{ width: "100%", height: "500px", border: "1px solid #ddd" }}
    />
  );
};

export default NaverMap;
