
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>

</head>
<body>
<div>
	 <form action=" " onsubmit="return checkReg()">
        <h1>Đăng ký</h1>

        <div class="logo-brand">
          <i class="logo"></i>
          <div class="brand">Rooms For Rent</div>
        </div>

        <div class="info">
          <div class="name">
            <label for="username">Họ và tên</label>
            <i class="name-icon"></i>
            <input
              type="text"
              name="username"
              placeholder="Họ và tên"
              required
            />
          </div>
          <div class="phone">
            <label for="phone">Số điện thoại</label>
            <i class="phone-icon"></i>
            <input
              type="tel"
              name="phone"
              placeholder="Số điện thoại"
              required
              pattern="(\+84|0)\d{9,10}"
              title="Cần nhập đúng định dạng số điện thoại"
            />
          </div>
          <div class="password">
            <label for="password">Mật khẩu</label>
            <i class="password-icon"></i>
            <input
              type="password"
              name="password"
              id="pass"
              placeholder="Mật khẩu"
              required
              pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,}$"
              title="Mật khẩu phải bao gồm chữ hoa, chữ thường, ký tự và số"
            />
            <div class="re-pass">
              <label for="re-password">Nhập lại mật khẩu: </label>
              <i class="re-pass-icon"></i>
              <input
                type="password"
                name="re-password"
                id="re-password"
                placeholder="Nhập lại mật khẩu"
                required
                pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,}$"
                title="Mật khẩu phải bao gồm chữ hoa, chữ thường, ký tự và số"
                onblur="checkReg()"
              />
            </div>
          </div>
          <button type="submit">Đăng ký</button>
        </div>
        <div class="redirect">
          <div class="to-main-page">
            <a href="<c:url value = "/trang-chu"/>">Về trang chủ</a>
          </div>
          <div class="to-register">
            Đã có tài khoản?
            <a href="<c:url value='/dang-nhap?action=login'/>">Đăng nhập</a>
          </div>
        </div>
      </form>
    </div>

</body>
</html>