package org.bagab.jserbin.generic.server;

import java.io.Serializable;

/**
 * Communication parameters for Generic server
 * @author prekezes.
 */
public class ServerParameters implements Serializable {
    private final String host;
    public final int port;

    public ServerParameters(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
}
