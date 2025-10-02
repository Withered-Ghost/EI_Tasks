public class ObserverDemo {
    public static void main(String[] args) {
        StockExchange tesla = new StockExchange("TSLA", 250.00);

        Investor john = new RetailInvestor("John");
        Investor emma = new RetailInvestor("Emma");
        Investor bigBank = new QIBInvestor("BigBank Corp");

        tesla.registerInvestor(john);
        tesla.registerInvestor(emma);
        tesla.registerInvestor(bigBank);

        tesla.setPrice(255.75);
        tesla.setPrice(260.10);

        tesla.removeInvestor(emma);

        tesla.setPrice(265.50);
    }
}
