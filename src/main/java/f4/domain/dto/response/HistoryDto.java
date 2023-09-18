package f4.domain.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
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
  private LocalDateTime bidTime;
  private String bidStatus;
}
