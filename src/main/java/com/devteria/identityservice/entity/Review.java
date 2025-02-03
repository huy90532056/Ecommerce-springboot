package com.devteria.identityservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @NotNull(message = "Customer is mandatory")
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user; // Mối quan hệ với Customer

    @NotNull(message = "Product is mandatory")
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "productId")
    private Product product; // Mối quan hệ với Product

    @NotBlank(message = "Comment is mandatory")
    private String comment; // Nhận xét của khách hàng

    @NotNull(message = "Rating is mandatory")
    @Positive(message = "Rating must be positive")
    private Integer rating; // Điểm đánh giá (có thể từ 1 đến 5)

}