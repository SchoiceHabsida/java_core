public class BankClient {
    private boolean isCredible;
    private boolean hasBadCreditHistory;
    private boolean hasProblemWithLaw;

    public BankClient(boolean isCredible, boolean hasBadCreditHistory, boolean hasProblemWithLaw) {
        this.isCredible = isCredible;
        this.hasBadCreditHistory = hasBadCreditHistory;
        this.hasProblemWithLaw = hasProblemWithLaw;
    }

    public boolean isCredible() {
        return isCredible;
    }

    public void setCredible(boolean credible) {
        isCredible = credible;
    }

    public boolean isHasBadCreditHistory() {
        return hasBadCreditHistory;
    }

    public void setHasBadCreditHistory(boolean hasBadCreditHistory) {
        this.hasBadCreditHistory = hasBadCreditHistory;
    }

    public boolean isHasProblemWithLaw() {
        return hasProblemWithLaw;
    }

    public void setHasProblemWithLaw(boolean hasProblemWithLaw) {
        this.hasProblemWithLaw = hasProblemWithLaw;
    }
}
