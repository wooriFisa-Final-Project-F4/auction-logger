package f4.domain.kafka.consumer;

import f4.domain.dto.SendToHistoryDto;
import f4.domain.service.impl.HistoryServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class Consumer {

  private final HistoryServiceImpl service;
    /*
     * @date : 2023.09.05
     * @author : KHJ
     * @param : ConsumerRecord<Long, ProductDto> record
     * @description : 입찰 요청의 결과를 받아 DB에 저장한다.
     */
  @KafkaListener(topics = "${kafka.topic.name}")
  public void makeAndSave(ConsumerRecord<Long, SendToHistoryDto> record) {
      try{
        log.info("입찰 기록 수행 : userId : {}",record.value().getBidUserId());
        service.makeAndSave(record.value());
      }catch (Exception e){
        log.error("error : { }",e);
      }
  }


}
