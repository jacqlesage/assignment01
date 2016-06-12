/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// alert("hello chantelqqq");
function makeDetailsEditable()
{
     if(document.getElementById("checkedBox").checked){
    document.getElementById("age").readOnly = false;
    document.getElementById("name").readOnly = false;
    document.getElementById("email").readOnly = false;
    document.getElementById("phone").readOnly = false;
    document.getElementById("address").readOnly = false;
    document.getElementById("address2").readOnly = false;
    document.getElementById("postcode").readOnly = false;
    document.getElementById("suburb").readOnly = false;
    document.getElementById("city").readOnly = false;
        
     }else{
    document.getElementById("age").readOnly = true;
    document.getElementById("name").readOnly = true;
    document.getElementById("email").readOnly = true;
    document.getElementById("phone").readOnly = true;
    document.getElementById("address").readOnly = true;
    document.getElementById("address2").readOnly = true;
    document.getElementById("postcode").readOnly = true;
    document.getElementById("suburb").readOnly = true;
    document.getElementById("city").readOnly = true;
     }
}
