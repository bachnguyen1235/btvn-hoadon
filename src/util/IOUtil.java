package util;

import entity.Action;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class IOUtil {
    public <T extends Action> T findById(int id, List<T> items) {
        for (T item : items) {
            if (id == item.getId()) {
                return item;
            }
        }
        return null;
    }
    public static int inputIntNumber(Integer min, Integer max , String errorMessage) {
        int result;
        while (true){
            try{
                result = new Scanner(System.in).nextInt();

                if (result < min || result>max){
                    throw new InputMismatchException();
                }
                return result;
            }catch (InputMismatchException e){
                System.out.println(errorMessage);

            }
        }
    }
}
