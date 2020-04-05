package com.openapisession.ringmyiphonebff.config;

import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Configuration
public class ApplicationConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpRequestRetryHandler.class);
//
//    @Bean
//    public ClientHttpRequestFactory clientHttpRequestFactory(
//            final ScheduledExecutorService scheduledExecutorService, ConfigValues configValues) {
//        PoolingHttpClientConnectionManager poolingClientConnectionManager =
//                new PoolingHttpClientConnectionManager(
//                        configValues.getActiveConnectionMaxSecondsToLive(), TimeUnit.SECONDS);
//        poolingClientConnectionManager.setDefaultMaxPerRoute(1000);
//        poolingClientConnectionManager.setMaxTotal(1000);
//
//        // Make sure to evict expired connections and connections that are idle for too long
//        IdleHttpConnectionCleaner cleaner =
//                new IdleHttpConnectionCleaner(
//                        poolingClientConnectionManager, configValues.getIdleConnectionMaxIdleTime());
//        scheduledExecutorService.scheduleAtFixedRate(
//                cleaner,
//                configValues.getIdleConnectionCleanupInterval(),
//                configValues.getIdleConnectionCleanupInterval(),
//                TimeUnit.SECONDS);
//
//        HttpClientBuilder clientBuilder =
//                HttpClientBuilder.create()
//                        .disableCookieManagement()
//                        .setConnectionManager(poolingClientConnectionManager);
//
//        HttpRequestRetryHandler retryHandler = buildRetryHandler();
//        clientBuilder.setRetryHandler(retryHandler);
//
//        HttpClient httpClient = clientBuilder.build();
//        HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory =
//                new HttpComponentsClientHttpRequestFactory(httpClient);
//        httpComponentsClientHttpRequestFactory.setReadTimeout(configValues.getHttpSocketTimeout());
//        httpComponentsClientHttpRequestFactory.setConnectionRequestTimeout(
//                configValues.getHttpSocketTimeout());
//        httpComponentsClientHttpRequestFactory.setConnectTimeout(configValues.getHttpSocketTimeout());
//        return new BufferingClientHttpRequestFactory(httpComponentsClientHttpRequestFactory);
//    }
//
//    @Bean
//    public Map<String, String> webAppJars(ServletContext servletContext) {
//        return JarsCollector.getJars(servletContext.getRealPath("/WEB-INF/lib"));
//    }
//
//    @Bean
//    public HeaderValueEncoder headerValueEncoder() {
//        return new Base64HeaderEncoder();
//    }

}
