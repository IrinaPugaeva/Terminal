
package ru;

public interface TerminalInterface {
    int checkBalance() throws NotValidatedPinException, ConnectionProblemException;

    void addMoney(int sum) throws NotValidatedPinException, WrongSumException, ConnectionProblemException;


    void getMoney(int sum) throws NotValidatedPinException, WrongSumException, MoneyIsNotEnoughException, ConnectionProblemException;

    void validatePin(String pin) throws WrongPinException, AccountLockedException;

    boolean isPinValidated();
}