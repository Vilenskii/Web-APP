package Graphics;


public class Graphics{
    public static void stars (int count)
    {
        for(int i=0;i<count;++i) {
            for (int j = 0; j < i; ++j)
                System.out.print("h");
                System.out.println();

        }
    }
    public static void main(String[] args) {
     stars(20);
    }
}
