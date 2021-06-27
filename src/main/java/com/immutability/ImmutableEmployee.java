package com.immutability;

public final class ImmutableEmployee {
    private final int id;
    private final ImmutableAddress immutableAddress;

    public ImmutableEmployee(int id, ImmutableAddress immutableAddress) {
        this.id = id;
        this.immutableAddress = immutableAddress;
    }

    public int getId() {
        return id;
    }

    public ImmutableAddress getImmutableAddress() {
        return new ImmutableAddress(this.immutableAddress.getStreet());
        //return new ImmutableAddress(this.immutableAddress.getStreet());
    }

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("aundh");
        ImmutableEmployee e = new ImmutableEmployee(1, address);
        System.out.println(e.getImmutableAddress().getStreet());
        e.getImmutableAddress().setStreet("baner");
        System.out.println(e.getImmutableAddress().getStreet());

    }
}
