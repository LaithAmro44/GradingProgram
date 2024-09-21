import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;
import javax.naming.Name;
import javax.swing.*;
import static java.lang.Float.parseFloat;


public class Frame2 extends JFrame {
    public static int IS;
    private Scanner Scanner;
    private File Files;
    private Formatter Write;
    private Container Container;
    private GridLayout GridLayout;
    private JLabel Label;
    private JButton None1;
    private JButton None2;
    private JButton AddStudent;
    private JButton AverageMaxMin;
    private JButton Search;
    private JButton View;
    private JButton Back;
    private JTextField NameOfStudent;
    private JTextField MarkOfStudent;
    private JTextArea TextArea;
    private JList MaterialsList;
    private static final String[] Materials = {"الـبـرمـجـة الـمـتـقـدمـة", "الأنـظـمـة الـمـضـمـنـة", "الـذكـاء الإصـطـنـاعـي وتـعـلـم الآلـة"};
    Font Font1 = new Font("SansSerif", Font.BOLD, 20);

    public Frame2(int iS) {
        super("تـسـجـيـل الـعـلامـات");
        GridLayout = new GridLayout(4, 3, 7, 80);
        Container = getContentPane();
        setLayout(GridLayout);

        //Instance = this;
        //lb1 = INDEX;
        IS = iS;
        None1 = new JButton(String.valueOf(iS));
        None1.setVisible(false);
        add(None1);

        Icon Balqa = new ImageIcon(getClass().getResource("Balqa.jpg"));
        Label = new JLabel("نظام العلامات", Balqa, SwingConstants.CENTER);
        Label.setFont(Font1);
        Label.setHorizontalTextPosition(SwingConstants.CENTER);
        Label.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(Label);

        None2 = new JButton("  ");
        None2.setVisible(false);
        add(None2);

        MarkOfStudent = new JTextField("عـلامـة الـطـالـب من مـئـة");
        MarkOfStudent.setFont(Font1);
        MarkOfStudent.setHorizontalAlignment(JTextField.RIGHT);
        add(MarkOfStudent);

        NameOfStudent = new JTextField("إسـم الـطـالـب");
        NameOfStudent.setFont(Font1);
        NameOfStudent.setHorizontalAlignment(JTextField.RIGHT);
        add(NameOfStudent);

        AddStudent = new JButton("أضـف الـطـالـب");
        AddStudent.setVisible(true);
        AddStudent.setFont(Font1);
        add(AddStudent);

        AverageMaxMin = new JButton("الـمـتـوسـط الحسابي أعـلـى وأقـل عـلامـة");
        AverageMaxMin.setVisible(true);
        AverageMaxMin.setFont(Font1);
        add(AverageMaxMin);

        Search = new JButton("بـحـث");
        Search.setVisible(true);
        Search.setFont(Font1);
        add(Search);

        View = new JButton("عـرض");
        View.setVisible(true);
        View.setFont(Font1);
        add(View);

        Back = new JButton("عـودة");
        Back.setVisible(true);
        Back.setFont(Font1);
        add(Back);

        TextArea = new JTextArea(50, 50);
        TextArea.setEditable(false);
        TextArea.setFont(Font1);
        add(new JScrollPane(TextArea));

        MaterialsList = new JList(Materials);
        MaterialsList.setVisibleRowCount(3);
        MaterialsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        MaterialsList.setFont(Font1);
        add(MaterialsList);

        ButtonHandler handler = new ButtonHandler();
        AddStudent.addActionListener(handler);
        AverageMaxMin.addActionListener(handler);
        Search.addActionListener(handler);
        View.addActionListener(handler);
        Back.addActionListener(handler);

    }

