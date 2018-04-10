
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Warehouse</title>
    <link rel="stylesheet" href="style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src = "script.js"></script>
</head>
<body>
<div id="page">
    <div id = "menu">
        <ul id="menu_content" style="list-style: none">
            <li value = "welcome"><a >Welcome</a></li>
            <li value = "import"><a >Import</a></li>
            <li value = "export"><a >Export</a></li>
            <li value = "instock"><a >In stock</a></li>
            <li value = "transactionhistory"><a >Transaction history</a></li>
            <li value = "newitem"><a >New Item</a></li>
            <li value = "newlot"><a >New Lot</a></li>
            <li value = "removelot"><a >Remove Lot</a></li>
        </ul>
    </div>
    <div class="test">
        <div id = "console">

        </div>
        <div class="changeble" id ="welcome">
            <h1 text-align = "center">Welcome to my Warehouse Application</h1><br>
            <h1>This app is made by Racho Ivanov</h1>
        </div>
        <div class = "changeble" id="import">
            import
        </div>
        <div class="changeble" id = "export">
            export
        </div>
        <div class="changeble" id = "instock">
            instock
        </div>
        <div class="changeble" id = "transactionhistory">
            transactionhistory
        </div>
        <div class="changeble" id = "newitem">
            <h2 align = "center">Add new item</h2>
            <br><br>
            <form align = "center" class="" action="index.html" method="post">
                Name: <input type = "text" name="name" width="30"/>
                Volume: <input type = "text" name="volume" width="30"/>
                Weight: <input type = "text" name="weight" width="30"/>
                Price: <input type = "text" name="price" width="30"/>
                <button type = "submit">New Item</button>
            </form>
        </div>
        <div class="changeble" id = "newlot">
            <h2 align = "center">Add new lot</h2>
            <br><br>
            <form align = "center" class="" action="index.html" method="post">
                Name: <input type = "text" name="name" width="30"/>
                Max volume: <input type = "text" name="volume" width="30"/>
                Max weight: <input type = "text" name="weight" width="30"/>
                <button type = "submit">New Item</button>
            </form>
        </div>
        <div class="changeble" id = "removelot">
            removelot
        </div>
    </div>
</div>
<script src="script.js"></script>
</body>
</html>

