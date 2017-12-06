<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<title>register</title>

<style>
     body {
      padding-top: 40px;
        padding-bottom: 40px;
       }
      	h1,h4 {letter-spacing: 6px}
		p,h3,h4{font-family : "Raleway", Arial, sans-serif;text-align:center; }
		h4{
		font-family : "Raleway", Arial, sans-serif;
		padding : 64px;
		text-align:center;
		}
textarea {
    width: 100%;
    height: 150px;
    padding: 12px 20px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    background-color: #f8f8f8;
    font-size: 16px;
    resize: none;
}
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
    font-family : "Raleway", Arial, sans-serif;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
	font-family : "Raleway", Arial, sans-serif;
    background-color: #f8f8f8;
    
}

#footer{
padding-top : 200px;
text-align:center;
}

</style>
</head>
<body>
<!-- !PAGE CONTENT! -->
<div class="w3-content" style="max-width:1500px">

	<!-- Header -->
<header class="w3-panel w3-center w3-opacity" style="padding:30px 16px">
  <h1 class="w3-xlarge">WEB PROGRAMER</h1>
  
  <h1>Kim Eun Hye</h1>
  <div class="w3-padding-32">
    <div class="w3-bar w3-border">
      <a href="/ehk0429" class="w3-bar-item w3-button">Home</a>
      <a href="../movielist.do" class="w3-bar-item w3-button w3-hide-small "> 영화목록 </a>
      <a href="./listAll" class="w3-bar-item w3-button">게시글목록</a>
       </div>
 </div>
  </header>
  </div>
  <!-- Contact Container -->
<div class="w3-container w3-padding-64 w3-theme-l5" id="contact" >
  <div class="w3-row" >
    <div class="w3-col m5">
    <div class="w3-padding-16"><span class="w3-xlarge w3-border-teal w3-bottombar">게시판 </span></div>
      <h3>공지사항/자유게시판</h3>
      <p><i class="fa fa-envelope-o w3-text-teal w3-xlarge"></i>&nbsp;로그인 후 이용 가능합니다.</p>
      <p><a href = "hello.do">Login</a></p>
    </div>
    <div class="w3-col m7" >
      <form method="POST" class="w3-container w3-card-4 w3-padding-16 w3-white" target="_blank">
      <div class="w3-section">      
        <label for="exampleInputEmail1">Title</label>
        <input class="w3-input" type="text" name="title" class="form-control">
      </div>
       <div class="w3-section">      
        <label for= "exampleInputPassword1">Content</label>
        <textarea rows="10" cols="10" name="content" class="form-control"></textarea>
      </div>  
      <div class="w3-section">      
        <label for= "exampleInputEmail1"> Writer</label>
        <input class="w3-input" name="writer" class="form-control">
      </div>
     
      <input class="w3-check" type="checkbox" checked name="Like">
      <label>비밀글</label>
      <button type="submit" class="w3-button w3-right w3-theme" >Write</button>
      </form>
    </div>
  </div>
  </div>
  	<div id="footer">
	<blockquote class="blockquote-reverse">bootstrap jquery
		css html</blockquote>
	</div>
</body>
</html>

