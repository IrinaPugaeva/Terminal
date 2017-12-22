package ru;

public interface TerminalServer {
    int checkBalance() throws ConnectionProblemException;
    void addMoney(int sum) throws ConnectionProblemException;
    void getMoney(int sum) throws ConnectionProblemException, MoneyIsNotEnoughException;
}