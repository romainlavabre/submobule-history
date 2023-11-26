package org.romainlavabre.history;

import java.util.Optional;

/**
 * @author Romain Lavabre <romainlavabre98@gmail.com>
 */
public interface HistoryDataProvider {

    Optional< Integer > getAuthorId();


    Optional< String > getAuthorName();


    Optional< String > getAuthorIp();
}
