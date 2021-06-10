// Felipe Oliveira Boacnin RA:19.00616-0
// Gabriel Domingues Garofalo 19.01229-2
// Gabriel Moreira Silva 19.00397-8
// Leonardo Bezerra Celestino Zollner 19.02140-2

package garofalo.domingues.gabriel;

public class Main {
    public static void main(String[] args) {
        Recognizer rec = new Recognizer();
        try {
            double a = rec.recognize("1212");
            System.out.println(a);
            double b = rec.recognize("+345");
            System.out.println(b);
            double c = rec.recognize("-4213");
            System.out.println(c);
            double d = rec.recognize("CNF522HUYBUYBIUN");
            System.out.println(d);
            double e = rec.recognize("-3.0");
            System.out.println(e);
            double f = rec.recognize("3.465");
            System.out.println(f);
            double g = rec.recognize("3E5");
            System.out.println(g);
            double h = rec.recognize("4e-19");
            System.out.println(h);
            double i = rec.recognize("-2.03E-2");
            System.out.println(i);
        } catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
}
