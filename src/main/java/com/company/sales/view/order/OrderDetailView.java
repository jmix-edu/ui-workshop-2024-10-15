package com.company.sales.view.order;

import com.company.sales.entity.Order;
import com.company.sales.entity.OrderStatus;
import com.company.sales.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.view.*;

@Route(value = "orders/:id", layout = MainView.class)
@ViewController("Order_.detail")
@ViewDescriptor("order-detail-view.xml")
@EditedEntityContainer("orderDc")
public class OrderDetailView extends StandardDetailView<Order> {

    @ViewComponent
    private TypedTextField<Long> orderNumberField;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Order> event) {
        event.getEntity().setStatus(OrderStatus.NEW);
        orderNumberField.setVisible(false);
    }
}