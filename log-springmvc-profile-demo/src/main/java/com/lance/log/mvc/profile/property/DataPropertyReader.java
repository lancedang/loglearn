package com.lance.log.mvc.profile.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataPropertyReader {

    @Value("${server.port}")
    private String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "DataPropertyReader{" +
                "port='" + port + '\'' +
                '}';
    }
}