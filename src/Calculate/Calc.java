package Calculate;

public class Calc {

    public void summ(int a, int b){
        int c = a + b;
        System.out.println("Сумма = " + c);
    }

    public void subtract(int a, int b){
        int c = a - b;
        System.out.println("Вычитание = " + c);
    }

    public void multiplication(int a, int b){
        int c = a * b;
        System.out.println("Умножение = " + c);
    }

    public void division(int a, int b){
        int c;
        try {
            int result = (a / b);


        } catch (ArithmeticException e){
//            System.out.println("Error - " + e.getMessage());
            System.out.println("На 0 делить нельзя\nВведите цифры заново\n---------------------");
            DataIn dataIn = new DataIn();
            dataIn.Scan();
        }

        c = a / b;
        System.out.println("Деление = " + c);

    }

    public void Sqrt(int a){
        int c = a * a;
        System.out.println("Площадь квадрата = " + c);
    }

}
