package lktbz.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**

 */
@Data
@ToString
public class Order {

  private long orderId;
  private long userId;
  private Date createTime;
  private long totalPrice;

}
