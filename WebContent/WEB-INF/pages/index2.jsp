<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR"> 
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
    <link rel="stylesheet" href="/css/type2/common.css"> 
    <link rel="stylesheet" href="/css/type2/layout.css?date=20150630">
    <link rel="stylesheet" href="/css/type2/jquery.simplyscroll.css" media="all" type="text/css">
    <link rel="shortcut icon" href="/css/type2/favicon.ico" />
    
          
 <style>
 /* ====== 연도별 최신 권호 영역 ====== */
.issue-section { 
  margin-top: 16px;
}

/* 연도 라벨 */
.year-group { 
  margin-top: 20px; 
}
.year-label {
  margin: 0 0 12px;
  font-size: 18px;
  font-weight: 700;
  color: var(--ink, #1f2937);
}

/* 그리드 레이아웃 */
.issue-grid {
  display: grid;
  grid-template-columns: repeat(4, minmax(0, 1fr));
  gap: 16px;
  list-style: none;
  padding: 0;
  margin: 0 0 24px;
}

/* 카드 */
.issue-card {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  min-height: 96px;
  padding: 14px;
  border-radius: 12px;
  background: #f7f8fa;               /* 스샷처럼 옅은 회색 바탕 */
  box-shadow: 0 2px 10px rgba(2,8,20,.04);
  transition: transform .15s ease, box-shadow .15s ease;
}
.issue-card:hover {
  transform: translateY(-2px);
  box-shadow: 0 6px 24px rgba(2,8,20,.10);
}

/* 카드 내부 요소 */
.issue-title {
  font-weight: 700;
  line-height: 1.45;
  color: var(--ink, #1f2937);
  margin-bottom: 10px;
  word-break: keep-all;
}

/* 작은 책 아이콘 느낌의 썸네일(옵션) */
.issue-thumb {
  width: 44px;
  height: 28px;
  border-radius: 6px;
  background: linear-gradient(#d9dce2, #cfd3db);
  position: relative;
  margin-bottom: 10px;
  display:none;
}
.issue-thumb::after { /* 책 등(linen) 느낌 */
  content: "";
  position: absolute;
  left: 6px; top: 4px; bottom: 4px;
  width: 6px;
  border-radius: 3px;
  background: #bfc3cb;
}

/* 버튼 */
.btn {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  padding: 8px 12px;
  border-radius: 10px;
  font-size: 13px;
  font-weight: 700;
  text-decoration: none;
  border: 1px solid transparent;
  user-select: none;
}
.btn-ebook {
  background: #3b82f6;
  color: #fff;
}
.btn-ebook:hover { background: #2f6fda; }
.btn-ebook:focus { outline: 2px solid #93c5fd; outline-offset: 2px; }
.btn.is-disabled, .btn[disabled] {
  opacity: .55; cursor: not-allowed; pointer-events: none;
}

/* ====== 반응형 ====== */
@media (max-width: 1200px) {
  .issue-grid { grid-template-columns: repeat(3, minmax(0, 1fr)); }
}
@media (max-width: 900px) {
  .issue-grid { grid-template-columns: repeat(2, minmax(0, 1fr)); }
}
@media (max-width: 520px) {
  .issue-grid { grid-template-columns: 1fr; }
  .issue-card { padding: 12px; }
  .year-label { font-size: 16px; }
}
 
 
 </style>
</head>
<body>
<div id="wrap"> 
  
  <!-- Header S-->
  <%@ include file ="./header1.jsp"%>
  
  <!-- Header E--> 
   <%@ include file ="./menu.jsp"%>
   <%@ include file ="./subheader.jsp"%> 
   <main class="site-main">
  <div class="container">
   <div class="issue-section">
  <div class="year-group">
    <h3 class="year-label">2025</h3>
    <ul class="issue-grid">
      <li class="issue-card">
        <div class="issue-thumb"></div>
        <div class="issue-title">2025년 Vol.31 No.1</div>
        <a class="btn btn-ebook" href="/ebook/2025-31-1" target="_blank">eBOOK 보기</a>
      </li>
      <li class="issue-card">
        <div class="issue-thumb"></div>
        <div class="issue-title">2025년 Vol.31 No.2</div>
        <a class="btn btn-ebook" href="/ebook/2025-31-1" target="_blank">eBOOK 보기</a>
      </li>
      <li class="issue-card">
        <div class="issue-thumb"></div>
        <div class="issue-title">2025년 Vol.31 No.3</div>
        <a class="btn btn-ebook" href="/ebook/2025-31-1" target="_blank">eBOOK 보기</a>
      </li>
      <li class="issue-card">
        <div class="issue-thumb"></div>
        <div class="issue-title">2025년 Vol.31 No.4</div>
        <a class="btn btn-ebook" href="/ebook/2025-31-1" target="_blank">eBOOK 보기</a>
      </li> 
    </ul>
  </div>
  <div class="year-group">
    <h3 class="year-label">2024</h3>
    <ul class="issue-grid">
      <li class="issue-card">
        <div class="issue-thumb"></div>
        <div class="issue-title">2024년 Vol.30 No.1</div>
        <a class="btn btn-ebook" href="/ebook/2025-31-1" target="_blank">eBOOK 보기</a>
      </li>
      <li class="issue-card">
        <div class="issue-thumb"></div>
        <div class="issue-title">2024년 Vol.30 No.2</div>
        <a class="btn btn-ebook" href="/ebook/2025-31-1" target="_blank">eBOOK 보기</a>
      </li>
      <li class="issue-card">
        <div class="issue-thumb"></div>
        <div class="issue-title">2024년 Vol.30 No.3</div>
        <a class="btn btn-ebook" href="/ebook/2025-31-1" target="_blank">eBOOK 보기</a>
      </li>
      <li class="issue-card">
        <div class="issue-thumb"></div>
        <div class="issue-title">2024년 Vol.30 No.4</div>
        <a class="btn btn-ebook" href="/ebook/2025-31-1" target="_blank">eBOOK 보기</a>
      </li> 
    </ul>
  </div>
  </div>
  </div>
  </main>
   
   <%@ include file ="./footer.jsp"%>
</div>
</body>
</html>