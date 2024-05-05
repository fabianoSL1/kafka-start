package com.fabianosl.kafkastart.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class Consumer {

    @KafkaListener(topics = "${topic.name.producer}", groupId = "group")
    public void consume(ConsumerRecord<String, String> record) {
        log.info(record.value());
    }
}
