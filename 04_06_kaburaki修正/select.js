// alert(1)

// $("#ex").on("click", function(){
//     クリックされたら実行したいことを書く

//     // fadeinは表示
//     $("#ex").fadeOut(100)
//     $("#ex").fadeIn(100)
//     $("#ex").fadeOut(100)
//     $("#ex").fadeIn(100)
//     $("#ex").fadeOut(100)
//     $("#ex").fadeIn(100)
//     $("#ex").fadeOut(100)
//     $("#ex").fadeIn(100)
    
//     });

    $(function(){
        $('.single-item').slick({
          accessibility: true,
          autoplay: true,
          autoplaySpeed: 6000,
          dots: true,
          fade: true,
        });
      });