<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Camera Reviews</title>
  	<!-- Bootstrap core CSS -->
    <link href="../../resources/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="../../resources/css/carousel.css" rel="stylesheet">
    <link href="../../resources/css/dashboard.css" rel="stylesheet">
    <link href="../../resources/css/blog.css" rel="stylesheet">
</head>
<body>
<!-- include the navbar -->
<%@ include file="../../resources/html/navbar.html"%>

<div class="container">

      <div class="blog-header">
        <h1 class="blog-title">Camera Reviews</h1>
        
      </div>

      <div class="row">

        <div class="col-sm-8 blog-main">

          <div class="blog-post">

            <h2 class="blog-post-title">Reviews for ${cameraModel}</h2>
                       
          <c:forEach items="${reviewsList}" var="review">
          	
          	<p class="blog-post-meta">Author: ${review.getAuthor()}</p>
          	<p class="blog-post-meta">Poster Time: ${review.getDate()}</p>
         	
            <p>${review} </p>
            <hr>           
            </c:forEach>
          </div><!-- /.blog-post -->


        </div><!-- /.blog-main -->

        <div class="col-sm-3 col-sm-offset-1 blog-sidebar">
          <div class="sidebar-module sidebar-module-inset">
           <img src="<c:url value='../../resources/images/CameraModels/${cameraModel.getModel()}.jpg' />" width="1200" class="img-responsive">
          </div>
          <div class="sidebar-module">
            <h4><a href="/brands">See All Reviews</a></h4>
           
          </div>
         
        </div><!-- /.blog-sidebar -->

      </div><!-- /.row -->

    </div><!-- /.container -->
    
    <!-- include the footer -->
	<%@ include file="../../resources/html/footer.html" %>

<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../../resources/js/jquery.min.js"></script>
    <script src="../../resources/js/bootstrap.min.js"></script>

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../resources/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>