package service;

import entity.Customer;
import entity.DichVu;
import entity.HoaDon;
import entity.QuanLyHoaDon;
import util.IOUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHoaDonService {

    private CustomerService customerService ;
    private HoaDon hoaDon;
    private List<QuanLyHoaDon> quanLyHoaDons = new ArrayList<>();
    public void showSavingAccountManagements() {
        quanLyHoaDons.forEach(System.out::println);
    }

    public QuanLyHoaDonService(CustomerService customerService, HoaDon hoaDon, List<QuanLyHoaDon> quanLyHoaDons) {
        this.customerService = customerService;
        this.hoaDon = hoaDon;
        this.quanLyHoaDons = quanLyHoaDons;
    }

    public void taoMoiHoaDon() {
        System.out.println("co bao nhieu kh muon su dung dich vu? ");
        int customerNumber = new Scanner(System.in).nextInt();

        for (int i = 0; i < customerNumber; i++) {
            System.out.println("nhap thong tin dich vu cho kh thu: " + (i + 1));
            Customer customer = inputCustomer();
            List<HoaDon> hoaDons = hoaDons();
            QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon(customer, hoaDons);
        }
    }

    private Customer inputCustomer() {
        System.out.println("nhap ma kh:");
        Customer customer = null;
        int customerID;
        while (true) {
            customerID = new Scanner(System.in).nextInt();
            customer= IOUtil.findById(customerID,);
            if (customer != null) {
                break;
            }
            System.out.println("ma kh ko ton tai, hay nhap lai");
        }

        return customer;
    }

    private List<HoaDon> hoaDons(){
        System.out.println("nhap so luong ngan hang gui tiet kiem:");
        int bankNumber = new Scanner(System.in).nextInt();
        List<HoaDon> hoaDons = new ArrayList<>();
        for (int j = 0; j < bankNumber; j++) {
            System.out.println("nhap thong tin cho so: " + (j + 1));
            System.out.println("nhap ma ngan hang muon gui:");
            DichVu dichVu = null;
            int dichVuID;
            while (true) {
                dichVuID = new Scanner(System.in).nextInt();
                dichVu = IOUtil.findById(dichVuID,);
                if (dichVu != null) {
                    break;
                }
                System.out.println("ma DV ko ton tai, hay nhap lai");
            }

            System.out.println(" nhap so data tiêu thụ");
            double data = new Scanner(System.in).nextInt();
            HoaDon hoaDon= new HoaDon(dichVu, data);
            hoaDons.add(hoaDon);
        }
        return hoaDons;
    }
}
