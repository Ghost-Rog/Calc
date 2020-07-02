package Calculate;

import java.util.Scanner;

public class DataIn {

    public void Scan() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите  1ое целое число");
        int a = scanner.nextInt();
        System.out.println("Введите 2ое целое число");
        int b = scanner.nextInt();
//        if ((a == 0) || (b == 0)){ Альтернатива Exception / 0
//            System.out.println("Одно из чисел 0");
//            Scan();
//        }
        System.out.println("Какое действие вы хотите провести с числами? + - * /\nИли . для выхода");
        String x = scanner.next();
        Calc calc = new Calc();
        switch (x) {
            case "+": {
                calc.summ(a, b);
                Scan();
                break;
            }

            case "-": {
                calc.subtract(a, b);
                Scan();
                break;
            }
            case "*": {
                calc.multiplication(a, b);
                Scan();
                break;
            }
            case "/": {
                calc.division(a, b);
                Scan();
                break;
            }
            case "!": {
                calc.Sqrt(a);
                Scan();
                break;
            }
            case ".": {
                System.out.println("Конец работы приложеня!");
                break;
            }

        }


    }


}
