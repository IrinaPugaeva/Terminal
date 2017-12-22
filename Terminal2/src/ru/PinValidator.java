package ru;

public interface PinValidator {
    void validatePin(String pin) throws WrongPinException, AccountLockedException;
}