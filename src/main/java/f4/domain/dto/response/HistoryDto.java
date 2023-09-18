package f4.domain.dto.response;

import f4.domain.persist.entity.History;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

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
  @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private LocalDateTime bidTime;
  private String bidStatus;

  public HistoryDto(History history){
    productId = history.getProductId();
    productName = history.getProductName();
    productImage = history.getProductMainImage();
    bidPrice = history.getBidPrice();
    bidTime = history.getBidTime();
    bidStatus = history.getBidStatus();
  }

}
