function checkReg() {
  let rePass = document.getElementById("re-password").value;
  let pass = document.getElementById("pass").value;
  if (pass != rePass) {
    alert("Mật khẩu nhập lại chưa đúng");
    return false;
  }
}
