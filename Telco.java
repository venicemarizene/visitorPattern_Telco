public class Telco implements TelcoSubscription {
    private int dataAllowance;
    private double promoPrice; 
    private String telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public void setDataAllowance(int dataAllowance) {
        this.dataAllowance = dataAllowance;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallTextOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}