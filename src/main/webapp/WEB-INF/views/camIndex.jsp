<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

    <div class="container-fluid">
      <div class="row">
      <br>
        <div class="col-sm-3 col-md-2 sidebar">
        	<h3> Reviews </h3>
            <div class="btn-group-vertical" role="group" aria-label="Vertical button group">
            	<c:forEach items="${brandsList}" var="brand">
            		<div class="btn-group">
  						<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><h3>${brand}</h3> <span class="caret"> </span></button>
  						<ul class="dropdown-menu">
  							<c:forEach items="${cameraList}" var="camera">
	  							<c:if test="${camera.brands.equals(brand)}">
	  								<li><a href="/reviews/${camera.getModel()}">${camera.getModel()}</a></li>
	  							</c:if>
  							</c:forEach>
  						</ul>
      				</div>
      			</c:forEach>
			</div>
        </div>

        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header"><b>Camera List</b></h1>

          <div class="row placeholders">
          <c:forEach items="${brandsList}" var="brand">
            <div class="col-xs-6 col-md-4 placeholder">
              <img src="<c:url value='../../resources/images/CameraBrands/${brand}.jpg' />" width="200" class="img-responsive" alt="${brand}">
                <table class="table table-striped">
                        <thead>
                        <tr>
                          <th>Picture</th>
                          <th>Model</th>
                          <th>Review</th>
                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${cameraList}" var="camera">
                        	<c:if test="${camera.getBrands().equals(brand)}">
	                        <tr>
	                          <td><img src="<c:url value='../../resources/images/CameraModels/${camera.getModel()}.jpg' />" width="50" class="img-responsive" alt="${camera}"></td>
	                          <td>${camera.getModel()}</td>
	                          <td><a href="/reviews/${camera.getModel()}">Reviews</a></td>
	                        </tr>
                        	</c:if>                                   
                        </c:forEach>
                        </tbody>
                    </table>

            </div>
		  </c:forEach>

          </div>

            <hr>
            
        </div>
      </div>

    </div>

   