package f4.domain.service;

import f4.domain.dto.response.HistoryDto;
import f4.domain.dto.SendToHistoryDto;

import java.util.List;

public interface HistoryService {

  void makeAndSave(SendToHistoryDto product);

  List<HistoryDto> findAll();

  List<HistoryDto> findByUserId(Long userId);
}
