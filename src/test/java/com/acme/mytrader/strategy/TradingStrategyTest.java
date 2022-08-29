package com.acme.mytrader.strategy;

import org.junit.Test;

/**
 * NOTE - Refer to the console log for the flow of events
 *
 * @author apoorvachauhan
 */
public class TradingStrategyTest {

    @Test
    public void testIncreaseInIbmStockPrice() {
        // Create trading strategy
        TradingStrategy tradingStrategy = new TradingStrategy();

        // Log a message
        System.out.println("TEST :: IBM current stock price changed to 60.0");

        // Change in the price of IBM stocks above threshold
        tradingStrategy.changePrice("Secured", 60.0, "IBM");

        // Log a message
        System.out.println("END of TEST");

        // End of test
    }

    @Test
    public void testDecreaseInIbmStockPrice() {
        // Create trading strategy
        TradingStrategy tradingStrategy = new TradingStrategy();

        // Log a message
        System.out.println("TEST :: IBM current stock price changed to 50.0");

        // Change in the price of IBM stocks below threshold
        tradingStrategy.changePrice("Secured", 50.0, "IBM");

        // Log a message
        System.out.println("END of TEST");

        // End of test
    }
}
