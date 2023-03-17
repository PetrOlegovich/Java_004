package less;

import java.util.ArrayList;
import java.util.Scanner;

public class less4 {
    public static void main(String[] args) {
        System.out.println("Введите строку без пробелов и номер строки через пробел (-) : ");
        System.out.println("для выхода наберите exit ! ");
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){
            String text = scan.nextLine();
            try {
                if(text.equals("exit")){
                    break;
                }
                Integer.parseInt(text.split("-")[1]);
            }
            catch (Exception e) {
                System.out.println("ошибка . проверь что ввел ");
            }
            String[] number = text.split("-");
            int num = Integer.parseInt(number[1]);
            int localSize = num - list.size();
            for (int i = 0; i <= localSize; i++) {
                list.add(null);
            }
            if (number[0].equals("print")) {
                System.out.println(list.get(num));
            }
            else {
                list.set(num, number[0]);
            }
        }
    }
}