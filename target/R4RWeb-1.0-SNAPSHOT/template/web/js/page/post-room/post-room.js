var inp = document.getElementsByTagName("input");
for (var i = 0; i < inp.length; i++) {
  var ele = inp[i];
  ele.addEventListener("keyup", (e) => {
    e.target.setAttribute("value", e.target.value);
  });
}
