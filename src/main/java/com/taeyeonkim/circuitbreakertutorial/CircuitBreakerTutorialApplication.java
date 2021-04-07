package com.taeyeonkim.circuitbreakertutorial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.map.IMap;
import io.github.bucket4j.grid.GridBucketState;

@SpringBootApplication
@EnableZuulProxy
public class CircuitBreakerTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircuitBreakerTutorialApplication.class, args);
    }

    @Bean
    @Qualifier("RateLimit")
    public IMap<String, GridBucketState> map() {
        return Hazelcast.newHazelcastInstance().getMap("rateLimit");
    }
}
