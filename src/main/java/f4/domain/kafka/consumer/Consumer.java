package f4.domain.kafka.consumer;

import f4.domain.dto.response.ProductDTO;
import f4.domain.service.impl.HistoryServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class Consumer {

  private final HistoryServiceImpl service;

  @KafkaListener(topics = "${kafka.topic.name}")
  public void consume(ConsumerRecord<Long, ProductDTO> record) {
      try{
        service.makeAndSave(record.value());
      }catch (Exception e){
        log.error("error : { }",e);
      }
  }


}
