package entity;

import java.util.List;

public class QuanLyHoaDon {
    private Customer customer;
    private List<HoaDon> hoaDons;

    public QuanLyHoaDon(Customer customer, List<HoaDon> hoaDons) {
        this.customer = customer;
        this.hoaDons = hoaDons;
    }
}
