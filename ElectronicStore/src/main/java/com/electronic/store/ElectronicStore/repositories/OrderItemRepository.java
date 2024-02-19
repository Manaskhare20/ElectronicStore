package com.electronic.store.ElectronicStore.repositories;

import com.electronic.store.ElectronicStore.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>
{
}
