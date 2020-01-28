    <%@ page language="java"
        contentType="text/html;charset=UTF-8"
        pageEncoding="UTF-8" %>

    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>


    <!DOCTYPE html>
    <html>
        <head>
        <meta charset="utf8">
        <title>From<title>
        </head>
        <body>
            <a href="/all">Show users</a>
            <f:form modelAttribute="form" action="add" method="post">
                <div>
                    <label for="Title">Title: </label>
                    <input type="text" id="Title" name="Title">
                </div>
                <div>
                    <label for="Text">Text: </label>
                    <input type="text" id="Text" name="Text">
                </div>
                <div>
                    <input type="submit" value="Add">
                </div>
            </f:form>
        </body>
    </html>