var hamburger = document.querySelector(".hamburger");
var menu = document.querySelector(".menu");

hamburger.addEventListener("click", function(){
  menu.classList.toggle("active");
});

$("#three").prop("checked", true);
$("input:radio[name='number']").prop('checked', true); 



$('.pw').focusout(function () {
  var pwd1 = document.getElementById('pw1').value;
  var pwd2 = document.getElementById('pw2').value;

  if ( pwd1 != '' && pwd2 == '' ) {
      null;
  } else if (pwd1 != "" || pwd2 != "") {
      if (pwd1 == pwd2) {

      } else {
          // 비밀번호 불일치 이벤트 실행
          alert("비밀번호가 일치하지 않습니다. 비밀번호를 재확인해주세요.");
          $('#pw2').val('');
          return false;
      }
  }




});


/*Dropdown Menu*/
$('.dropdown').click(function () {
        $(this).attr('tabindex', 1).focus();
        $(this).toggleClass('active');
        $(this).find('.dropdown-menu').slideToggle(300);
    });
    $('.dropdown').focusout(function () {
        $(this).removeClass('active');
        $(this).find('.dropdown-menu').slideUp(300);
    });
    $('.dropdown .dropdown-menu li').click(function () {
        $(this).parents('.dropdown').find('span').text($(this).text());
        $(this).parents('.dropdown').find('input').attr('value', $(this).attr('id'));
    });
/*End Dropdown Menu*/