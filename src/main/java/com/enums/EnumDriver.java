package com.enums;

public class EnumDriver {
    public static void main(String[] args) {
        DataSourceEnum item = null;
        for (int i = 0; i < 10; i++) {
            item = DataSourceEnum.INSTANCE;
            System.out.println("item = " + item.getDatasource());
        }
    }
}
