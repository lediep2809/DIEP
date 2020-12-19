<%--
  Created by IntelliJ IDEA.
  User: ChuPe
  Date: 11/26/2020
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<div class="navbar">
    <!-- Left-side -->
    <div class="nav-logo-search">
        <div class="logo-box">
            <a href="../page/main-page-admin.html">
                <div class="logo-icon"></div>
                <div class="logo-text">R4R</div>
            </a>
        </div>
        <div class="search-box">
            <input
                    type="search"
                    name="search-room"
                    id="search-room"
                    placeholder="Tìm kiếm phòng"
            />
            <a href="../page/search-room.html">Tìm kiếm</a>
        </div>
    </div>

    <!-- Right-side -->
    <div class="action">
        <div class="act-post-room">
            <a href="../page/post-room.html">
                <div class="post-icon"></div>
                <div class="post-text">Duyệt phòng đăng</div>
            </a>
        </div>
        <div class="act-sign-in">
            <a href="../page/login.html">
                <div>Đăng nhập / Đăng ký</div>
            </a>
            <div class="to-rooms">
                <a href="../page/manage-reg-admin.html"
                ><div>Quản lý đăng ký</div></a
                >
                <a href="../page/manage-rooms-admin.html"
                ><div>Quản lý phòng</div></a
                >
                <a href="../page/stats-admin.html"><div>Xem thống kê</div></a>
                <a href="../index.html"><div>Đăng xuất</div></a>
            </div>
        </div>
    </div>
</div>
