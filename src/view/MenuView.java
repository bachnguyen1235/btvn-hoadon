package view;

import service.CustomerService;
import service.DichVuService;
import util.IOUtil;

public class MenuView {
    private final CustomerService customerService = new CustomerService();
    private final DichVuService dichVuService = new DichVuService();
    private void showContenMenu() {
        System.out.println("=============Phan mem quan li Hoa Don============");
        System.out.println("1. nhap kh:");
        System.out.println("2. in kh:");
        System.out.println("3. nhap ds dich vu:");
        System.out.println("4. in ra danh sach dich vu:");
        System.out.println("5. nhap hoa don cua kh:");
        System.out.println("6. hien thi danh sach hoa don:");
        System.out.println("7. sap xep hoa don:");
        System.out.println("8. lap bang thong ke so tien phai tra cua moi khach hang:");
        System.out.println("9. exit");
        System.out.println("moi chon chuc nang: ");
    }

    public void menu() {
        while (true) {
            showContenMenu();
            int choose = IOUtil.inputIntNumber(1, 9, "vui long nhap lua chon tu 1 toi 9");
            switch (choose) {
                case 1:
                    customerService.inputCustomer();
                    break;
                case 2:
                    customerService.showCustommer();
                    break;
                case 3:
                    dichVuService.inputDichVu();
                    break;
                case 4:
                    dichVuService.showBank();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    return;
            }
        }
    }
}

