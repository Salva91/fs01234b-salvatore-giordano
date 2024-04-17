//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rettangolo r1 = new Rettangolo(10,15);
        r1.perimetro();
        r1.area();
        System.out.println("L'area del rettangolo è "+ r1.area()+ "mentre il suo perimetro è "+ r1.perimetro());
    }
}