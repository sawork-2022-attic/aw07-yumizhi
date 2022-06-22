package com.micropos.order.storage;

import com.micropos.order.model.Order;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public class StorageOrders {
    List<Order> findAllOrders();
    Order findOrderById(int id);
    List<Order> findItemsOfOrder(int id);
    com.micropos.order.model.Order saveOrder(com.micropos.order.model.Order order);
}

