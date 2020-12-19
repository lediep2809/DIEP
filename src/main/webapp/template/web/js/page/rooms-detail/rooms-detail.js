let rooms = document.getElementsByClassName("rooms");
for (let i = 0; i < rooms.length; i++) {
  rooms[i].addEventListener("click", function () {
    location.href = "/trang-chu";
  });
}
