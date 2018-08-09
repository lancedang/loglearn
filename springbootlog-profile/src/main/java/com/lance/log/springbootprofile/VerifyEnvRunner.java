package com.lance.log.springbootprofile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 仅用于本地测试 profile 是否起作用
 */
@Component
public class VerifyEnvRunner implements CommandLineRunner {

    @Value("${server.port}")
    private String port;

    public void run(String... string) {
        System.out.println("port: " + port);
    }

}
