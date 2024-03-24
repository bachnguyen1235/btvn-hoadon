package entity;

import statics.CustomerType;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {

    private static int idAuto = 10000;
    private int id;
    private String name;
    private String address;
    private int phoneNumber;
    private CustomerType type;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public Customer() {
        this.id = idAuto++;
    }

    private void inputCustomerType() {
        System.out.println("chon loai kh: ");
        System.out.println("1, kh ca nhan");
        System.out.println("2. kh hanh chinh");
        System.out.println("3. kh kinh doanh");
        System.out.println("moi chon");
        int customerTypeChoose;
        while (true){
            try{
                customerTypeChoose = new Scanner(System.in).nextInt();
                if (customerTypeChoose>0&&customerTypeChoose<3){
                    break;
                }
                throw new InputMismatchException();
            }catch (InputMismatchException e){
                System.out.println("loai kh la 1 so nguyen duong trong khoang tu 1 den 3, vui long nhap lai");

            }
        }
        switch (customerTypeChoose) {
            case 1:
                this.setType(CustomerType.PERSONAL);
                break;
            case 2:
                this.setType(CustomerType.HANHCHINH);
                break;
            case 3:
                this.setType(CustomerType.KINHDOANH);
                break;
        }
    }
    public void inputInfor() {
        System.out.println("nhap ten: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("nhap dia chi: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("nhap sdt: ");
        this.setPhoneNumber(Integer.parseInt(new Scanner(System.in).nextLine()));
        while (true) {
            String tempPhone = new Scanner(System.in).nextLine();
            if (tempPhone.matches("[^0\\d{9}]")) {
                this.setPhoneNumber(Integer.parseInt(new Scanner(System.in).nextLine()));
                break;
            }
            System.out.println("sdt ko dung dinh dang, hay nhap lai");
        }
        inputCustomerType();
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNmber=" + phoneNumber +
                ", type=" + type +
                '}';
    }
}
