<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
  html, body {
    height: 100%;
    margin: 0;
  }
  iframe.fullscreen {
    width: 100%;
    height: 100%;
    border: 0;
  }
</style>

<iframe src="<%= (String)request.getAttribute("iframeSrc") %>" class="fullscreen" scrolling="auto"></iframe>
