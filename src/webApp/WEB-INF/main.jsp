<%@ include file="common/header.jspf"%>
<%@ include file="common/nav.jspf"%>

<div class="container">
    <table class="table table-stripped">
        <caption>The list of user</caption>
        <thead>
        <tr>
            <th>First name</th>
            <th>Last name</th>
            <th>Email</th>
            <th>User</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${user}" var="users">
            <tr>
                <td>${users.firstName}</td>
                <td>${users.lastName}</td>
                <td>${users.email}</td>
                <td>${users.username}</td>
                <td><button class="btn-primary button">Edit</button></td>
                <td><button class="btn-primary button">Delete</button></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>