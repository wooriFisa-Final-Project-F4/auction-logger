package f4.domain.dto.response;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ProductDTO {

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
  private String bidTime;
  @NotNull
  private String bidStatus;
}
