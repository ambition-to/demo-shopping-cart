package com.xiedaimala.shopping_cart.web.order.view;

import com.xiedaimala.shopping_cart.web.order.model.Order;
import lombok.Data;

@Data
public class UpdateOrderResponse {
    private Order order;

    public UpdateOrderResponse() {
    }

    public UpdateOrderResponse(Order order) {
        this.order = order;
    }
}
