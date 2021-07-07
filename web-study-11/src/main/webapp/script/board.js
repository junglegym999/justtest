function boardCheck() {
	if (document.frm.name.value.length == 0) {
		alert("Input your identification");
		return false;
	}
	if (document.frm.pass.value.length == 0) {
		alert("Input your Password");
		return false;
	}
	if (document.frm.title.value.length == 0) {
		alert("Input your Title");
		return false;
	}
	return true;
}
function open_win(url, name) {
	window.open(url, name, "width=500, height = 230");
}
function passCheck() {
	if (document.frm.pass.value.length == 0) {
		alert("Please Enter Your Password");
		return false;
	}
	return true;
}
function findDragonball() {
	if (team.find.this.funnyfunction) {
		alert("It's success");
	}
}