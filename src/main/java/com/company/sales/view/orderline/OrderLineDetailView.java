package com.company.sales.view.orderline;

import com.company.sales.entity.OrderLine;
import com.company.sales.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@ViewController("OrderLine.detail")
@ViewDescriptor("order-line-detail-view.xml")
@EditedEntityContainer("orderLineDc")
@DialogMode(width = "30em", closeOnEsc = true)
public class OrderLineDetailView extends StandardDetailView<OrderLine> {
}