<%@page contentType="text/html;charset=utf-8" %>
<jsp:useBean id="cnt" scope="application" class="bean.CounterBean" />
<html>
  <head>
    <title>カウンター</title>
  </head>
<body>
  <h2><jsp:getProperty name="cnt" property="count" />回目のアクセスです</h2>
</body>
</html>
