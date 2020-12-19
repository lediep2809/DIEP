<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/common/taglib.jsp"%>


<html>

<body>

	<form action="<c:url value='/trang-chu'/>" id="formLogin" method="post">
		<h1>Đăng nhập</h1>

		<div class="logo-brand">
			<i class="logo"></i>
			<div class="brand">Rooms For Rent</div>
		</div>

<c:if test="${not empty message}">
	<div >
		${alert}
		<p>${message}</p>
	</div>
</c:if>

		<div class="info">
			<div class="phone">
				<label for="phone">Số điện thoại</label> <i class="phone-icon"></i>
				<input type="tel" id="userName" name="userName" placeholder="Số điện thoại" required
					pattern="(\+84|0)\d{9,10}"
					title="Cần nhập đúng định dạng số điện thoại" />
			</div>
			<div class="password">
				<label for="password">Mật khẩu</label> <i class="password-icon"></i>
				<input type="password" id="password" name="password" placeholder="Mật khẩu"
					required
					pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,}$"
					title="Mật khẩu phải bao gồm chữ hoa, chữ thường, ký tự và số" />
			</div>
			<input type="hidden" value="login" name="action"/>
			<button type="submit">Đăng nhập</button>
		</div>
		<div class="redirect">
			<div class="to-main-page">
				<a href="<c:url value='/trang-chu'/>">Về trang chủ</a>
			</div>
			<div class="to-register">
				Chưa có tài khoản? <a href="<c:url value="/dang-ky?action=register"/>">Đăng ký</a>
			</div>
		</div>
	</form>

</body>
</html>
