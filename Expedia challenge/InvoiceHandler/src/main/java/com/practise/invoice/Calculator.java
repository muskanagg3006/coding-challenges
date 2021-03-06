package com.practise.invoice;

import java.util.ArrayList;

public interface Calculator {
    public Item getItemFinalPriceIncludingTax(Item item);
    public double getFinalPurchasedPrice(ArrayList<Item> listWithTaxApplied);
    public double applyRegularTax(double cost);
    public double getGrossPrice(Item item);
    public boolean isMedicalProduct(Item item);
}
