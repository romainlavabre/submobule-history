package org.romainlavabre.history;

import org.romainlavabre.history.exception.NotInitializedException;

public class HistoryConfigurer {
    private static HistoryConfigurer   INSTANCE;
    private        HistoryDataProvider historyDataProvider;
    private        Enum                onTransactionSuccessEvent;


    public HistoryConfigurer() {
        INSTANCE = this;
    }


    protected static HistoryConfigurer get() {
        if ( INSTANCE == null ) {
            throw new NotInitializedException();
        }

        return INSTANCE;
    }


    public static HistoryConfigurer init() {
        return new HistoryConfigurer();
    }


    protected Enum getOnTransactionSuccessEvent() {
        return onTransactionSuccessEvent;
    }


    protected HistoryDataProvider getHistoryDataProvider() {
        return historyDataProvider;
    }


    /**
     * @param historyDataProvider Implementation of HistoryDataProvider
     */
    public HistoryConfigurer setHistoryDataProvider( HistoryDataProvider historyDataProvider ) {
        this.historyDataProvider = historyDataProvider;

        return this;
    }


    public HistoryConfigurer setOnTransactionSuccessEvent( Enum onTransactionSuccessEvent ) {
        this.onTransactionSuccessEvent = onTransactionSuccessEvent;

        return this;
    }


    public void build() {
    }
}
