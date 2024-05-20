var currentForm;

function makeForm(obj) {
	var form = document.createElement('form');
	form.method = 'get';
	form.accept_charset = 'utf-8';
	for(ele in obj) {
		var input = document.createElement('input');
		input.type = 'hidden';
		input.name = ele;
		input.value = obj[ele];
		form.appendChild(input);
	}
	document.body.appendChild(form);
	return form;
}

function urlDecoding(data) {
	var ca = /\+/g;
	return decodeURIComponent(data.replace(ca, " "));
}

Number.prototype.number_format = function(round_decimal) {
	return this.toFixed(round_decimal).replace(/(\d)(?=(\d{3})+$)/g, "$1,");
};

function setNumber(obj) {
	var val = obj.value;
	var re = /[^0-9]/gi;
	obj.value = val.replace(re, "");
}

function addComma(data_value) {
	
	var txtNumber = '' + data_value;
	if (isNaN(txtNumber) || txtNumber == "") {
		alert("숫자만 입력 하세요");
		return;
    } else {
		var rxSplit = new RegExp('([0-9])([0-9][0-9][0-9][,.])');
		var arrNumber = txtNumber.split('.');
		arrNumber[0] += '.';
		do {
			arrNumber[0] = arrNumber[0].replace(rxSplit, '$1,$2');
		} while (rxSplit.test(arrNumber[0]));
		 
		if (arrNumber.length > 1) {
			return arrNumber.join('');
		} else {
			return arrNumber[0].split('.')[0]; // 위에서 정수부 끝에 붙여준 마침표(.)를 그대로 제거함.
		}
	}
}

function datetime_format (date) {
	year = "" + date.getFullYear();
	month = "" + (date.getMonth() + 1); if (month.length == 1) { month = "0" + month; }
	day = "" + date.getDate(); if (day.length == 1) { day = "0" + day; }
	hour = "" + date.getHours(); if (hour.length == 1) { hour = "0" + hour; }
	minute = "" + date.getMinutes(); if (minute.length == 1) { minute = "0" + minute; }
	second = "" + date.getSeconds(); if (second.length == 1) { second = "0" + second; }
	return year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second;
}

function date_format (date) {
	year = "" + date.getFullYear();
	month = "" + (date.getMonth() + 1); if (month.length == 1) { month = "0" + month; }
	day = "" + date.getDate(); if (day.length == 1) { day = "0" + day; }
	return year + "-" + month + "-" + day;
}

function addDate(date, amount, type) {
	if(type == 'y') {
		date.setYear(date.getFullYear() + amount);
	} else if(type == 'm') {
		date.setMonth(date.getMonth() + amount);
	} else if(type == 'd') {
		date.setDate(date.getDate() + amount);
	}
	
	return date;
}

function rPad(targetStr, columnLength, regex) {
	var targetLength = targetStr.length;
	for(var i = targetLength; i < columnLength; i++) {
		targetStr = targetStr + regex;
	}
	return targetStr;
}

function jsOnlyNumber(obj) {
	obj.value = obj.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');
}

function jqOnlyNumber(obj) {
	var inputVal = $(obj).val();
	var replaceVal = inputVal.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');
	$(obj).val(replaceVal);
	
}

function excelTypeDownload(type, name) {
	var tableID = $("#tableExcel");
	var tableObj = new Object();
	var headerAry = new Array();
	var dataArray = new Array();
	
	/** Header Setting **/
	$(tableID).find("thead tr th").each(function() {
		headerAry.push($(this).html());
	});
	/** Header Setting **/
	
	/** Data Setting **/
	$(tableID).find("tbody tr").each(function() {
		var obj = new Array();
		$(this).find("td").each(function() {
			obj.push($(this).html());
		});
		dataArray.push(obj);
	});
	/** Data Setting **/
	
	$.ajax({
		url: "/sml/excel/createExcel",
		type: "post",
		data: {
			fileName: name,
			excelType: type,
			title: name,
			headJsonAryStr: JSON.stringify(headerAry),
			dataJsonAryStr: JSON.stringify(dataArray)
		},
		success: function(data) {
			var resultObj = JSON.parse(urlDecoding(data));
			if(resultObj.status == 'ok') {
				var obj = {
					folderName: resultObj.folderPath,
					fileName: resultObj.fileName
				};
				
				var form = makeForm(obj);
				form.action = "/sml/file/download.do";
				form.method = "post";
				form.submit();
			}
		},
		error: function(xhr, status, err) {
			if (xhr.status == 401) {
				alert("401");
			} else if (xhr.status == 403) {
				alert("403");
			} else if (xhr.status == 500) {
				location.href = "/sml/employeeLogin.do";
			} else {
				console.log(xhr.status + ", " + status + ", " + err);
//				alert("예외가 발생했습니다. 관리자에게 문의하세요.");
			}
		}
	});
}

function callAjax(url, type, paramObject, successFn) {
	$.ajax({
		url: url,
		headers: {
			'AJAX':true
		},
		type: type,
		data: paramObject,
		success: successFn,
		error: function(xhr, status, err) {
			if (xhr.status == 401) {
				alert("401");
			} else if (xhr.status == 403) {
				alert("403");
			} else if (xhr.status == 500) {
				
//				location.href = "/mmm/";
			} else {
				console.log(xhr.status + ", " + status + ", " + err);
//				alert("예외가 발생했습니다. 관리자에게 문의하세요.");
			}
		}
	});		
}

