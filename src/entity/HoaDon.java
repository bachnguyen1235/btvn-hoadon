package entity;

import java.time.LocalDate;

public class HoaDon {

    private DichVu dichVu;
    private double tongDungLuongDaDung;

    public HoaDon(DichVu dichVu, double tongDungLuongDaDung) {
        this.dichVu = dichVu;
        this.tongDungLuongDaDung = tongDungLuongDaDung;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public double getTongDungLuongDaDung() {
        return tongDungLuongDaDung;
    }

    public void setTongDungLuongDaDung(double tongDungLuongDaDung) {
        this.tongDungLuongDaDung = tongDungLuongDaDung;
    }
}