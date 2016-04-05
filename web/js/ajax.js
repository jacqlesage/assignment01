/*global $, jQuery */
/*jslint vars: true, devel: true, white: true, */

var GetAjax = (function () {

    "use strict";
    var pub = {};

    function doStuff(data){
        // var tester = JSON.parse(data);
        console.log(tester + " tester");
        console.log(typeof tester);

    }

    pub.setup = function () {

        $.ajax({
            type: "GET",
            url: "http://dollarluxury.xyz/json/test.json",
            dataType: "text",
            cache: false,
            success: function (data) {
                console.log(data);
                console.log(typeof data);
                doStuff(data);
            },
            error: function (request, status, error) {
                console.log(request);
                console.log(status);
                console.log(error);
            }
        });
    };

    return pub;

}());
$(document).ready(GetAjax.setup);
