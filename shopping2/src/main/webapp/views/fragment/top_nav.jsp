<%--
  Created by IntelliJ IDEA.
  User: Hoaf
  Date: 5/11/2019
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header class="header-area header-area2">
    <div class="container">
        <div class="row">
            <div class="col-lg-2">
                <div class="logo-area">
                    <a href="/index"><img src="<c:url value='/views/assets/images/logo/logo2.png'/>" alt="logo"></a>
                </div>
            </div>
            <div class="col-lg-10">
                <div class="custom-navbar">
                    <span></span>
                    <span></span>
                    <span></span>
                </div>
                <div class="main-menu main-menu2">
                    <ul>
                        <li class="active"><a href="/index">home</a></li>
                        <li><a href="about.html">about</a></li>
                        <li><a href="menu.html">menu</a></li>
                        <li><a href="#">category</a>
                            <ul class="sub-menu">
                                <c:forEach items="${listCategory}" var="dto">
                                    <li><a href="blog-home.html">${dto.name}</a></li>
                                </c:forEach>
                            </ul>
                        </li>
                        <li><a href="contact-us.html">contact</a></li>
                        <li><a href="elements.html">Elements</a></li>
                        <i class="fa fa-cart-plus" style="font-size:33px;color: white"><a href="#" id="totalItem"></a></i>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</header>
