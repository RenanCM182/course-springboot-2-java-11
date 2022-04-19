package com.renancm.course.entities.repositories;

import com.renancm.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {
}
