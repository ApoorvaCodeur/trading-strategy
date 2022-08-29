package com.acme.mytrader.price.impl;

import com.acme.mytrader.execution.ExecutionService;
import com.acme.mytrader.execution.impl.IbmExecutionService;
import com.acme.mytrader.price.PriceListener;

/**
 * Price Listener for IBM stocks
 *
 * @author apoorvachauhan
 */
public class IbmPriceListener implements PriceListener {

    private final double PRICE_THRESHOLD = 55.0;
    private final int PURCHASE_VOLUME = 100;

    /**
     * Listener that listenes to changes in prices of stock and takes action accordingly to buy or sell stocks
     *
     * @param security
     * @param price
     */
    @Override
    public void priceUpdate(String security, double price) {

        // Check for security
        if (null != security && !security.isEmpty()) {
            // Secured invocation
            if (price < PRICE_THRESHOLD) {
                // Price dropped below the threshold, Buy stocks
                ExecutionService ibmExecutionService = new IbmExecutionService();
                ibmExecutionService.buy(security, price, PURCHASE_VOLUME);
            } else {
                // Do Nothing
            }
        } else {
            // Unsecured invocation
            // TODO Handle with appropriate error/exception
        }
    }
}
