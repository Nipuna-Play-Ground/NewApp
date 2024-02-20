void main(){
    final String[][] CUSTOMER = {
            {"1","2","3","4","5"},
            {"Kasun","Nuwan","Ruwan","Supun","Sagara"},
            {"077-1234567","078-1234567","071-1234567","041-1234567","023-1234567"},
            {"011-1234567","",null,"033-1234567",""}
    };

    final String BLUE = "\033[34;1;7m";
    final String RESET = "\033[0m";
    String horizontalLine = STR."+\{"-".repeat(6)}+\{"-".repeat(10)}+\{"-".repeat(12)}+\{"-".repeat(12)}+";
    String header = String.format(STR."\{BLUE}|%-6s|%-10s|%-12s|%-12s|\{RESET}", "ID", "NAME", "CONTACT", "CONTACT2");

    System.out.println(horizontalLine);
    System.out.println(header);
    System.out.println(horizontalLine);

    for (int i = 0; i < CUSTOMER[0].length; i++) {
        String detailRow = "";
        for (int j = 0; j < CUSTOMER.length; j++) {
            String customerElements = CUSTOMER[j][i];
            switch (j) {
                case 0 -> detailRow += getId(customerElements);
                case 1 -> detailRow += getName(customerElements);
                case 2 -> detailRow += getContact(customerElements);
                case 3 -> detailRow += getContact2(customerElements);
            }
        }
        System.out.println(detailRow);
    }
    System.out.println(horizontalLine);
}

String getId(String element){
    String formattedId = String.format("|C-%03d |", Integer.parseInt(element));
    return (formattedId);
}

String getName(String element){
    String formattedName = String.format("%-10s|", element);
    return (formattedName);
}

String getContact(String element){
    String formattedContact = String.format("%-12s|", element);
    return (formattedContact);
}

String getContact2(String element){
    String formattedContact2 = String.format("%-12s|", element == null ? "-" : element == "" ? "-" : element);
    return (formattedContact2);
}