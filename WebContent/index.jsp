
<html>
<body>
<jsp:include page="headandfoot/header.html"></jsp:include>
<br>
<br>
<br>
<br>
<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
  <img src="swiss1.jpg" style="width:100%">

</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <img src="swiss2.jpg" style="width:100%">

</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <img src="swiss3.jpg" style="width:100%">

</div>

</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>

<script>
var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
    slideIndex++;
    if (slideIndex> slides.length) {slideIndex = 1}    
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex-1].style.display = "block";  
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 2000); // Change image every 2 seconds
}
</script>
<div id="tab">
<a href="services.jsp"><img src="tab1.png" width="300" height="219" style=" border: 2px solid ;border-radius: 25px;  "></a>
<a href="login.jsp"><img src="tab2.png" width="300" height="219" style=" border: 2px solid ;border-radius: 25px;  "></a>
<a href="register.jsp"><img src=tab3.png width="300" height="219" style=" border: 2px solid ;border-radius: 25px;  "></a>
<a href="paybills.jsp"><img src=tab4.png width="300" height="219" style=" border: 2px solid ;border-radius: 25px;  "></a>
</div>
<br>
<br>
<jsp:include page="/headandfoot/footer.html"></jsp:include>
</body>


</html>