
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Warehouse</title>
    <link rel="stylesheet" href="resources/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src = "resources/SingleLeftMenuControl.js"></script>
    <script src="resources/RequestsDispatcher.js"></script>
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
            <button class = "buttons" id = "importButton">>New Import<</button>
        </div>
        <div class="changeble" id = "export">
            <button class = "buttons" id = "exportButton">>New Export<</button>
        </div>
        <div class="changeble" id = "instock">
            <button class = "buttons" id = "refreshStockButton">>Refresh Stock<</button>
        </div>
        <div class="changeble" id = "transactionhistory">
            <button class = "buttons" id = "refreshTransactionHistoryButton">Refresh Transaction History</button>
        </div>
        <div class="changeble" id = "newitem">
            <h2 align = "center">Add new item</h2>
            <br><br>
            <form align = "center" id = "newitemform">
                Name: <input type = "text" name="name" width="30"/>
                Volume: <input type = "text" name="volume" width="30"/>
                Weight: <input type = "text" name="weight" width="30"/>
                Price: <input type = "text" name="price" width="30"/>
            </form>
            <button class = "buttons" id = "newItemButton">>New Item<</button>
        </div>
        <div class="changeble" id = "newlot">
            <h2 align = "center">Add new lot</h2>
            <br><br>
            <form align = "center" id = "newlotform">
                Name: <input type = "text" name="name" width="30"/>
                Max volume: <input type = "text" name="volume" width="30"/>
                Max weight: <input type = "text" name="weight" width="30"/>
            </form>
            <button class = "buttons" id = "newLotButton">>New Lot<</button>
        </div>
        <div class="changeble" id = "removelot">
            <button class = "buttons" id = "getAvailableLotsButton">>Get Available Lots<</button>
            <button class = "buttons" id = "removeLotButton">>Remove Lot<</button>
        </div>
    </div>
</div>
<script src="resources/SingleLeftMenuControl.js"></script>
</body>
</html>

