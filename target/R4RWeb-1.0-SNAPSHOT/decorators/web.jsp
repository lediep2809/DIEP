<%--
  Created by IntelliJ IDEA.
  User: ChuPe
  Date: 11/26/2020
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title><dec:title default="Trang chủ"/></title>

    <link rel="stylesheet" href=" <c:url value='/template/web/css/common/main.css' />"/>
    <link rel="stylesheet" href="<c:url value='/template/web/css/page/main-page/navbar.css' />"/>
    <link rel="stylesheet" href="<c:url value='/template/web/css/page/main-page/content.css'  />"/>
    <link rel="stylesheet" href="<c:url value='/template/web/css/page/main-page/footer.css'  />"/>

</head>
<body>

<!-- header -->
<%@ include file="/common/web/header.jsp" %>
<!-- header -->

<div class="container">
    <dec:body/>
</div>

<!-- footer -->
<%@ include file="/common/web/footer.jsp" %>
<!-- footer -->

<script src="<c:url value='/template/web/js/common/switch-page.js' />" ></script>
<script src="<c:url value='/template/web/js/common/not-available.js' />" ></script>
<script src="<c:url value='/template/web/js/page/rooms-detail/rooms-detail.js' />" ></script>

</body>
</html>
