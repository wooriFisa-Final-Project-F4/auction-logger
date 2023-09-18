package f4.domain.dto.response;

import f4.domain.persist.entity.History;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistoryDto {

  private long productId;
  private String productName;
  private String productImage;
  private String bidPrice;
  private String bidTime;
  private String bidStatus;

  public HistoryDto(History history){
    productId = history.getProductId();
    productName = history.getProductName();
    productImage = history.getProductMainImage();
    bidPrice = history.getBidPrice();
    bidTime = history.getBidTime().toString();
    bidStatus = history.getBidStatus();
  }

}
