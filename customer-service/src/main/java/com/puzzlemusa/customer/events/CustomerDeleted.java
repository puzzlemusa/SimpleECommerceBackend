package com.puzzlemusa.customer.events;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CustomerDeleted {
    private Long userId;

    public CustomerDeleted(Long userId){
        this.userId = userId;
    }
}
