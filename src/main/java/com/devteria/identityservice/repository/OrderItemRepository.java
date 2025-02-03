package com.devteria.identityservice.repository;

import com.devteria.identityservice.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // Bạn có thể thêm các phương thức tùy chỉnh tại đây nếu cần
}
