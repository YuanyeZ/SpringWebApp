<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <div class="btn-group-vertical" role="group" aria-label="Vertical button group">
  				<button type="button" class="btn btn-default">Button</button>
      			<button type="button" class="btn btn-default">Button</button>
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
                        <c:if test="${camera.brands.equals(brand)}">
                        <tr>
                          <td><img src="<c:url value='../../resources/images/CameraModels/${camera.getModel()}.jpg' />" width="50" class="img-responsive" alt="${camera}"></td>
                          <td>${camera.getModel()}</td>
                          <td><a href="">Reviews</a></td>
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

   