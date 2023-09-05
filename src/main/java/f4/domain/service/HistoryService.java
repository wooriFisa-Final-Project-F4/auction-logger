package f4.domain.service;

import f4.domain.dto.response.HistoryDto;
import f4.domain.dto.response.ProductDto;

import java.util.List;

public interface HistoryService {

  void makeAndSave(ProductDto product);

  List<HistoryDto> findAll();

  List<HistoryDto> findByUserId(Long userId);
}
