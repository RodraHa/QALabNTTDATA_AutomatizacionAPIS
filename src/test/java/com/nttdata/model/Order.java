package com.nttdata.model;

public class Order {
    private Long id;
    private Long petId;
    private Integer quantity;
    private String shipDate;
    private String status;
    private Boolean complete;

    public Order(String id, String petId, String quantity, String shipDate, String status, String complete) {
        this.id = Long.parseLong(id);
        this.petId = Long.parseLong(petId);
        this.quantity = Integer.parseInt(quantity);
        this.shipDate = shipDate;
        this.status = status;
        this.complete = Boolean.parseBoolean(complete);
    }

    public Long getId() {
        return id;
    }

    public Long getPetId() {
        return petId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public String getStatus() {
        return status;
    }

    public Boolean getComplete() {
        return complete;
    }
}
