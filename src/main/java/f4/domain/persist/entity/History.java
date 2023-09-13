package f4.domain.persist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bid_history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "product_id", nullable = false)
    private Long productId;
    @Column(name = "product_name", nullable = false)
    private String productName;
    @Column(name = "product_main_image", nullable = false)
    private String productMainImage;
    @Column(name = "bid_user_email")
    private String bidUserEmail;
    @Column(name = "user_id", nullable = false)
    private Long userId;
    @Column(name = "bid_price", nullable = false)
    private String bidPrice;
    @Column(name = "bid_time", nullable = false)
    private String bidTime;
    @Column(name = "bid_status", nullable = false)
    private String bidStatus;
}
