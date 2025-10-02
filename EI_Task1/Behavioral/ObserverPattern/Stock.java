public interface Stock {
    public void registerInvestor(Investor investor);
    public void removeInvestor(Investor investor);
    public void notifyInvestors();
}
