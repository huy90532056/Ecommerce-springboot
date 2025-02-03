package com.devteria.identityservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderItem extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;

    @NotNull(message = "Product is mandatory")
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "productId")
    private Product product; // Mối quan hệ với Product

    @NotNull(message = "Quantity is mandatory")
    private Integer quantity; // Số lượng sản phẩm

    @NotNull(message = "Total price is mandatory")
    private Double totalPrice; // Tổng giá cho sản phẩm (có thể được tính toán từ quantity và price của sản phẩm)

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "orderId")
    private Order order; // Mối quan hệ với Order

}
