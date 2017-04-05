package Graphics;


public class Triangle {
    public static void stars (int count)
    {


        //создали вложенный цикл, в котором будет выводится треугольник
        for(int i=0; i<count; ++i) {
            for (int j = 0; j < i; ++j)
                System.out.print("*");
                System.out.println();
        }
    }
    public static void main(String[] args) {
        int x = 5;
     stars(20);
        for (int i = 0; i < x; ++i) {
            System.out.println(i);
        }
    }
}
