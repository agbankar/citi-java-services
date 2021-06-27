package com.immutability;

public class ImmutableAddress {
    private String street;

    public ImmutableAddress(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "street='" + street + '\'' +
                '}';
    }
}
