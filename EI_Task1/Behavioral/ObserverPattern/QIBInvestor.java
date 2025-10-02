public class QIBInvestor implements Investor {
    private String institution;

    public QIBInvestor(String institution) {
        this.institution = institution;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Institution (" + institution + ") alerted: " + stockName + " = $" + price);
    }
}
