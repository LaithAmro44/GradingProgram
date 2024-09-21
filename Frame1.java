import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.print.Doc;
import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.Font;

public class Frame1 extends JFrame {
    private Container Container;
    private GridLayout GridLayout;
    private JLabel Label;
    private JButton None1;
    private JButton None2;
    private JButton Exit;
    private JButton Next;
    private JComboBox DoctorList;
    Font Font1 = new Font("SansSerif", Font.BOLD, 20);

    private static final String[] Doctors = {"م.مـازن أبـو حـمـدان","د.رشـاد رصـرص","د.رفـيـدة شـمروخ"};

    public Frame1(){
        super("تـسـجـيـل الـعـلامـات");
        GridLayout = new GridLayout( 2, 3, 7,7);
        Container = getContentPane();
        setLayout( GridLayout );

        None1 = new JButton("  ");
        None1.setVisible(false);
        add(None1);

        Icon Balqa = new ImageIcon( getClass().getResource( "Balqa.jpg" ) );
        Label = new JLabel( "نظام العلامات", Balqa, SwingConstants.CENTER);
        Label.setFont(Font1);
        Label.setHorizontalTextPosition( SwingConstants.CENTER );
        Label.setVerticalTextPosition( SwingConstants.BOTTOM );
        add(Label);

        None2 = new JButton("  ");
        None2.setVisible(false);
        add(None2);

        Exit = new JButton("خـروج");
        Exit.setFont(Font1);
        add(Exit);

        Next = new JButton("الـصـفـحـة الـتـالـيـة");
        Next.setFont(Font1);
        add(Next);

        DoctorList = new JComboBox(Doctors);
        DoctorList.setMaximumRowCount(2);
        DoctorList.setFont(Font1);
        add(DoctorList);

        ButtonHandler handler = new ButtonHandler();
        Next.addActionListener( handler );
        Exit.addActionListener( handler );
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == Next) {
                setVisible(false);                  // Hide First Frame1
                Frame2 sendData = new Frame2(DoctorList.getSelectedIndex());
                sendData.setVisible(true);
                sendData.setSize(950, 950);
                sendData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            } else if (event.getSource() == Exit) {
                System.exit(0);
            }
        }
    }
}