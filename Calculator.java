import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        float a, b, res;
        char choice, ch;
        Scanner scan = new Scanner(System.in);
		
        do
        {
            System.out.print("1. Сложение\n");
            System.out.print("2. Вычитание\n");
            System.out.print("3. Умножение\n");
            System.out.print("4. Деление\n");
            System.out.print("5. Выйти\n\n");
            System.out.print("Выберите действие : ");
            choice = scan.next().charAt(0);
            switch(choice)
            {
                case '1' : System.out.print("Введите два числа : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a + b;
                    System.out.print("Результат = " + res);
                    break;
                case '2' : System.out.print("Введите два числа : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a - b;
                    System.out.print("Результат = " + res);
                    break;
                case '3' : System.out.print("Введите два числа : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a * b;
                    System.out.print("Результат = " + res);
                    break;
                case '4' : System.out.print("Введите два числа: ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a / b;
                    System.out.print("Результат = " + res);
                    break;
                case '5' : System.exit(0);
                    break;
                default : System.out.print("Неправильный выбор");
                    break;
            }
            System.out.print("\n---------------------------------------\n");
        }while(choice != 5);       
    }
}