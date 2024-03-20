package entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DichVu {
    private static int idAuto = 100;
    private int id;
    private String name;
    private float price;
    private String currency;



    public DichVu() {
        this.id = idAuto++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void inputNewDichVu(){
        System.out.println("nhap name dich vu:");
        name = new Scanner(System.in).nextLine();
        System.out.println("nhap gia cuoc:");
        while (true){
            try{
                float interestRast = new Scanner(System.in).nextFloat();
                if (interestRast>0){
                    this.price = interestRast;
                    break;
                }
                throw new InputMismatchException();
            }catch (InputMismatchException e){
                System.out.println("lai xuat la so duong, vui long nhap lai");

            }
        }
    }
    @Override
    public String toString() {
        return "DichVu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                '}';
    }
}
