package com.practise.invoice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;

@Component
public class CreateInvoice extends CalculatorImpl  {


    void createInvoice(ArrayList<Item> itemList){
        ArrayList<Item> updatedInvoiceList=new ArrayList<>();
        double finalPriceAfterTaxApplied=0;
        double totalSalesTax=0;

        Iterator<Item> iterator = itemList.iterator();
        while (iterator.hasNext()) {
            Item listItem=iterator.next();
            Item itemWithTaxApplied=getItemFinalPriceIncludingTax(listItem);
            totalSalesTax=totalSalesTax+ (itemWithTaxApplied.getCost()-listItem.getCost());
            updatedInvoiceList.add(itemWithTaxApplied);

        }
        finalPriceAfterTaxApplied=getFinalPurchasedPrice(updatedInvoiceList);
        System.out.println(finalPriceAfterTaxApplied);
        printInvoice(updatedInvoiceList,totalSalesTax,finalPriceAfterTaxApplied);


    }

    void printInvoice(ArrayList<Item> updatedInvoiceList,double totalSalesTax,double finalPriceAfterTaxApplied){
        System.out.println(updatedInvoiceList);

    }
}
