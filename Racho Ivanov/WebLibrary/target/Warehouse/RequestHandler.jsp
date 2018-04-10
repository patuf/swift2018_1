<%@ page import="java.util.Map" %>
<%@ page import="java.sql.Connection" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
</head>
<body>
    <%
        Map<String, String[]> parameters = request.getParameterMap();
        for(String parameter : parameters.keySet()) {

        }
//        for (String key: parameters.keySet())
//        {
//            for (String val: parameters.get(key))
//            {
//                out.print("Key = " + key + " Value = " + val + "  ");
//            }
//        }



        switch (parameters.get("type")[0])
        {
            case "newItem":
            	out.print("New Item added to database");
            	break;
            case "newLot":
            	out.print("New Lot added to database");
            	break;
            case "refreshStock":
                out.print("Stock : updated");
                break;
            case "refreshTransactionHistory":
            	out.print("Transaction History : updated");
            	break;
            case "import":
                out.print("New goods imported");
                break;
            case "export":
                out.print("Selecter goods exported");
                break;
            case "removeLot":
                out.print("Lot removed from database : goods re-arranged");
                break;
            case "getAvailableLots":
            	out.print("All available lots are shown");
            	break;
            default:
            	out.print("Unknown Request");
            	break;
        }

    %>
</body>
</html>
