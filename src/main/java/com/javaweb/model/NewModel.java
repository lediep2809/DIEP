package com.javaweb.model;

public class NewModel extends AbstractModel<NewModel> {
	
	private String title;//tên phòng
	private String thumbnail;//bỏ
	private String shortDescription;// tình trang p
	private String content; // mô tả
	private Long categoryId;
	private String categoryCode;
	private String price;
	private String deposit;
	private String adress;
	private String sonha;
	private String tenduong;
	private String dientich;
	private String succhua;
	private Long Gtinh;
	private String name;
	private Long sdt;
	private String priceE;
	private String priceW;
	private String priceOther;


	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getSonha() {
		return sonha;
	}

	public void setSonha(String sonha) {
		this.sonha = sonha;
	}

	public String getTenduong() {
		return tenduong;
	}

	public void setTenduong(String tenduong) {
		this.tenduong = tenduong;
	}

	public String getDientich() {
		return dientich;
	}

	public void setDientich(String dientich) {
		this.dientich = dientich;
	}

	public String getSucchua() {
		return succhua;
	}

	public void setSucchua(String succhua) {
		this.succhua = succhua;
	}

	public Long getGtinh() {
		return Gtinh;
	}

	public void setGtinh(Long gtinh) {
		Gtinh = gtinh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSdt() {
		return sdt;
	}

	public void setSdt(Long sdt) {
		this.sdt = sdt;
	}

	public String getPriceE() {
		return priceE;
	}

	public void setPriceE(String priceE) {
		this.priceE = priceE;
	}

	public String getPriceW() {
		return priceW;
	}

	public void setPriceW(String priceW) {
		this.priceW = priceW;
	}

	public String getPriceOther() {
		return priceOther;
	}

	public void setPriceOther(String priceOther) {
		this.priceOther = priceOther;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
