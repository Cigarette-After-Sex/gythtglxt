(function () {
    require(['jquery', 'ajaxUtil', 'stringUtil', 'uploadImg', 'objectUtil', 'distpicker', 'alertUtil'],
        function ($, ajaxUtil, stringUtil, uploadImg, objectUtil, distpicker, alertUtil) {

            var url = "/information?itemCode=" + "f324ccba-2e2c-4df2-aeb8-f9f0cd58f5dc";

            var pathUrl = "/informationManage/informationManage";

            var opUrl = "/information";

            var itemcode;

            var itemid;

            var type = "put";

            uploadImg.init();

            const editor = objectUtil.wangEditorUtil();

            $("#cancelBtn").click(function () {
                orange.redirect(pathUrl)
            });

            function generateParam() {
                var param = {};
                param.hospitalName = $("#hospitalName").val();
                param.hospitalPhone = $("#hospitalPhone").val();
                param.hospitalPro = $("#addressPro").val();
                param.hospitalCity = $("#addressCity").val();
                param.hospitalCountry = $("#addressCountry").val();
                param.hospitalAdress = $("#address").val()
                param.introduce = $(".w-e-text").html();
                param.itemcode = itemcode;
                param.itemid = itemid;
                return param;
            }

            $("#saveBtn").unbind('click').on('click', function () {
                var param = generateParam();
                param.status = "0";
                if (uploadImg.isUpdate()) {
                    ajaxUtil.fileAjax(itemcode, uploadImg.getFiles()[0], "lrt", "lrt")
                }

                ajaxUtil.myAjax(null, opUrl, param, function (data) {
                    if (ajaxUtil.success(data)) {
                        orange.redirect(pathUrl);
                    } else {
                        alert(data.msg);
                    }
                }, true, "123", type);
                return false;
            });

            $("#submitBtn").unbind('click').on('click', function () {
                var param = generateParam();
                param.status = "1";
                ajaxUtil.myAjax(null, opUrl, param, function (data) {
                    if (ajaxUtil.success(data)) {
                        orange.redirect(pathUrl)
                    } else {
                        alert(data.msg)
                    }
                }, true, "123", type);
                return false;
            });

            var init = function () {
                var tempdata;
                ajaxUtil.myAjax(null, url, null, function (data) {
                    if (data && data.code == ajaxUtil.successCode) {
                        tempdata = data.data
                    } else {
                        alertUtil.error(data.msg)
                    }
                }, false, "", "get");
                $("#hospitalName").val(tempdata.hospitalName);
                $("#hospitalPhone").val(tempdata.hospitalPhone);
                $("#contacts").val(tempdata.contacts);
                $("#phone").val(tempdata.phone);
                $("#distpicker").distpicker({
                    province: tempdata.hospitalPro,
                    city: tempdata.hospitalCity,
                    district: tempdata.hospitalCountry
                });
                $("#address").val(tempdata.hospitalAdress);
                editor.txt.html(tempdata.introduce);
                uploadImg.setImgSrc(tempdata.filePath);
                itemcode = tempdata.itemcode;
                itemid = tempdata.itemid;
                init = function () {

                }
            };
            init();


        })
})();


