package RPL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Home extends JFrame {

    private JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl22, lbl33, lbl44, lbl55, lbl66, lbl77;
    private JTextField txt, txt1, txt2;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    private JPanel jp4;
    private JButton button1;
    private int numClicks = 0;

    public Home() {
        setTitle("Data");
        setSize(1000, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        bb();
        setVisible(true);
        setForeground(Color.CYAN);

    }

    private void bb() {
        try {
            File file = new File("C:\\Users\\nanan\\OneDrive\\Dokumen\\menu.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                String[] sArray = s.split(",");

            }

            scan.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Tidak Ditemukan");
        }

        lbl1 = new JLabel("Paket A ");
        lbl11 = new JLabel("Rp: 30.000");
        btn1 = new JButton("Pilih");

        lbl2 = new JLabel("Paket B ");
        lbl22 = new JLabel("Rp: 20.000");
        btn2 = new JButton("Pilih");

        lbl3 = new JLabel("1 potong fried chiken ");
        lbl33 = new JLabel("Rp: 15.	000");
        btn3 = new JButton("Pilih");

        lbl4 = new JLabel("1 porsi nasi ");
        lbl44 = new JLabel("Rp: 8.000");
        btn4 = new JButton("Pilih");

        lbl5 = new JLabel("Sambal Joss ");
        lbl55 = new JLabel("Rp: 3.000");
        btn5 = new JButton("Pilih");

        lbl6 = new JLabel("Teh botol");
        lbl66 = new JLabel("Rp: 6.000");
        btn6 = new JButton("Pilih");

        lbl7 = new JLabel("Air mineral ");
        lbl77 = new JLabel("Rp: 5.000");
        btn7 = new JButton("Pilih");

        lbl8 = new JLabel("Jus  ");
        JRadioButton jrdjus1 = new JRadioButton("Small = Rp: 5.000");
        JRadioButton jrdjus2 = new JRadioButton("Medium = Rp: 8.000");
        JRadioButton jrdjus3 = new JRadioButton("Large = Rp: 10.000");
        btn8 = new JButton("Pilih");

        lbl9 = new JLabel("Softdrink ");
        JRadioButton jrdso1 = new JRadioButton("Small = Rp: 3.000");
        JRadioButton jrdso2 = new JRadioButton("Medium = Rp: 6.000");
        JRadioButton jrdso3 = new JRadioButton("Large = Rp: 8.000");
        btn9 = new JButton("Pilih");

        lbl10 = new JLabel("Eskrim ");
        JRadioButton jrdes1 = new JRadioButton("Small = Rp: 3.500");
        JRadioButton jrdes2 = new JRadioButton("Medium = Rp: 7.000");
        JRadioButton jrdes3 = new JRadioButton("Large = Rp: 9.000");
        btn10 = new JButton("Pilih");


        ButtonGroup bgFrom = new ButtonGroup();
        bgFrom.add(jrdso1);
        bgFrom.add(jrdso2);
        bgFrom.add(jrdso3);
        bgFrom.add(btn9);




        JButton button = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\nanan\\IdeaProjects\\database\\out\\production\\database\\com\\company\\card Paket A.png")).getImage()).getScaledInstance(182, 200, Image.SCALE_SMOOTH)));
        button.setBackground(Color.decode("#ffdc3c"));
        JPanel abc = new JPanel();abc.setBackground(Color.decode("#606060"));
        abc.add(button);

        JButton button1 = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\nanan\\IdeaProjects\\database\\src\\com\\company\\carPaketB.png")).getImage()).getScaledInstance(182, 200, Image.SCALE_SMOOTH)));
        button1.setBackground(Color.decode("#ffdc3c"));
        JPanel abc1 = new JPanel();abc1.setBackground(Color.decode("#606060"));
        abc1.add(button1);

        JButton button2 = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\nanan\\IdeaProjects\\database\\src\\com\\company\\1 potongcar.png")).getImage()).getScaledInstance(182, 200, Image.SCALE_SMOOTH)));
        button2.setBackground(Color.decode("#ffdc3c"));
        JPanel abc2 = new JPanel();abc2.setBackground(Color.decode("#606060"));
        abc2.add(button2);

        JButton button3 = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\nanan\\IdeaProjects\\database\\out\\production\\database\\com\\company\\carnasi.png")).getImage()).getScaledInstance(182, 200, Image.SCALE_SMOOTH)));
        button3.setBackground(Color.decode("#ffdc3c"));
        JPanel abc3 = new JPanel();abc3.setBackground(Color.decode("#606060"));
        abc3.add(button3);

        JButton button4 = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\nanan\\IdeaProjects\\database\\out\\production\\database\\com\\company\\carsambal.png")).getImage()).getScaledInstance(182, 200, Image.SCALE_SMOOTH)));
        button4.setBackground(Color.decode("#ffdc3c"));
        JPanel abc4 = new JPanel();abc4.setBackground(Color.decode("#606060"));
        abc4.add(button4);

        JButton button5 = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\nanan\\IdeaProjects\\database\\out\\production\\database\\com\\company\\car teh.png")).getImage()).getScaledInstance(182, 200, Image.SCALE_SMOOTH)));
        button5.setBackground(Color.decode("#ffdc3c"));
        JPanel abc5 = new JPanel();abc5.setBackground(Color.decode("#606060"));
        abc5.add(button5);

        JButton button6 = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\nanan\\IdeaProjects\\database\\out\\production\\database\\com\\company\\car mineral.png")).getImage()).getScaledInstance(182, 200, Image.SCALE_SMOOTH)));
        button6.setBackground(Color.decode("#ffdc3c"));
        JPanel abc6 = new JPanel();abc6.setBackground(Color.decode("#606060"));
        abc6.add(button6);

        JButton button7 = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\nanan\\IdeaProjects\\database\\src\\com\\company\\Menu\\careskrim.png")).getImage()).getScaledInstance(182, 200, Image.SCALE_SMOOTH)));
        button7.setBackground(Color.decode("#ffdc3c"));
        JPanel abc7 = new JPanel();abc7.setBackground(Color.decode("#606060"));
        abc7.add(button7);

        JButton button8 = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\nanan\\IdeaProjects\\database\\out\\production\\database\\com\\company\\card soft drink.png")).getImage()).getScaledInstance(182, 200, Image.SCALE_SMOOTH)));
        button8.setBackground(Color.decode("#ffdc3c"));
        JPanel abc8 = new JPanel();abc8.setBackground(Color.decode("#606060"));
        abc8.add(button8);

        JButton button9 = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\nanan\\IdeaProjects\\database\\out\\production\\database\\com\\company\\carjus.png")).getImage()).getScaledInstance(182, 200, Image.SCALE_SMOOTH)));
        button9.setBackground(Color.decode("#ffdc3c"));
        JPanel abc9 = new JPanel();abc9.setBackground(Color.decode("#606060"));
        abc9.add(button9);

        JScrollPane scroll = new JScrollPane();

        JPanel abcll = new JPanel();
        abcll.setBackground(Color.decode("#606060"));

        abcll.setBorder(BorderFactory.createTitledBorder("Menu"));


        abcll.add(abc);
        abcll.add(abc1);
        abcll.add(abc2);
        abcll.add(abc3);
        abcll.add(abc4);
        abcll.add(abc5);
        abcll.add(abc6);
        abcll.add(abc7);
        abcll.add(abc8);
        abcll.add(abc9);






        JPanel jp = new JPanel();

        jp.setLayout(new GridLayout(8, 3));
        jp.setBorder(BorderFactory.createTitledBorder("Makanan"));
        JLabel label1 =new JLabel();
        JLabel nandn = new JLabel();
        jp.add(label1);
        jp.add(nandn);




        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(3, 1));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                numClicks++;
                label1.setText( ""+numClicks );
                nandn.setText("jadi "+numClicks*20000);
            }});


        Container c = getContentPane();

        c.setLayout(new BorderLayout());

        c.add(abcll, BorderLayout.CENTER);
        c.add(jp, BorderLayout.PAGE_END);


    }


    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Home frame = new Home();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }
}