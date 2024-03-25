package service;

import entity.Customer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();
    public void showCustomer() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    public void inputCustomer() {
        System.out.println("ban muon them moi bn khach hang:");
        int customerNumber;
        while (true){
            try{
                customerNumber = new Scanner(System.in).nextInt();
                if (customerNumber>0){
                    break;
                }
                throw new InputMismatchException();
            }catch (InputMismatchException e){
                System.out.println("so luong kh la 1 so nguyen duong, vui long nhap lai");

            }
        }
        for (int i = 0; i < customerNumber; i++) {
            System.out.println("nhap thong tin cho kh thu " + (i + 1));
            Customer customer = new Customer();
            customer.inputInfor();
            customers.add(customer);
        }
    }

    public void showCustommer(){
        for (Customer customer:customers){
            System.out.println(customer.toString());
        }
    }

}
