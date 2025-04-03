package com.msa_lab.springboot_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//@Component
public class KafkaStreamer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaStreamer.class);

    @KafkaListener(topics = "test-topic", groupId = "msa-consumer")
    public void listen(String message) {
        logger.info("🟢 Received from Kafka: {}", message);
    }
}
