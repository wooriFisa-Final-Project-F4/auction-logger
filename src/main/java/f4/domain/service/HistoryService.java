package f4.domain.service;

import f4.domain.dto.response.ProductDTO;

public interface HistoryService {

  void makeAndSave(ProductDTO product);
}
