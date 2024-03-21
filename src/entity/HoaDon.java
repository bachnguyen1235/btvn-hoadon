package entity;

import java.time.LocalDate;

public class HoaDon {

    private DichVu dichVu;
    private double amount;
    private LocalDate createdDate;

    public HoaDon(DichVu dichVu, double amount, LocalDate createdDate) {
        this.dichVu = dichVu;
        this.amount = amount;
        this.createdDate = LocalDate.now();
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
