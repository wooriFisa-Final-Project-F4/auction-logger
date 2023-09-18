package f4.domain.dto;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

import lombok.*;

@Data
public class SendToHistoryDto {

  @NotNull
  private Long productId;
  @NotNull
  private String productName;
  @NotNull
  private String productImage;
  private String userEmail;
  @NotNull
  private Long bidUserId;
  @NotNull
  private String bidPrice;
  @NotNull
  private LocalDateTime bidTime;
  @NotNull
  private String bidStatus;
}