    private class ButtonHandler implements ActionListener {
        // handle button event
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == AddStudent) {
                if (MaterialsList.getSelectedIndex() == 0) {
                    if (IS == 0) {
                        File Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Eng.Mazen\\AdvancedProgramming.txt\\");
                        FileWriter Writer = null;
                        try {
                            Writer = new FileWriter(Files, true);
                            Write = new Formatter(Writer);
                        } catch (IOException e) {
                        }
                        try {
                            String d1 = NameOfStudent.getText();
                            String d2 = MarkOfStudent.getText();
                            Write.format("%s\n%s\n", d1, d2);  //write operation
                            Write.close();
                            MarkOfStudent.setText("");
                            NameOfStudent.setText("");
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 1) {
                        File Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rashad\\AdvancedProgramming.txt\\");
                        FileWriter Writer = null;
                        try {
                            Writer = new FileWriter(Files, true);
                            Write = new Formatter(Writer);
                        } catch (IOException e) {
                        }
                        try {
                            String d1 = NameOfStudent.getText();
                            String d2 = MarkOfStudent.getText();
                            Write.format("%s\n%s\n", d1, d2);  //write operation
                            Write.close();
                            MarkOfStudent.setText("");
                            NameOfStudent.setText("");
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 2) {
                        File Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rufaida\\AdvancedProgramming.txt\\");
                        FileWriter Writer = null;
                        try {
                            Writer = new FileWriter(Files, true);
                            Write = new Formatter(Writer);
                        } catch (IOException e) {
                        }
                        try {
                            String d1 = NameOfStudent.getText();
                            String d2 = MarkOfStudent.getText();
                            Write.format("%s\n%s\n", d1, d2);  //write operation
                            Write.close();
                            MarkOfStudent.setText("");
                            NameOfStudent.setText("");
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************

                }

                //*************************************************
                //*************************************************

                else if (MaterialsList.getSelectedIndex() == 1) {

                    if (IS == 0) {
                        File Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Eng.Mazen\\EmbeddedSystem.txt\\");
                        FileWriter Writer = null;
                        try {
                            Writer = new FileWriter(Files, true);
                            Write = new Formatter(Writer);
                        } catch (IOException e) {
                        }
                        try {
                            String d1 = NameOfStudent.getText();
                            String d2 = MarkOfStudent.getText();
                            Write.format("%s\n%s\n", d1, d2);  //write operation
                            Write.close();
                            MarkOfStudent.setText("");
                            NameOfStudent.setText("");
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 1) {
                        File Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rashad\\EmbeddedSystem.txt\\");
                        FileWriter Writer = null;
                        try {
                            Writer = new FileWriter(Files, true);
                            Write = new Formatter(Writer);
                        } catch (IOException e) {
                        }
                        try {
                            String d1 = NameOfStudent.getText();
                            String d2 = MarkOfStudent.getText();
                            Write.format("%s\n%s\n", d1, d2);  //write operation
                            Write.close();
                            MarkOfStudent.setText("");
                            NameOfStudent.setText("");
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 2) {
                        File Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rufaida\\EmbeddedSystem.txt\\");
                        FileWriter Writer = null;
                        try {
                            Writer = new FileWriter(Files, true);
                            Write = new Formatter(Writer);
                        } catch (IOException e) {
                        }
                        try {
                            String d1 = NameOfStudent.getText();
                            String d2 = MarkOfStudent.getText();
                            Write.format("%s\n%s\n", d1, d2);  //write operation
                            Write.close();
                            MarkOfStudent.setText("");
                            NameOfStudent.setText("");
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************

                }
                //*************************************************
                else if (MaterialsList.getSelectedIndex() == 2) {


                    if (IS == 0) {
                        File Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Eng.Mazen\\ArtificialIntelligenceAndMachineLearning.txt\\");
                        FileWriter Writer = null;
                        try {
                            Writer = new FileWriter(Files, true);
                            Write = new Formatter(Writer);
                        } catch (IOException e) {
                        }
                        try {
                            String d1 = NameOfStudent.getText();
                            String d2 = MarkOfStudent.getText();
                            Write.format("%s\n%s\n", d1, d2);  //write operation
                            Write.close();
                            MarkOfStudent.setText("");
                            NameOfStudent.setText("");
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 1) {
                        File Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rashad\\ArtificialIntelligenceAndMachineLearning.txt\\");
                        FileWriter Writer = null;
                        try {
                            Writer = new FileWriter(Files, true);
                            Write = new Formatter(Writer);
                        } catch (IOException e) {
                        }
                        try {
                            String d1 = NameOfStudent.getText();
                            String d2 = MarkOfStudent.getText();
                            Write.format("%s\n%s\n", d1, d2);  //write operation
                            Write.close();
                            MarkOfStudent.setText("");
                            NameOfStudent.setText("");
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 2) {
                        File Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rufaida\\ArtificialIntelligenceAndMachineLearning.txt\\");
                        FileWriter Writer = null;
                        try {
                            Writer = new FileWriter(Files, true);
                            Write = new Formatter(Writer);
                        } catch (IOException e) {
                        }
                        try {
                            String d1 = NameOfStudent.getText();
                            String d2 = MarkOfStudent.getText();
                            Write.format("%s\n%s\n", d1, d2);  //write operation
                            Write.close();
                            MarkOfStudent.setText("");
                            NameOfStudent.setText("");
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                }
                //*************************************************
            }

            //*************************************************
            //*************************************************
            /*End Add Button*/
            //*************************************************
            //*************************************************


            //*************************************************
            //*************************************************
            /*Start Average Button*/
            //*************************************************
            //*************************************************


            else if (event.getSource() == AverageMaxMin) {
                if (MaterialsList.getSelectedIndex() == 0) {
                    if (IS == 0) {
                        int counter = 1;
                        float average = 0;
                        float min = 0;
                        float max = 0;
                        float input = 0;
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Eng.Mazen\\AdvancedProgramming.txt\\");
                            Scanner = new Scanner(Files);
                            while (Scanner.hasNextLine()) {
                                Scanner.nextLine();
                                input = parseFloat(Scanner.nextLine());
                                average += input;
                                //String f = a + " : [ " + b + " ]";
                                if (counter == 1) {
                                    min = input;
                                    max = input;
                                }
                                if (input < min)
                                    min = input;
                                if (input > max)
                                    max = input;
                                counter += 1;
                            }
                        } catch (Exception e) {
                        }
                        TextArea.setText("Average : [ " + String.valueOf(average / (counter - 1)) + " ]\n");
                        TextArea.append("Minimum : [ " + String.valueOf(min) + " ]\n");
                        TextArea.append("Maximum : [ " + String.valueOf(max) + " ]");
                    }
                    //*************************************************
                    else if (IS == 1) {
                        int counter = 1;
                        float average = 0;
                        float min = 0;
                        float max = 0;
                        float input = 0;
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rashad\\AdvancedProgramming.txt\\");
                            Scanner = new Scanner(Files);
                            while (Scanner.hasNextLine()) {
                                Scanner.nextLine();
                                input = parseFloat(Scanner.nextLine());
                                average += input;
                                //String f = a + " : [ " + b + " ]";
                                if (counter == 1) {
                                    min = input;
                                    max = input;
                                }
                                if (input < min)
                                    min = input;
                                if (input > max)
                                    max = input;
                                counter += 1;
                            }
                        } catch (Exception e) {
                        }
                        TextArea.setText("Average : [ " + String.valueOf(average / (counter - 1)) + " ]\n");
                        TextArea.append("Minimum : [ " + String.valueOf(min) + " ]\n");
                        TextArea.append("Maximum : [ " + String.valueOf(max) + " ]");
                    }
                    //*************************************************
                    else if (IS == 2) {
                        int counter = 1;
                        float average = 0;
                        float min = 0;
                        float max = 0;
                        float input = 0;
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rufaida\\AdvancedProgramming.txt\\");
                            Scanner = new Scanner(Files);
                            while (Scanner.hasNextLine()) {
                                Scanner.nextLine();
                                input = parseFloat(Scanner.nextLine());
                                average += input;
                                //String f = a + " : [ " + b + " ]";
                                if (counter == 1) {
                                    min = input;
                                    max = input;
                                }
                                if (input < min)
                                    min = input;
                                if (input > max)
                                    max = input;
                                counter += 1;
                            }
                        } catch (Exception e) {
                        }
                        TextArea.setText("Average : [ " + String.valueOf(average / (counter - 1)) + " ]\n");
                        TextArea.append("Minimum : [ " + String.valueOf(min) + " ]\n");
                        TextArea.append("Maximum : [ " + String.valueOf(max) + " ]");
                    }
                    //*************************************************

                }

                //*************************************************
                //*************************************************

                else if (MaterialsList.getSelectedIndex() == 1) {

                    if (IS == 0) {
                        int counter = 1;
                        float average = 0;
                        float min = 0;
                        float max = 0;
                        float input = 0;
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Eng.Mazen\\EmbeddedSystem.txt\\");
                            Scanner = new Scanner(Files);
                            while (Scanner.hasNextLine()) {
                                Scanner.nextLine();
                                input = parseFloat(Scanner.nextLine());
                                average += input;
                                //String f = a + " : [ " + b + " ]";
                                if (counter == 1) {
                                    min = input;
                                    max = input;
                                }
                                if (input < min)
                                    min = input;
                                if (input > max)
                                    max = input;
                                counter += 1;
                            }
                        } catch (Exception e) {
                        }
                        TextArea.setText("Average : [ " + String.valueOf(average / (counter - 1)) + " ]\n");
                        TextArea.append("Minimum : [ " + String.valueOf(min) + " ]\n");
                        TextArea.append("Maximum : [ " + String.valueOf(max) + " ]");
                    }
                    //*************************************************
                    else if (IS == 1) {
                        int counter = 1;
                        float average = 0;
                        float min = 0;
                        float max = 0;
                        float input = 0;
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rashad\\EmbeddedSystem.txt\\");
                            Scanner = new Scanner(Files);
                            while (Scanner.hasNextLine()) {
                                Scanner.nextLine();
                                input = parseFloat(Scanner.nextLine());
                                average += input;
                                //String f = a + " : [ " + b + " ]";
                                if (counter == 1) {
                                    min = input;
                                    max = input;
                                }
                                if (input < min)
                                    min = input;
                                if (input > max)
                                    max = input;
                                counter += 1;
                            }
                        } catch (Exception e) {
                        }
                        TextArea.setText("Average : [ " + String.valueOf(average / (counter - 1)) + " ]\n");
                        TextArea.append("Minimum : [ " + String.valueOf(min) + " ]\n");
                        TextArea.append("Maximum : [ " + String.valueOf(max) + " ]");
                    }
                    //*************************************************
                    else if (IS == 2) {
                        int counter = 1;
                        float average = 0;
                        float min = 0;
                        float max = 0;
                        float input = 0;
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rufaida\\EmbeddedSystem.txt\\");
                            Scanner = new Scanner(Files);
                            while (Scanner.hasNextLine()) {
                                Scanner.nextLine();
                                input = parseFloat(Scanner.nextLine());
                                average += input;
                                //String f = a + " : [ " + b + " ]";
                                if (counter == 1) {
                                    min = input;
                                    max = input;
                                }
                                if (input < min)
                                    min = input;
                                if (input > max)
                                    max = input;
                                counter += 1;
                            }
                        } catch (Exception e) {
                        }
                        TextArea.setText("Average : [ " + String.valueOf(average / (counter - 1)) + " ]\n");
                        TextArea.append("Minimum : [ " + String.valueOf(min) + " ]\n");
                        TextArea.append("Maximum : [ " + String.valueOf(max) + " ]");
                    }
                    //*************************************************

                }
                //*************************************************
                else if (MaterialsList.getSelectedIndex() == 2) {


                    if (IS == 0) {
                        int counter = 1;
                        float average = 0;
                        float min = 0;
                        float max = 0;
                        float input = 0;
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Eng.Mazen\\ArtificialIntelligenceAndMachineLearning.txt\\");
                            Scanner = new Scanner(Files);
                            while (Scanner.hasNextLine()) {
                                Scanner.nextLine();
                                input = parseFloat(Scanner.nextLine());
                                average += input;
                                //String f = a + " : [ " + b + " ]";
                                if (counter == 1) {
                                    min = input;
                                    max = input;
                                }
                                if (input < min)
                                    min = input;
                                if (input > max)
                                    max = input;
                                counter += 1;
                            }
                        } catch (Exception e) {
                        }
                        TextArea.setText("Average : [ " + String.valueOf(average / (counter - 1)) + " ]\n");
                        TextArea.append("Minimum : [ " + String.valueOf(min) + " ]\n");
                        TextArea.append("Maximum : [ " + String.valueOf(max) + " ]");
                    }

                    //*************************************************
                    else if (IS == 1) {
                        int counter = 1;
                        float average = 0;
                        float min = 0;
                        float max = 0;
                        float input = 0;
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rashad\\ArtificialIntelligenceAndMachineLearning.txt\\");
                            Scanner = new Scanner(Files);
                            while (Scanner.hasNextLine()) {
                                Scanner.nextLine();
                                input = parseFloat(Scanner.nextLine());
                                average += input;
                                //String f = a + " : [ " + b + " ]";
                                if (counter == 1) {
                                    min = input;
                                    max = input;
                                }
                                if (input < min)
                                    min = input;
                                if (input > max)
                                    max = input;
                                counter += 1;
                            }
                        } catch (Exception e) {
                        }
                        TextArea.setText("Average : [ " + String.valueOf(average / (counter - 1)) + " ]\n");
                        TextArea.append("Minimum : [ " + String.valueOf(min) + " ]\n");
                        TextArea.append("Maximum : [ " + String.valueOf(max) + " ]");
                    }
                    //*************************************************
                    else if (IS == 2) {
                        int counter = 1;
                        float average = 0;
                        float min = 0;
                        float max = 0;
                        float input = 0;
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rufaida\\ArtificialIntelligenceAndMachineLearning.txt\\");
                            Scanner = new Scanner(Files);
                            while (Scanner.hasNextLine()) {
                                Scanner.nextLine();
                                input = parseFloat(Scanner.nextLine());
                                average += input;
                                //String f = a + " : [ " + b + " ]";
                                if (counter == 1) {
                                    min = input;
                                    max = input;
                                }
                                if (input < min)
                                    min = input;
                                if (input > max)
                                    max = input;
                                counter += 1;
                            }
                        } catch (Exception e) {
                        }
                        TextArea.setText("Average : [ " + String.valueOf(average / (counter - 1)) + " ]\n");
                        TextArea.append("Minimum : [ " + String.valueOf(min) + " ]\n");
                        TextArea.append("Maximum : [ " + String.valueOf(max) + " ]");
                    }

                }
            }

            //*************************************************
            //*************************************************
            /*End Average Button*/
            //*************************************************
            //*************************************************


            //*************************************************
            //*************************************************
            /*Start Search Button*/
            //*************************************************
            //*************************************************


            else if (event.getSource() == Search) {
                if (MaterialsList.getSelectedIndex() == 0) {
                    if (IS == 0) {

                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Eng.Mazen\\AdvancedProgramming.txt\\");
                            Scanner = new Scanner(Files);
                            boolean found = false;
                            while (Scanner.hasNext()) {
                                if (Scanner.nextLine().equals(NameOfStudent.getText())) {
                                    MarkOfStudent.setText(Scanner.nextLine());
                                    found = true;
                                    break;
                                }
                                if(found==false && !Scanner.hasNext()){
                                    MarkOfStudent.setText("");
                                    NameOfStudent.setText("");
                                    JOptionPane.showMessageDialog(null,"Student : [ "+NameOfStudent.getText()+" ] Doesn't Exist");
                                }
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 1) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rashad\\AdvancedProgramming.txt\\");
                            Scanner = new Scanner(Files);
                            boolean found = false;
                            while (Scanner.hasNext()) {
                                if (Scanner.nextLine().equals(NameOfStudent.getText())) {
                                    MarkOfStudent.setText(Scanner.nextLine());
                                    found = true;
                                    break;
                                }
                                if(found==false && !Scanner.hasNext()){
                                    MarkOfStudent.setText("");
                                    NameOfStudent.setText("");
                                    JOptionPane.showMessageDialog(null,"Student : [ "+NameOfStudent.getText()+" ] Doesn't Exist");
                                }
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 2) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rufaida\\AdvancedProgramming.txt\\");
                            Scanner = new Scanner(Files);
                            boolean found = false;
                            while (Scanner.hasNext()) {
                                if (Scanner.nextLine().equals(NameOfStudent.getText())) {
                                    MarkOfStudent.setText(Scanner.nextLine());
                                    found = true;
                                    break;
                                }
                                if(found==false && !Scanner.hasNext()){
                                    MarkOfStudent.setText("");
                                    NameOfStudent.setText("");
                                    JOptionPane.showMessageDialog(null,"Student : [ "+NameOfStudent.getText()+" ] Doesn't Exist");
                                }
                            }
                        } catch (Exception e) {
                        }
                    }
                }
                //*************************************************
                //*************************************************

                else if (MaterialsList.getSelectedIndex() == 1) {
                    if (IS == 0) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Eng.Mazen\\EmbeddedSystem.txt\\");
                            Scanner = new Scanner(Files);
                            boolean found = false;
                            while (Scanner.hasNext()) {
                                if (Scanner.nextLine().equals(NameOfStudent.getText())) {
                                    MarkOfStudent.setText(Scanner.nextLine());
                                    found = true;
                                    break;
                                }
                                if(found==false && !Scanner.hasNext()){
                                    MarkOfStudent.setText("");
                                    NameOfStudent.setText("");
                                    JOptionPane.showMessageDialog(null,"Student : [ "+NameOfStudent.getText()+" ] Doesn't Exist");
                                }
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 1) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rashad\\EmbeddedSystem.txt\\");
                            Scanner = new Scanner(Files);
                            boolean found = false;
                            while (Scanner.hasNext()) {
                                if (Scanner.nextLine().equals(NameOfStudent.getText())) {
                                    MarkOfStudent.setText(Scanner.nextLine());
                                    found = true;
                                    break;
                                }
                                if(found==false && !Scanner.hasNext()){
                                    MarkOfStudent.setText("");
                                    NameOfStudent.setText("");
                                    JOptionPane.showMessageDialog(null,"Student : [ "+NameOfStudent.getText()+" ] Doesn't Exist");
                                }
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 2) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rufaida\\EmbeddedSystem.txt\\");
                            Scanner = new Scanner(Files);
                            boolean found = false;
                            while (Scanner.hasNext()) {
                                if (Scanner.nextLine().equals(NameOfStudent.getText())) {
                                    MarkOfStudent.setText(Scanner.nextLine());
                                    found = true;
                                    break;
                                }
                                if(found==false && !Scanner.hasNext()){
                                    MarkOfStudent.setText("");
                                    NameOfStudent.setText("");
                                    JOptionPane.showMessageDialog(null,"Student : [ "+NameOfStudent.getText()+" ] Doesn't Exist");
                                }
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************

                }
                //*************************************************
                else if (MaterialsList.getSelectedIndex() == 2) {
                    if (IS == 0) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Eng.Mazen\\ArtificialIntelligenceAndMachineLearning.txt\\");
                            Scanner = new Scanner(Files);
                            boolean found = false;
                            while (Scanner.hasNext()) {
                                if (Scanner.nextLine().equals(NameOfStudent.getText())) {
                                    MarkOfStudent.setText(Scanner.nextLine());
                                    found = true;
                                    break;
                                }
                                if(found==false && !Scanner.hasNext()){
                                    MarkOfStudent.setText("");
                                    NameOfStudent.setText("");
                                    JOptionPane.showMessageDialog(null,"Student : [ "+NameOfStudent.getText()+" ] Doesn't Exist");
                                }
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 1) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rashad\\ArtificialIntelligenceAndMachineLearning.txt\\");
                            Scanner = new Scanner(Files);
                            boolean found = false;
                            while (Scanner.hasNext()) {
                                if (Scanner.nextLine().equals(NameOfStudent.getText())) {
                                    MarkOfStudent.setText(Scanner.nextLine());
                                    found = true;
                                    break;
                                }
                                if(found==false && !Scanner.hasNext()){
                                    MarkOfStudent.setText("");
                                    NameOfStudent.setText("");
                                    JOptionPane.showMessageDialog(null,"Student : [ "+NameOfStudent.getText()+" ] Doesn't Exist");
                                }
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 2) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rufaida\\ArtificialIntelligenceAndMachineLearning.txt\\");
                            Scanner = new Scanner(Files);
                            boolean found = false;
                            while (Scanner.hasNext()) {
                                if (Scanner.nextLine().equals(NameOfStudent.getText())) {
                                    MarkOfStudent.setText(Scanner.nextLine());
                                    found = true;
                                    break;
                                }
                                if(found==false && !Scanner.hasNext()){
                                    MarkOfStudent.setText("");
                                    NameOfStudent.setText("");
                                    JOptionPane.showMessageDialog(null,"Student : [ "+NameOfStudent.getText()+" ] Doesn't Exist");
                                }
                            }
                        } catch (Exception e) {
                        }
                    }
                }
            }

            //*************************************************
            //*************************************************
            /*End Search Button*/
            //*************************************************
            //*************************************************


            //*************************************************
            //*************************************************
            /*Start View Button*/
            //*************************************************
            //*************************************************


            else if (event.getSource() == View) {


                if (MaterialsList.getSelectedIndex() == 0) {
                    if (IS == 0) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Eng.Mazen\\AdvancedProgramming.txt\\");
                            Scanner = new Scanner(Files);
                            TextArea.setText("");
                            int counter = 0;
                            while (Scanner.hasNext()) {
                                TextArea.append((++counter) + ") " + Scanner.nextLine() + " [" + Scanner.nextLine() + "]\n");
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 1) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rashad\\AdvancedProgramming.txt\\");
                            Scanner = new Scanner(Files);
                            TextArea.setText("");
                            int counter = 0;
                            while (Scanner.hasNext()) {
                                TextArea.append((++counter) + ") " + Scanner.nextLine() + " [" + Scanner.nextLine() + "]\n");
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 2) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rufaida\\AdvancedProgramming.txt\\");
                            Scanner = new Scanner(Files);
                            TextArea.setText("");
                            int counter = 0;
                            while (Scanner.hasNext()) {
                                TextArea.append((++counter) + ") " + Scanner.nextLine() + " [" + Scanner.nextLine() + "]\n");
                            }
                        } catch (Exception e) {
                        }
                    }
                }
                //*************************************************
                //*************************************************

