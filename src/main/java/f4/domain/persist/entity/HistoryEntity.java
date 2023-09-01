package f4.domain.persist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "history")
public class HistoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
  @Column(name = "product_id", nullable = false)
  private Long productId;
  @Column(name = "product_name", nullable = false)
  private String productName;
  @Column(name = "product_image", nullable = false)
  private String productImage;
  @Column(name = "user_email")
  private String userEmail;
  @Column(name = "user_id", nullable = false)
  private Long userId;
  @Column(name = "bid_price", nullable = false)
  private String bidPrice;
  @Column(name = "bid_time", nullable = false)
  private String bidTime;
  @Column(name = "bid_status", nullable = false)
  private String bidStatus;
}
