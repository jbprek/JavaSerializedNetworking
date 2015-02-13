package org.bagab.jserbin.generic.server;

/**
 *  Each concrete MessageHandler should return the appropriate
 * @author prekezes.
 */
public interface MessageHandler {
    /**
     *
     * @param request   Object
     * @return  response  Object
     */
    Object service(Object request);
}
