<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>学生列表</title>
</head>
<body>
<table border="1">
    <tr>
        <td>id</td>
        <td>姓名</td>
    </tr>

    <#if stuList??>
        <#list stuList as stu>
            <#if stu_index%2==0>
                <tr style="background-color: green">
            <#else>
                <tr style="background-color: red">
            </#if>
            <td>${stu.id}</td>
            <td>${stu.name}</td>
            </tr>
        </#list>
    </#if>

</table>
</body>
</html>