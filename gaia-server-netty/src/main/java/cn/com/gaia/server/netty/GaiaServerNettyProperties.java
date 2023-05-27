package cn.com.gaia.server.netty;

public class GaiaServerNettyProperties {

    private int port;

    private String bindAddr;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getBindAddr() {
        return bindAddr;
    }

    public void setBindAddr(String bindAddr) {
        this.bindAddr = bindAddr;
    }
}
