package f4.domain.controller;

import f4.domain.service.impl.HistoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("history/")
public class HitoryController {

  private final HistoryServiceImpl service;

//  @GetMapping
//  public List<HistoryDTO> getHistory(@RequestHeader(name = "accessToken") String accessToken) throws Exception {
//    return service.returnHistory(accessToken);
//  }

}
