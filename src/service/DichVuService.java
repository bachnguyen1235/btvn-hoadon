package service;

import entity.DichVu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DichVuService {
    private List<DichVu> dichVus = new ArrayList<>();
    public void showBank() {
        dichVus.forEach(System.out::println);
    }

    public void inputDichVu() {
        System.out.println("ban muon them moi bn dich vu:");
        int dichVuNumber  ;
        while (true){
            try{
                dichVuNumber = new Scanner(System.in).nextInt();
                if (dichVuNumber>0){
                    break;
                }
                throw new InputMismatchException();
            }catch (InputMismatchException e){
                System.out.println("vui long nhap so duong, vui long nhap lai");
            }
        }
        for (int i = 0; i < dichVuNumber; i++) {
            System.out.println("nhap thong tin cho dich vu " + (i + 1));
            DichVu dichVu = new DichVu();
            dichVu.inputNewDichVu();
            dichVus.add(dichVu);
        }
    }


    public DichVu findByID(int bankId) {
        for (int f = 0; f < dichVus.size(); f++) {
            if (bankId == dichVus.get(f).getId()) {
                return dichVus.get(f);
            }
        }
        return null;
    }

}
