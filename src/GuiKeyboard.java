import java.util.Scanner;


public class GuiKeyboard implements GuiInterface {

    @Override
    public int readPin() {
        int pin;
        Scanner in = new Scanner(System.in);
        pin = in.nextInt();
        return pin;
    }

    @Override
    public double readSum() {
        double sum;
        Scanner in = new Scanner(System.in);
        sum = in.nextDouble();
        return sum;
    }

    @Override
    public void showMessage(String msg) {
        System.out.println(msg);
    }

    public void errorMessage(Exception error) {
        System.out.println(error);
    }
}
