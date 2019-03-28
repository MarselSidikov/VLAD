<!doctype html>
<html>
<head>
    <title>about</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>About</th>
        </tr>
        <#list technologies as technology>
            <tr>
                <td>${technology}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>