package f4.domain.service.impl;

import f4.domain.dto.response.ProductDTO;
import f4.domain.persist.entity.HistoryEntity;
import f4.domain.persist.repository.HistoryRepository;
import f4.domain.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HistoryServiceImpl implements HistoryService {

  private final HistoryRepository repository;

  @Override
  public void makeAndSave(ProductDTO product){
    HistoryEntity history = HistoryEntity.builder()
        .productId(product.getProductId())
        .productName(product.getProductName())
        .productImage(product.getProductImage())
        .bidPrice(product.getBidPrice())
        .bidTime(product.getBidTime())
        .userId(product.getBidUserId())
        .bidStatus(product.getBidStatus())
        .userEmail(product.getUserEmail()).build();

    repository.save(history);
  }


  //유저별 history List 반환
//  public List<HistoryDTO> findHistory(long id) {
//    return repository.findByUserId(id).stream().map(e -> modelMapper.map(e, HistoryDTO.class))
//        .collect(Collectors.toList());
//  }

  //전체 history list 반환
//  public List<HistoryDTO> findAllHistory() {
//    return repository.findAll().stream().map(e -> modelMapper.map(e, HistoryDTO.class)).collect(
//        Collectors.toList());
//  }
}
