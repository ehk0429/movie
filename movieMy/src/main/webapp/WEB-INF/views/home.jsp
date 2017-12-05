<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
<!-- 부트스트랩 -->
<link href="resources/bootstrap/bootstrap.min.css" rel="stylesheet">
<!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
<!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
<script src="resources/bootstrap/jquery.min.js"></script>
<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
<script src="resources/bootstrap/bootstrap.js"></script>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
body,h1 {font-family: "Raleway", Arial, sans-serif}
h1 {letter-spacing: 6px}
.w3-row-padding img {margin-bottom: 12px}
p{background-color :LightGray; font-family : "Raleway", Arial, sans-serif ; text-align: center;}
</style>

<title>HOME</title>
</head>
<body>
<!-- !PAGE CONTENT! -->
<div class="w3-content" style="max-width:1500px">

<!-- Header -->
<header class="w3-panel w3-center w3-opacity" style="padding:128px 16px">
  <h1 class="w3-xlarge">WEB PROGRAMER</h1>
  
  <h1>Kim Eun Hye</h1>
  <div class="w3-padding-32">
    <div class="w3-bar w3-border">
      <a href="#" class="w3-bar-item w3-button">Home</a>
      <a href="#" class="w3-bar-item w3-button w3-light-grey w3-hide-small">Portfolio</a>
      	<a href="hello.do" class="w3-bar-item w3-button w3-hide-small">로그인</a>
      <a href="movielist.do" class="w3-bar-item w3-button w3-hide-small "> 영화목록 </a>
      <a href="board/register" class="w3-bar-item w3-button "> 방명록 </a>
       </div>
       <div class="w3-padding-32">
       <div class="w3-bar w3-border">
       <div class="input-group">
      <span class="input-group-btn">
        <button class="btn btn-secondary" type="button">Go!</button>
      </span>
      <input type="text" class="form-control" placeholder="Search for..." aria-label="Search for...">
    </div>
   	</div>
  </div>
 </div>
  </header>
  
  <!-- Photo Grid -->
<div class="w3-container w3-center w3-grayscale" >
 <h2>...</h2>
 <p>Click MoviePoster:</p>
    <c:forEach items="${movieImg}" var="movieImg">
		<!--  여기서 영화이미지 별로 경로 다르게 줘야함 생각해보기 파라미터 값을 넘겨주는 걸 생각하기 -->
		 <div class="w3-third"><br>
		<a href="movielist.do"><img src="${movieImg.imgUrl}"style="width:60%"
			class="img-rounded" vspace="10" hspace="10"></a>
			</div>			
			
	</c:forEach>
        
  </div>
  <!-- End Page Content -->
</div>
<!-- Contact Container -->
<div class="w3-container w3-padding-64 w3-theme-l5" id="contact">
  <div class="w3-row">
    <div class="w3-col m5">
    <div class="w3-padding-16"><span class="w3-xlarge w3-border-teal w3-bottombar">Contact </span></div>
      <h3>Address</h3>
      <p><i class="fa fa-phone w3-text-teal w3-xlarge"></i>  010 4602 0429</p>
      <p><i class="fa fa-envelope-o w3-text-teal w3-xlarge"></i>  ehk0429@gmail.com</p>
    </div>
    <div class="w3-col m7">
      <form class="w3-container w3-card-4 w3-padding-16 w3-white" action="/action_page.php" target="_blank">
      <div class="w3-section">      
        <label>Name</label>
        <input class="w3-input" type="text" name="Name" required>
      </div>
      <div class="w3-section">      
        <label>Email</label>
        <input class="w3-input" type="text" name="Email" required>
      </div>
      <div class="w3-section">      
        <label>Message</label>
        <input class="w3-input" type="text" name="Message" required>
      </div>  
      <input class="w3-check" type="checkbox" checked name="Like">
      <label>I Like it!</label>
      <button type="submit" class="w3-button w3-right w3-theme">Send</button>
      </form>
    </div>
  </div>
</div>


  
	<div class="footer">
	<blockquote class="blockquote-reverse">bootstrap jquery
		css html</blockquote>
	</div>
	

</body>

</html>

