package com.company.sales.listener;

import com.company.sales.entity.Order;
import io.jmix.core.event.EntitySavingEvent;
import io.jmix.data.Sequence;
import io.jmix.data.Sequences;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventListener {

    private final Sequences sequences;

    public OrderEventListener(Sequences sequences) {
        this.sequences = sequences;
    }

    @EventListener
    public void onOrderSaving(final EntitySavingEvent<Order> event) {
        if (event.isNewEntity() & event.getEntity().getOrderNumber() == null) {
            long nextOrderNumber = sequences.createNextValue(Sequence.withName("orderNumber"));
            event.getEntity().setOrderNumber(nextOrderNumber);
        }
    }
}