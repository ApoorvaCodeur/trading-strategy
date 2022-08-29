package com.acme.mytrader.price.impl;

import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.price.PriceSource;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Price Source for IBM Stocks
 *
 * @author apoorvachauhan
 */
public class IbmPriceSource implements PriceSource {

    private List<PriceListener> listeners = new ArrayList<PriceListener>();

    /**
     * Add a new Price Listener
     *
     * @param listener
     */
    @Override
    public void addPriceListener(PriceListener listener) {
        listeners.add(listener);
    }

    /**
     * Remove a price Listener
     *
     * @param listener
     */
    @Override
    public void removePriceListener(PriceListener listener) {
        listeners.remove(listener);
    }
}