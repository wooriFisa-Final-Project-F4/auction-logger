package f4.domain.controller;

import f4.domain.service.HistoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/history/v1")
@RequiredArgsConstructor
public class HistoryController {

  private final HistoryService historyService;

  @GetMapping("/manager")
  public ResponseEntity<?> findAll(){
    return ResponseEntity.status(HttpStatus.OK).body(historyService.findAll());
  }

  @GetMapping("/user/{id}")
  public ResponseEntity<?> findById(@PathVariable Long userId){
    log.info("입찰 전체 기록 조회 : userId : {}",userId);
    return ResponseEntity.status(HttpStatus.OK).body(historyService.findByUserId(userId));
  }

}
