package com.puzzlemusa.order.events;

public class CustomerDeleted {
    private Long userId;

    public CustomerDeleted(){}

    public CustomerDeleted(Long userId){
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
