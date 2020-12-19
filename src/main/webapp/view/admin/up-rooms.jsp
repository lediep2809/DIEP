<%--
  Created by IntelliJ IDEA.
  User: ChuPe
  Date: 12/11/2020
  Time: 5:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<html>
<div class="content">
    <h1>Danh sách phòng đăng chờ duyệt</h1>
    <div class="list-container">
        <div class="list-rooms">
            <h3>Phòng trọ - Quan Nhân 35m²</h3>
            <div class="room-description">
                <div class="room-type">Phòng cho thuê</div>
                <div class="room-area">30m²</div>
                <div class="room-gender">Nam hoặc nữ</div>
            </div>
            <div class="room-price">3.2 triệu</div>
            <button class="accept" type="submit">Duyệt</button>
            <button class="delete" type="submit">Xoá</button>
        </div>
        <div class="list-rooms">
            <h3>Phòng trọ - Quan Nhân</h3>
            <div class="room-description">
                <div class="room-type">Phòng cho thuê</div>
                <div class="room-area">26m²</div>
                <div class="room-gender">Nam hoặc nữ</div>
            </div>
            <div class="room-price">2.8 triệu</div>
            <button class="accept" type="submit">Duyệt</button>
            <button class="delete" type="submit">Xoá</button>
        </div>
        <div class="list-rooms">
            <h3>Phòng trọ - Quan Hoa 25m²</h3>
            <div class="room-description">
                <div class="room-type">Phòng cho thuê</div>
                <div class="room-area">25m²</div>
                <div class="room-gender">Nam hoặc nữ</div>
            </div>
            <div class="room-price">2.7 triệu</div>
            <button class="accept" type="submit">Duyệt</button>
            <button class="delete" type="submit">Xoá</button>
        </div>

        <div class="room-paging">
            <div class="prev-page" onclick="switchPage1()"></div>
            <div class="number-page" onclick="switchPage1()">1</div>
            <div class="number-page" onclick="switchPage2()">2</div>
            <div class="next-page" onclick="switchPage2()"></div>
        </div>
    </div>
</div>

</html>
