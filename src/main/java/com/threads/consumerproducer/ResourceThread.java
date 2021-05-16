package com.threads.consumerproducer;

public class ResourceThread extends Thread {


    private Resources rs;
    private String name;

    public String getNames() {
        return name;
    }

    public ResourceThread(Resources rs, String name) {
        this.rs = rs;
        this.name = name;
    }

    @Override
    public void run() {
        if (this.getNames().equals("Producer")) {
            try {
                this.rs.produce();
            } catch (InterruptedException ex) {
            }
        } else {
            try {
                this.rs.consume();
            } catch (InterruptedException ex) {
            }
        }
    }
}
