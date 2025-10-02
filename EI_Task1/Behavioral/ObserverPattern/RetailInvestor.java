public class RetailInvestor implements Investor {
    private String name;

    public RetailInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " notified: " + stockName + " is now $" + price);
    }
}
