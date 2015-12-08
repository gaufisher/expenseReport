package com.outhreeit.quickrbooks.entities;

import javax.persistence.*;
import java.util.Set;


@Entity
public class ExpenseReport extends BaseEntity {
    @ManyToMany(cascade = CascadeType.ALL)
    Set<LineItem> lineItems;

    @ManyToOne
    User user;

    public Set<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Set<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
