<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
<style>
body,h1 {font-family: "Raleway", Arial, sans-serif}
h1 {letter-spacing: 6px}
.w3-row-padding img {margin-bottom: 12px}
p{background-color :LightGray; font-family : "Raleway", Arial, sans-serif ; text-align: center;}
</style>
<title>결과</title>
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
      <a href="./" class="w3-bar-item w3-button">Home</a>
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
  
	
	<table align = "center" border = "1" class="table table-hover">
	<tr>
	<td colspan = "4" align ="center">
	</td>
	</tr>
	<tr>
		<th>제목</th>
		<th>개봉일</th>
		<th>관객수</th>
		<th>스크린수</th>
	</tr>
		<c:forEach items ="${movielist}" var="movielist">
		<tr>
			 
			<td>${movielist.movieNm}</td>
			<td>${movielist.openDt}</td>
			<td>${movielist.audiAcc}</td>
			<td>${movielist.scrnCnt}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	
		<div id="footer">
	<blockquote class="blockquote-reverse">bootstrap jquery
		css html</blockquote>
	</div>
</body>
</html>