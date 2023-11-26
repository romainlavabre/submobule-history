package org.romainlavabre.history.exception;

public class NotInitializedException extends RuntimeException {
    public NotInitializedException() {
        super( "HistoryHandler not initialized, use HistoryConfigurer for fix it" );
    }
}
