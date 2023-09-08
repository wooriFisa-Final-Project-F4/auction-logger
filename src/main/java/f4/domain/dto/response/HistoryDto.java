package f4.domain.dto.response;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class HistoryDto {

  private long productId;
  private String productName;
  private String productImage;
  private String bidPrice;
  private LocalDateTime bidTime;
  private String bidStatus;
}
