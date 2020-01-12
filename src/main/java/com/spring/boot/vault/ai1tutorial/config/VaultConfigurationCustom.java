package com.spring.boot.vault.ai1tutorial.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("test")
public class VaultConfigurationCustom {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
