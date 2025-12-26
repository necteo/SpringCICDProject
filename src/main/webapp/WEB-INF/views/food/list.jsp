<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
p {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.a-link {
  cursor: pointer;
}
</style>
</head>
<body>
<!-- Breadcrumb Section Begin -->
  <section class="breadcrumb-section set-bg" data-setbg="/img/breadcrumb.jpg">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <div class="breadcrumb__text">
            <h2>맛집</h2>
            <div class="breadcrumb__option">
              <span>목록</span>>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <section class="product-details spad" id="board_delete">
    <div class="container">
      <div class="row" style="margin: 0px auto">
        <c:forEach var="vo" items="${list}">
          <div class="col-md-3">
		    <div class="thumbnail">
		      <a href="detail?fno=${vo.fno}">
		        <img src="${vo.poster}" style="width: 250px; height: 180px">
		        <div class="caption">
		          <p>${vo.name}</p>
		        </div>
		      </a>
		    </div>
		  </div>
        </c:forEach>
      </div>
      <div class="row" style="margin-top: 10px; justify-content: center">
        <div class="product__pagination blog__pagination">
          <c:if test="${startPage > 1}">
            <a href="list?page=${startpage - 1}">&laquo;</a>
          </c:if>
          <c:forEach var="i" begin="${startPage}" end="${endPage}">
            <a class="a-link ${curpage == i ? 'active' : ''}" href="list?page=${i}">${i}</a>
          </c:forEach>
          <c:if test="${endPage < totalpage}">
            <a href="list?page=${endPage + 1}">&raquo;</a>
          </c:if>
        </div>
      </div>
    </div>
  </section>
</body>
</html>