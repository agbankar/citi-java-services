package com.enums;

public enum DataSourceEnum {
    INSTANCE;
    private final Object datasource;

    DataSourceEnum() {
        System.out.println("Initializing the datasource");
        datasource = new String("conn");
    }

    public Object getDatasource() {
        return datasource;
    }
}
