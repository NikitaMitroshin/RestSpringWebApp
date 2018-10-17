<%@include file="common/header.jspf"  %>
<form action="/login" method="post">
    <div class="item">
        <input type="text" class="text-input" required="required" placeholder="Введите ваш логин">
    </div>
    <div class="item">
        <input type="text" class="text-input" required="required" placeholder="Введите ваш пароль">
    </div>
    <div class="item">
        <input type="submit" class="button" value="Login">
    </div>
    <%@include file="register.jsp"%>
</form>

<%@include file="common/footer.jspf"%>