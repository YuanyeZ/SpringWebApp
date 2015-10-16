<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Camera Reviews</title>
</head>
<body>

<div class="container">

      <div class="blog-header">
        <h1 class="blog-title">Camera Reviews</h1>
        
      </div>

      <div class="row">

        <div class="col-sm-8 blog-main">

          <div class="blog-post">

            <h2 class="blog-post-title">Review for ${cameraModel}</h2>
            <p class="blog-post-meta">January 1, 2014 by <a href="#"></a></p>
          <c:forEach items="${reviewsList}" var="review">
            <p>This blog post shows a few different types of content that's supported and styled with Bootstrap. Basic typography, images, and code are all supported.</p>
            <hr>
           
           <pre><code>Example code block</code></pre>
            </c:forEach>
          </div><!-- /.blog-post -->


        </div><!-- /.blog-main -->

        <div class="col-sm-3 col-sm-offset-1 blog-sidebar">
          <div class="sidebar-module sidebar-module-inset">
            <img src = #>
          </div>
          <div class="sidebar-module">
            <h4>Related</h4>
            <ol class="list-unstyled">
              <li><a href="#">March 2014</a></li>
            </ol>
          </div>
         
        </div><!-- /.blog-sidebar -->

      </div><!-- /.row -->

    </div><!-- /.container -->

</body>
</html>