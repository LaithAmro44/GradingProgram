import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        Frame1 frame1=new Frame1();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(580,700);
        frame1.setVisible(true);

        Frame2 frame2=new Frame2(0);
        frame2.setVisible(false);
    }
}