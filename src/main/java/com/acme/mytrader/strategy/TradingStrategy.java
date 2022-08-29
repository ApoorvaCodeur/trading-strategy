package com.acme.mytrader.strategy;

import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.price.impl.IbmPriceListener;
import com.acme.mytrader.price.impl.IbmPriceSource;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 *
 */
public class TradingStrategy {

    // TODO - change all system out prints to specific loggers

    /**
     * Change the price of stocks
     *
     * @param security
     * @param newPrice
     */
    public void changePrice(String security, double newPrice, String stockName) {

        // Check if a stock name is present
        if (null != stockName && !stockName.isEmpty()) {

            // Note - ENUM can be created here to handle different stock names
            switch (stockName) {
                case "IBM":
                    revaluateIbmStocks(security, newPrice);
                    break;
                default:
                    // Not a valid stock name
                    System.out.println("Not a valid stock");
            }
        } else {
            // Stock name is null or empty
            System.out.println("Stock name is null or empty");
        }

        // Log message
        System.out.println("Trading complete.");
    }

    /**
     * Update the price of IBM stocks
     *
     * @param security
     * @param newPrice
     */
    private void revaluateIbmStocks(String security, double newPrice) {
        // Create Price Source and attach to a listener
        IbmPriceSource priceSource = new IbmPriceSource();
        PriceListener priceListener = new IbmPriceListener();
        priceSource.addPriceListener(priceListener);

        // Update the price
        priceListener.priceUpdate(security, newPrice);
        priceSource.addPriceListener(priceListener);

        // Log Message
        System.out.println("IBM Stock revaluation complete");
    }
}
