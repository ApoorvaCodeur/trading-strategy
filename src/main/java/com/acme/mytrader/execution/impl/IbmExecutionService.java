package com.acme.mytrader.execution.impl;

import com.acme.mytrader.execution.ExecutionService;

/**
 * Implementation of Executor Service to Buy and Sell Stocks of IBM
 *
 * @author apoorvachauhan
 */
public class IbmExecutionService implements ExecutionService {

    /**
     * Buy the stocks for IBM
     *
     * @param security
     * @param price
     * @param volume
     */
    @Override
    public void buy(String security, double price, int volume) {
        // Add logger
        System.out.println("Request to buy '" + volume + "' volumes of IBM stocks at price : " + price);
        // TODO - logic to buy product
        System.out.println("Request to buy completed successfully");
    }

    /**
     * Sell the stocks of IBM
     *
     * @param security
     * @param price
     * @param volume
     */
    @Override
    public void sell(String security, double price, int volume) {
        // Add logger
        System.out.println("Request to sell '" + volume + "' volumes of IBM stocks at price : " + price);
        // TODO - logic to sell product
        System.out.println("Request to sell completed successfully");
    }
}
