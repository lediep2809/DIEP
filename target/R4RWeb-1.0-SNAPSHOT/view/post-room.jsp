<%--
  Created by IntelliJ IDEA.
  User: ChuPe
  Date: 12/11/2020
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/common/taglib.jsp"%>
<html>
<div class="container">
    <form action="<c:url value='/dang-phong'/>" id="post-room" method="post">
        <h1>Đăng phòng</h1>
        <p>*Trước khi duyệt, chúng tôi sẽ liên hệ với bạn để xác nhận</p>
        <div class="name input-wrap">
            <input
                    value=""
                    type="text"
                    name="room-name"
                    id="room-name"
                    required
            />
            <label for="room-name">Tên phòng</label>
        </div>

        <div class="address">
            <div class="city">
                <select name="room-city" id="room-city">
                    <option value="Thành phố / Tỉnh" selected disabled>
                        Thành phố / Tỉnh
                    </option>
                    <option value="Hà Nội">Hà Nội</option>
                </select>
            </div>
            <div class="district">
                <select name="room-district" id="room-district">
                    <option value="Quận / Huyện" selected disabled>
                        Quận / Huyện
                    </option>
                    <option value="Cầu Giấy">Cầu Giấy</option>
                    <option value="Đống Đa">Đống Đa</option>
                    <option value="Nam Từ Liêm">Nam Từ Liêm</option>
                    <option value="Thanh Trì">Thanh Trì</option>
                    <option value="Thanh Xuân">Thanh Xuân</option>
                </select>
            </div>
            <div class="ward">
                <select name="room-ward" id="room-ward">
                    <option value="Phường / Xã" selected disabled>Phường / Xã</option>
                    <option value="Quan Hoa">Quan Hoa</option>
                    <option value="Quan Nhân">Quan Nhân</option>
                    <option value="Láng">Láng</option>
                    <option value="Mễ Trì Hạ">Mễ Trì Hạ</option>
                    <option value="Mễ Trì Thượng">Mễ Trì Thượng</option>
                    <option value="Triều Khúc">Triều Khúc</option>
                </select>
            </div>
            <div class="number input-wrap">
                <input
                        value=""
                        type="text"
                        name="house-number"
                        id="house-number"
                        required
                />
                <label for="house-number">Số nhà</label>
            </div>
            <div class="street input-wrap">
                <input
                        value=""
                        type="text"
                        name="house-street"
                        id="house-street"
                        required
                />
                <label for="house-street">Tên đường</label>
            </div>
        </div>

        <div class="power">
            <div class="type">
                <select name="room-type" id="room-type">
                    <option value="Loại phòng" selected disabled>Loại phòng</option>
                    <option value="Phòng cho thuê">Phòng cho thuê</option>
                    <option value="Phòng ở ghép">Phòng ở ghép</option>
                </select>
            </div>
            <div class="area input-wrap">
                <input
                        value=""
                        type="text"
                        name="room-area"
                        id="room-area"
                        required
                />m²
                <label for="room-area">Diện tích</label>
            </div>
            <div class="contain input-wrap">
                <input
                        value=""
                        type="text"
                        name="room-contain"
                        id="room-contain"
                        required
                />
                <label for="room-contain">Sức chứa</label>
            </div>
            <div class="gender">
                <select name="room-gender" id="room-gender">
                    <option value="không phân biệt" selected>không phân biệt</option>
                    <option value="nam">nam</option>
                    <option value="nữ">nữ</option>
                </select>
            </div>
            <div class="status input-wrap">
                <input
                        value=""
                        type="text"
                        name="room-status"
                        id="room-status"
                        required
                />
                <label for="room-status">Tình trạng phòng</label>
            </div>
        </div>

        <div class="description input-wrap">
            <input
                    value=""
                    type="text"
                    name="room-description"
                    id="room-description"
            />
            <label for="room-description">Mô tả</label>
        </div>

        <div class="common-price">
            <div class="price-wrapper">
                <div class="price input-wrap">
                    <input
                            value=""
                            type="text"
                            name="room-price"
                            id="room-price"
                            required
                    />
                    <label for="room-price">Giá phòng</label>
                </div>
                <div class="unit">
                    <select name="price-unit" id="price-unit">
                        <option value="trên 1 người" selected>/người</option>
                        <option value="trên 1 phòng">/phòng</option>
                    </select>
                </div>
            </div>
            <div class="deposit input-wrap">
                <input
                        value=""
                        type="text"
                        name="room-deposit"
                        id="room-deposit"
                        required
                />
                <label for="room-deposit">Đặt cọc</label>
            </div>
        </div>

        <div class="fee">
            <div class="price input-wrap">
                <input
                        value=""
                        type="text"
                        name="electric-price"
                        id="electric-price"
                        required
                />
                <label for="electric-price">Tiền điện</label>
            </div>
            <div class="unit">
                <select name="electric-unit" id="electric-unit">
                    <option value="trên 1 số" selected>/số</option>
                    <option value="trên 1 người">/người</option>
                </select>
            </div>
            <div class="price input-wrap">
                <input
                        value=""
                        type="text"
                        name="water-price"
                        id="water-price"
                        required
                />
                <label for="water-price">Tiền nước</label>
            </div>
            <div class="unit">
                <select name="water-unit" id="water-unit">
                    <option value="trên 1 số" selected>/số</option>
                    <option value="trên 1người">/người</option>
                </select>
            </div>
            <div class="other-price input-wrap">
                <input
                        value=""
                        type="text"
                        name="room-other-price"
                        id="room-other-price"
                />
                <label for="room-other-price">Chi phí khác</label>
            </div>
        </div>

        <div class="owner-wrapper">
            <div class="owner input-wrap">
                <input
                        value=""
                        type="text"
                        name="house-owner"
                        id="house-owner"
                        required
                />
                <label for="house-owner">Chủ nhà</label>
            </div>
            <div class="owner input-wrap">
                <input
                        value=""
                        type="text"
                        name="owner-phone"
                        id="owner-phone"
                        required
                />
                <label for="owner-phone">SĐT chủ nhà</label>
            </div>
        </div>

        <div class="utilities">
            <h2>Tiện ích</h2>
            <div class="option">
                <div class="option-group">
                    <input
                            id="dieu-hoa"
                            type="checkbox"
                            name="utilities"
                            value="điều hoà"
                            class="checkbox"
                    />
                    <label for="dieu-hoa">Điều hòa</label>
                    <input
                            id="giuong"
                            type="checkbox"
                            name="utilities"
                            value="giường"
                            class="checkbox"
                    />
                    <label for="giuong"> Giường</label>

                    <input
                            id="tu-do"
                            type="checkbox"
                            name="utilities"
                            value="tủ đồ"
                            class="checkbox"
                    />
                    <label for="tu-do"> Tủ đồ</label>

                    <input
                            id="tu-lanh"
                            type="checkbox"
                            name="utilities"
                            value="tủ lạnh"
                            class="checkbox"
                    />
                    <label for="tu-lanh">Tủ lạnh</label>
                </div>
                <div class="option-group">
                    <input
                            id="ban-cong"
                            type="checkbox"
                            name="utilities"
                            value="ban công"
                            class="checkbox"
                    />
                    <label for="ban-cong">Ban công</label>

                    <input
                            id="gac-xep"
                            type="checkbox"
                            name="utilities"
                            value="gác xép"
                            class="checkbox"
                    />
                    <label for="gac-xep">Gác xép</label>

                    <input
                            id="ke-bep"
                            type="checkbox"
                            name="utilities"
                            value="kệ bếp"
                            class="checkbox"
                    />
                    <label for="ke-bep">Kệ bếp</label>

                    <input
                            id="phong-tam"
                            type="checkbox"
                            name="utilities"
                            value="phòng tắm"
                            class="checkbox"
                    />
                    <label for="phong-tam">Phòng tắm</label>
                </div>
                <div class="option-group">
                    <input
                            id="chung-chu"
                            type="checkbox"
                            name="utilities"
                            value="chung chủ"
                            class="checkbox"
                    />
                    <label for="chung-chu">Chung chủ</label>

                    <input
                            id="gui-xe"
                            type="checkbox"
                            name="utilities"
                            value="gửi xe"
                            class="checkbox"
                    />
                    <label for="gui-xe">Gửi xe</label>

                    <input
                            id="thu-cung"
                            type="checkbox"
                            name="utilities"
                            value="thú cưng"
                            class="checkbox"
                    />
                    <label for="thu-cung">Thú cưng</label>

                    <input
                            id="Tivi"
                            type="checkbox"
                            name="utilities"
                            value="tivi"
                            class="checkbox"
                    />
                    <label for="Tivi">Tivi</label>
                </div>
                <div class="option-group">
                    <input
                            id="cua-so"
                            type="checkbox"
                            name="utilities"
                            value="cửa sổ"
                            class="checkbox"
                    />
                    <label for="cua-so">Cửa sổ</label>

                    <input
                            id="may-giat"
                            type="checkbox"
                            name="utilities"
                            value="máy giặt"
                            class="checkbox"
                    />
                    <label for="may-giat"> Máy giặt</label>

                    <input
                            id="nong-lanh"
                            type="checkbox"
                            name="utilities"
                            value="nóng lạnh"
                            class="checkbox"
                    />
                    <label for="nong-lanh"> Nóng lạnh </label>

                    <input
                            id="wifi"
                            type="checkbox"
                            name="utilities"
                            value="wifi"
                            class="checkbox"
                    />
                    <label for="wifi"> Wifi</label>
                </div>
            </div>
        </div>

        <div class="end-form">
            <div class="img-submit-box input-wrap">
            <textarea
                    class="textarea"
                    name="img-submit"
                    id="img-submit"
                    value=""
            >
            </textarea>

                <label for="img-submit"
                >Tải ảnh lên
                    <span class="note">
                (Đăng file ảnh lên pasteboard.co rồi dẫn link tới từng ảnh, mỗi
                ảnh trên một dòng)
              </span></label
                >
            </div>
            <div class="button">
                <div class="to-main-page">
                    <a href="../page/main-page-normal.html">Về trang chủ</a>
                </div>
                <button type="reset" class="button-reset">Điền lại</button>
                <button type="submit" class="button-submit">Đăng phòng</button>
            </div>
        </div>
    </form>
</div>

</html>