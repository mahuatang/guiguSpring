package com4.test.guigu.tx;

public interface BookShopDao {
    public int findBookPriceByIsbn(String isbn);
    public void updateBookStock(String isbn);
    public void updateUserAccount(String username, int price);
}
