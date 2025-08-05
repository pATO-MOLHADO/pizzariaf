package com.itb.inf2em.pizzariaf.moldel.entity;


import java.time.LocalDateTime;

public class Pedido {
    private long id ;
    private double valorpedido;
    private LocalDateTime dataHoraEntrega;
    private String status;
    private boolean codStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValorpedido() {
        return valorpedido;
    }

    public void setValorpedido(double valorpedido) {
        this.valorpedido = valorpedido;
    }

    public LocalDateTime getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    public void setDataHoraEntrega(LocalDateTime dataHoraEntrega) {
        this.dataHoraEntrega = dataHoraEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}
