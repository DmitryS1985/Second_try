

    public class C02_Casting {
        public C02_Casting() {
        }

        public static void main(String[] args) {
            byte a = 10;
            int b = false;
            System.out.println("b = " + a);
            int c = 255;
            float d = 0.0F;
            d = (float)c;
            System.out.println("d = " + d);
            int e = 128;
            byte f = false;
            byte f = (byte)e;
            System.out.println("f = " + f);
            float g = 10.5F;
            int h = false;
            int h = (int)g;
            System.out.println("h = " + h);
            int i = true;
            byte j = false;
            byte j = 127;
            System.out.println("j = " + j);
            float k = 255.0F;
            byte l = false;
            byte l = -1;
            System.out.println("l = " + l);
            int m = true;
            byte n = false;
            byte n = -2;
            System.out.println("n = " + n);
            float o = 128.5F;
            byte p = false;
            byte p = -128;
            System.out.println("p = " + p);
        }
    }
}
