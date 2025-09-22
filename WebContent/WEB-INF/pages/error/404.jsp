<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>404 - Page Not Found</title>
  <link rel="stylesheet" href="../../../css/main.css" />
  <style>
    .code { font-size: 96px; font-weight: 800; opacity: 0.1; }
    .card { max-width: 560px; margin: 10% auto; text-align: center; padding: 32px; border-radius: 16px; box-shadow: 0 6px 24px rgba(0,0,0,0.08); background: #fff; }
    .btn { display:inline-block; padding: 10px 16px; border-radius: 8px; border: 1px solid #ddd; text-decoration:none; }
  </style>
</head>
<body>
  <div class="card">
    <div class="code">404</div>
    <h2>찾을 수 없는 페이지입니다.</h2>
    <p>요청하신 주소가 변경되었거나 삭제되었을 수 있어요.</p>
    <p style="margin-top:18px;">
      <a class="btn" href="<c:url value='/'/>">홈으로 돌아가기</a>
    </p>
  </div>
</body>
</html>
