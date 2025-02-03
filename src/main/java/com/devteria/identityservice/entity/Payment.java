package com.devteria.identityservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @NotNull(message = "Payment method is mandatory")
    private String paymentMethod; // Phương thức thanh toán (ví dụ: "Credit Card")

    @NotNull(message = "Amount is mandatory")
    private Double amount; // Số tiền thanh toán

    @NotNull(message = "Payment date is mandatory")
    private LocalDate paymentDate; // Ngày thanh toán

    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "orderId")
    private Order order; // Mối quan hệ với Order

}