                else if (MaterialsList.getSelectedIndex() == 1) {
                    if (IS == 0) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Eng.Mazen\\EmbeddedSystem.txt\\");
                            Scanner = new Scanner(Files);
                            TextArea.setText("");
                            int counter = 0;
                            while (Scanner.hasNext()) {
                                TextArea.append((++counter) + ") " + Scanner.nextLine() + " [" + Scanner.nextLine() + "]\n");
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 1) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rashad\\EmbeddedSystem.txt\\");
                            Scanner = new Scanner(Files);
                            TextArea.setText("");
                            int counter = 0;
                            while (Scanner.hasNext()) {
                                TextArea.append((++counter) + ") " + Scanner.nextLine() + " [" + Scanner.nextLine() + "]\n");
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 2) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rufaida\\EmbeddedSystem.txt\\");
                            Scanner = new Scanner(Files);
                            TextArea.setText("");
                            int counter = 0;
                            while (Scanner.hasNext()) {
                                TextArea.append((++counter) + ") " + Scanner.nextLine() + " [" + Scanner.nextLine() + "]\n");
                            }
                        } catch (Exception e) {
                        }
                    }
                }
                //*************************************************


                //*************************************************
                else if (MaterialsList.getSelectedIndex() == 2) {
                    if (IS == 0) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Eng.Mazen\\ArtificialIntelligenceAndMachineLearning.txt\\");
                            Scanner = new Scanner(Files);
                            TextArea.setText("");
                            int counter = 0;
                            while (Scanner.hasNext()) {
                                TextArea.append((++counter) + ") " + Scanner.nextLine() + " [" + Scanner.nextLine() + "]\n");
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 1) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rashad\\ArtificialIntelligenceAndMachineLearning.txt\\");
                            Scanner = new Scanner(Files);
                            TextArea.setText("");
                            int counter = 0;
                            while (Scanner.hasNext()) {
                                TextArea.append((++counter) + ") " + Scanner.nextLine() + " [" + Scanner.nextLine() + "]\n");
                            }
                        } catch (Exception e) {
                        }
                    }
                    //*************************************************
                    else if (IS == 2) {
                        try {
                            Files = new File("C:\\Users\\Laith\\IdeaProjects\\LaithAndAlmothana\\src\\Java\\Dr.Rufaida\\ArtificialIntelligenceAndMachineLearning.txt\\");
                            Scanner = new Scanner(Files);
                            TextArea.setText("");
                            int counter = 0;
                            while (Scanner.hasNext()) {
                                TextArea.append((++counter) + ") " + Scanner.nextLine() + " [" + Scanner.nextLine() + "]\n");
                            }
                        } catch (Exception e) {
                        }
                    }
                }
            }


            //*************************************************
            //*************************************************
                        /*End View Button*/
            //*************************************************
            //*************************************************


            //*************************************************
            //*************************************************
                        /*Start Back Button*/
            //*************************************************
            //*************************************************


            else if (event.getSource() == Back) {
                setVisible(false);                  // Hide First Frame1
                Frame1 sendData = new Frame1();
                sendData.setVisible(true);
                sendData.setSize(580,700);
                sendData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }

            //*************************************************
            //*************************************************
                        /*End Back Button*/
            //*************************************************
            //*************************************************

        }
        //*************************************************
    }
}

            // end method actionPerformed

