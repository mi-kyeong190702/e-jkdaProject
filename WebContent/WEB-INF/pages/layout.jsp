<!-- /pages/layout.jsp -->
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head> 
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge"/>
    <meta property="og:type" content="website"> 
    <meta property="og:title" content="대한영양사협회">
    <!-- 이미지 파일 교체 후 사용하세요, 카카오 og 캐시 삭제: https://developers.kakao.com/tool/debugger/sharing -->
    <meta property="og:image"  content="https://www.dietitian.or.kr/images/common/logo_kda.png">
    <meta property="og:description" content="대한영양사 협회 홈페이지">
    <meta property="og:site_name" content="대한영양사협회">
    <meta property="og:locale" content="ko_KR">
    <title>사단법인 대한영양사협회 학술지</title>  
    <link rel="stylesheet" href="/css/type1/reset.css">
    <link rel="stylesheet" href="/css/type1/utilities.css">
    <link rel="stylesheet" href="/css/type1/base.css">
    <link rel="stylesheet" href="/css/type1/layout.css">
    <link rel="stylesheet" href="/css/type1/components.css">
    <link rel="stylesheet" href="/css/type1/theme-dark.css"> 
    <link rel="stylesheet" href="/css/type1/common.css"> 
    <link rel="stylesheet" href="/css/jquery.simplyscroll.css" media="all" type="text/css">
    <link rel="shortcut icon" href="/css/favicon.ico" />
</head>
<body> 
  <header><tiles:insertAttribute name="header" ignore="true"/></header>
  <nav><tiles:insertAttribute name="menu"   ignore="true"/></nav>
  <tiles:insertAttribute name="subheader"/> 
  <!-- body는 반드시 삽입 -->
  <main class="site-main">
  <div class="container">
    <tiles:insertAttribute name="body" ignore="false"/>
  </div>
</main>
  <footer><tiles:insertAttribute name="footer" ignore="true"/></footer>
</body>
</html>