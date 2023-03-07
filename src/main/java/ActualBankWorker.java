public class ActualBankWorker implements BankWorker {

    @Override
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        if (bankClient.isHasBadCreditHistory()) {
            throw new BadCreditHistoryException();
        }
        if (bankClient.isHasProblemWithLaw()) {
            throw new ProblemWithLawException();
        }
        return bankClient.isCredible();
    }
}
