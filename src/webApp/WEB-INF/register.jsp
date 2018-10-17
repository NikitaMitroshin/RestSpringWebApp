<%@include file="common/header.jspf"  %>
<form action="/register" method="post">
    <div class="item">
        <input type="text" name="first_name" class="text-input" required="required" placeholder="Введите ваше имя">
    </div>
    <div class="item">
        <input type="text" name="last_name" class="text-input" required="required" placeholder="Введите вашу фамилию">
    </div>
    <div class="item">
        <input type="text" name="email" class="text-input" required="required" placeholder="Введите ваш email">
    </div>
    <div class="item">
        <input type="text" name="user" class="text-input" required="required" placeholder="Введите ваш логин">
    </div>
    <div class="item">
        <input type="text" name="password" class="text-input" required="required" placeholder="Введите ваш пароль">
    </div>
    <div class="item">
        <input type="submit" class="button btn-primary" value="Login">
    </div>
</form>

<%@include file="common/footer.jspf"%>