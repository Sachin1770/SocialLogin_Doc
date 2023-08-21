package com.service.socialLogin.configure;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.twitter.connect.TwitterConnectionFactory;
import org.springframework.social.security.AuthenticationNameUserIdSource;

import javax.sql.DataSource;

@Configuration
@EnableSocial
@RequiredArgsConstructor
public class SocialConfig extends SocialConfigurerAdapter {

    @Value("${spring.social.twitter.appId}")
    private String twitterAppId;

    @Value("${spring.social.twitter.appSecret}")
    private String twitterAppSecret;

    private final DataSource dataSource;

    @Bean
    public TwitterConnectionFactory twitterConnectionFactory() {
        return new TwitterConnectionFactory(twitterAppId, twitterAppSecret);
    }

    @Override
    public void addConnectionFactories(ConnectionFactoryConfigurer connectionFactoryConfigurer, Environment environment) {
        connectionFactoryConfigurer.addConnectionFactory(new TwitterConnectionFactory(twitterAppId, twitterAppSecret));

    }

    @Override
    public UserIdSource getUserIdSource() {
        return new AuthenticationNameUserIdSource();
    }
}
