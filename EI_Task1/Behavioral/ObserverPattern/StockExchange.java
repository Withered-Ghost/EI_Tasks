import java.util.*;

public class StockExchange implements Stock {
    private List<Investor> investors = new ArrayList<>();
    private String stockName;
    private double price;

    public StockExchange(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    @Override
    public void registerInvestor(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(stockName, price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("\nStockMarket: " + stockName + " price updated to $" + price);
        notifyInvestors();
    }
}
