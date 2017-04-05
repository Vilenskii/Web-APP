package randomFunction;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomFun {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private final static int max = 100;
    private final static int random = rnd(max);
//генерируем число от 1 до 100
    private static int rnd(int max) {
        double result = (Math.random() * ++max);
        return (int) result;
    }
//метод для ввода числа заново, при том если не угадали число с первого раза
    private static int moreOrLess() throws IOException {
        int result = Integer.parseInt(br.readLine());
        if(result > 100){   //проверяем число при вводе, чтобы оно не было больше 100, иначе просим ввести число заново
            System.out.println("Введите число от 1 до 100...");
                result = Integer.parseInt(br.readLine());
        }
        return result;
    }

//сравниваем число введенное с консоли с числом компьютера, если они совпали, то вы виграли, если нет, то делаем подсказку какое число ввести больше или меньше.
    private static void eq(int result) throws IOException {
            if (random == result) {
                System.out.println("Поздравляем вы угадали число " + result + "=" + random);
                return;
            } else {
                if (random > result) {
                    System.out.println("введите число больше ");
                    eq(moreOrLess());
                } else {
                    System.out.println("введите число меньше ");
                    eq(moreOrLess());
                }
            }
        }


    public static void main(String[] args) throws IOException {
        //System.out.println(random);
        System.out.println("Игра заключается в том, что нужно угадать число от 1 до 100... За минимальное количество попыток");
        System.out.println("Ведите число от 1 до 100...");
        int k = moreOrLess();
        eq(k);
    }
}









