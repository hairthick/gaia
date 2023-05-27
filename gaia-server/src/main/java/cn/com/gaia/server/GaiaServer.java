package cn.com.gaia.server;

import cn.com.gaia.utils.exception.GaiaServerException;

public interface GaiaServer {

    void start() throws GaiaServerException;

    void restart() throws GaiaServerException;

    void stop() throws GaiaServerException;

}
