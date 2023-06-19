package com.edu.ibu.onlinePetStore.services;
import com.edu.ibu.onlinePetStore.models.OrderProducts;
import com.edu.ibu.onlinePetStore.repositories.OrderProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderProductsService {

    private final OrderProductsRepository orderProductsRepository;

    @Autowired
    public OrderProductsService(OrderProductsRepository orderProductsRepository) {
        this.orderProductsRepository = orderProductsRepository;
    }

    public List<OrderProducts> getAllOrderProducts() {
        return orderProductsRepository.findAll();
    }

    public OrderProducts getOrderProductsById(Long id) {
        Optional<OrderProducts> optionalOrderProducts = orderProductsRepository.findById(id);
        return optionalOrderProducts.orElse(null);
    }

    public OrderProducts createOrderProducts(OrderProducts orderProducts) {
        return orderProductsRepository.save(orderProducts);
    }

    public OrderProducts updateOrderProducts(Long id, OrderProducts updatedOrderProducts) {
        Optional<OrderProducts> optionalOrderProducts = orderProductsRepository.findById(id);
        if (optionalOrderProducts.isPresent()) {
            OrderProducts existingOrderProducts = optionalOrderProducts.get();
            existingOrderProducts.setOrder(updatedOrderProducts.getOrder());
            existingOrderProducts.setProduct(updatedOrderProducts.getProduct());
            return orderProductsRepository.save(existingOrderProducts);
        } else {
            return null;
        }
    }

    public boolean deleteOrderProducts(Long id) {
        Optional<OrderProducts> optionalOrderProducts = orderProductsRepository.findById(id);
        if (optionalOrderProducts.isPresent()) {
            orderProductsRepository.delete(optionalOrderProducts.get());
            return true;
        } else {
            return false;
        }
    }
}
