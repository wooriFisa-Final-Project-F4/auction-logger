package f4.domain.service.impl;

import f4.domain.dto.response.HistoryDto;
import f4.domain.dto.SendToHistoryDto;
import f4.domain.persist.entity.History;
import f4.domain.persist.repository.HistoryRepository;
import f4.domain.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HistoryServiceImpl implements HistoryService {

  private final HistoryRepository repository;
  private final ModelMapper modelMapper;

  @Override
  @Transactional
  public void makeAndSave(SendToHistoryDto product) {
    repository.save(historyBuilder(product));
  }

  public History historyBuilder(SendToHistoryDto product) {
    return History.builder()
        .productId(product.getProductId())
        .productName(product.getProductName())
        .productMainImage(product.getProductImage())
        .bidPrice(product.getBidPrice())
        .bidTime(product.getBidTime())
        .userId(product.getBidUserId())
        .bidStatus(product.getBidStatus())
        .bidUserEmail(product.getUserEmail()).build();
  }

  //전체 history list 반환
  @Override
  public List<HistoryDto> findAll() {
    return repository.findAll().stream()
        .map(e -> modelMapper.map(e, HistoryDto.class))
        .collect(Collectors.toList());
  }

  //유저별 history List 반환
  @Override
  public List<HistoryDto> findByUserId(Long id) {
    return repository.findByUserId(id).stream()
        .map(e -> new HistoryDto(e))
        .collect(Collectors.toList());
  }

}
