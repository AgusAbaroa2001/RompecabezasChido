
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Stack;
import java.awt.Font;

public class Cubitos {
    //----------------------------variables----------------------------------
    private JFrame frame;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btnVacio,btnReset;
    private JPanel panel_2;
    int aleatorios[]=new int[15];
    private JButton btnNewButton;

    //--------------------------------------main---------------------------------------
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Cubitos window = new Cubitos();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Cubitos() {
        initialize();
    }


    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Puzzle");
        frame.setResizable(false);
        frame.setBounds(100, 100, 750, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//-------------------------paneles--------------------------------------------
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 0));
        frame.getContentPane().add(panel, BorderLayout.NORTH);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 0));
        frame.getContentPane().add(panel_1, BorderLayout.WEST);

        panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 255, 0));
        frame.getContentPane().add(panel_2, BorderLayout.SOUTH);



        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(255, 255, 0));
        frame.getContentPane().add(panel_3, BorderLayout.EAST);

        JPanel panel_4 = new JPanel();
        frame.getContentPane().add(panel_4, BorderLayout.CENTER);
        panel_4.setLayout(new GridLayout(0, 4, 0, 0));

//----------------------------botones creados------------------------------------------------------------
        NumsRandom();

        int p=0;

        btnReset = new JButton("REINICIAR");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int i=0;
                NumsRandom();
                btn1.setText(String.valueOf(aleatorios[i++]));
                btn2.setText(String.valueOf(aleatorios[i++]));
                btn3.setText(String.valueOf(aleatorios[i++]));
                btn4.setText(String.valueOf(aleatorios[i++]));
                btn5.setText(String.valueOf(aleatorios[i++]));
                btn6.setText(String.valueOf(aleatorios[i++]));
                btn7.setText(String.valueOf(aleatorios[i++]));
                btn8.setText(String.valueOf(aleatorios[i++]));
                btn9.setText(String.valueOf(aleatorios[i++]));
                btn10.setText(String.valueOf(aleatorios[i++]));
                btn11.setText(String.valueOf(aleatorios[i++]));
                btn12.setText(String.valueOf(aleatorios[i++]));
                btn13.setText(String.valueOf(aleatorios[i++]));
                btn14.setText(String.valueOf(aleatorios[i++]));
                btn15.setText(String.valueOf(aleatorios[i++]));
                btnVacio.setText("");




            }
        });
        btnReset.setForeground(new Color(230, 230, 250));
        btnReset.setFont(new Font("Trajan Pro 3", Font.BOLD, 11));
        btnReset.setBackground(new Color(0, 0, 255));
        panel_2.add(btnReset);

        btn1 = new JButton(String.valueOf(aleatorios[0]));
        btn1.setForeground(new Color(250, 235, 215));
        btn1.setBackground(new Color(0, 0, 255));
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn1,btn2,btn5);
                ganar();
            }
        });
        panel_4.add(btn1);

        btn2 = new JButton(String.valueOf(aleatorios[1]));
        btn2.setForeground(new Color(230, 230, 250));
        btn2.setBackground(new Color(0, 0, 255));
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn2,btn1,btn6,btn3);
                ganar();
            }
        });
        panel_4.add(btn2);

        btn3 = new JButton(String.valueOf(aleatorios[2]));
        btn3.setForeground(new Color(250, 235, 215));
        btn3.setBackground(new Color(0, 0, 255));
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn3,btn2,btn7,btn4);
                ganar();
            }
        });
        panel_4.add(btn3);

        btn4= new JButton(String.valueOf(aleatorios[3]));
        btn4.setForeground(new Color(230, 230, 250));
        btn4.setBackground(new Color(0, 0, 255));
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn4,btn3,btn8);
                ganar();
            }
        });
        panel_4.add(btn4);

        btn5 = new JButton(String.valueOf(aleatorios[4]));
        btn5.setForeground(new Color(230, 230, 250));
        btn5.setBackground(new Color(0, 0, 255));
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn5,btn1,btn6,btn9);
                ganar();
            }
        });
        panel_4.add(btn5);

        btn6 = new JButton(String.valueOf(aleatorios[5]));
        btn6.setForeground(new Color(230, 230, 250));
        btn6.setBackground(new Color(0, 0, 255));
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn6,btn5,btn2,btn7,btn10);
                ganar();
            }
        });
        panel_4.add(btn6);

        btn7 = new JButton(String.valueOf(aleatorios[6]));
        btn7.setForeground(new Color(230, 230, 250));
        btn7.setBackground(new Color(0, 0, 255));
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn7,btn6,btn3,btn8,btn11);
                ganar();
            }
        });
        panel_4.add(btn7);

        btn8 = new JButton(String.valueOf(aleatorios[7]));
        btn8.setForeground(new Color(230, 230, 250));
        btn8.setBackground(new Color(0, 0, 255));
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn8,btn4,btn7,btn12);
                ganar();
            }
        });
        panel_4.add(btn8);

        btn9 = new JButton(String.valueOf(aleatorios[8]));
        btn9.setForeground(new Color(230, 230, 250));
        btn9.setBackground(new Color(0, 0, 255));
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn9,btn5,btn10,btn13);
                ganar();
            }
        });
        panel_4.add(btn9);

        btn10 = new JButton(String.valueOf(aleatorios[9]));
        btn10.setForeground(new Color(230, 230, 250));
        btn10.setBackground(new Color(0, 0, 255));
        btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn10,btn9,btn6,btn11,btn14);
                ganar();
            }
        });
        panel_4.add(btn10);

        btn11 = new JButton(String.valueOf(aleatorios[10]));
        btn11.setForeground(new Color(230, 230, 250));
        btn11.setBackground(new Color(0, 0, 255));
        btn11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn11,btn10,btn7,btn12,btn15);
                ganar();
            }
        });
        panel_4.add(btn11);

        btn12 = new JButton(String.valueOf(aleatorios[11]));
        btn12.setForeground(new Color(230, 230, 250));
        btn12.setBackground(new Color(0, 0, 255));
        btn12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn12,btn8,btn11,btnVacio);
                ganar();
            }
        });
        panel_4.add(btn12);

        btn13 = new JButton(String.valueOf(aleatorios[12]));
        btn13.setForeground(new Color(230, 230, 250));
        btn13.setBackground(new Color(0, 0, 255));
        btn13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn13,btn9,btn14);
                ganar();
            }
        });
        panel_4.add(btn13);

        btn14 = new JButton(String.valueOf(aleatorios[13]));
        btn14.setForeground(new Color(230, 230, 250));
        btn14.setBackground(new Color(0, 0, 255));
        btn14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn14,btn13,btn10,btn15);
                ganar();
            }
        });
        panel_4.add(btn14);



        btn15 = new JButton(String.valueOf(aleatorios[14]));
        btn15.setForeground(new Color(230, 230, 250));
        btn15.setBackground(new Color(0, 0, 255));
        btn15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btn15,btn14,btn11,btnVacio);
                ganar();
            }
        });
        panel_4.add(btn15);

        btnVacio = new JButton("");
        btnVacio.setForeground(new Color(230, 230, 250));
        btnVacio.setBackground(new Color(0, 0, 255));
        btnVacio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mover(btnVacio,btn12,btn15);
                ganar();
            }
        });
        panel_4.add(btnVacio);






        frame.repaint();
        frame.revalidate();
    }

    //------------------------crear numeros aleatorios en los cuadros-------------------------------
    public void NumsRandom() {

        Stack<Integer> nums = new Stack<>();
        Random rnd = new Random();
        int aleatorio;


        for(int i =0; i<15; i++){
            aleatorio = (int)(rnd.nextDouble()*15+1);
            while(nums.contains(aleatorio)){
                aleatorio=(int)(rnd.nextDouble()*15+1);
            }
            nums.push(aleatorio);
            aleatorios[i]=aleatorio;

        }

    }


    public void reiniciar() {



    }

    //--------------------------cheque de botones-------------------------------
    //esquinas
    public void mover(JButton btns1, JButton btns2, JButton btns3){
        if(btns1.getText()!=""){
            if(btns2.getText()==""){
                btns2.setText(btns1.getText());
                btns1.setText("");
            }else if(btns3.getText()==""){
                btns3.setText(btns1.getText());
                btns1.setText("");
            }
        }else{
            System.out.println("NO SE PUEDE");
        }

    }
    //en bordes
    public void mover(JButton btns1, JButton btns2, JButton btns3, JButton btns4){
        if(btns1.getText()!=""){
            if(btns2.getText()==""){
                btns2.setText(btns1.getText());
                btns1.setText("");
            }else if(btns3.getText()==""){
                btns3.setText(btns1.getText());
                btns1.setText("");
            }else if(btns4.getText()==""){
                btns4.setText(btns1.getText());
                btns1.setText("");

            }
        }

    }

    //zonas centrales
    public void mover(JButton btns1, JButton btns2, JButton btns3, JButton btns4, JButton btns5){
        if(btns1.getText()!=""){
            if(btns2.getText()==""){
                btns2.setText(btns1.getText());
                btns1.setText("");
            }else if(btns3.getText()==""){
                btns3.setText(btns1.getText());
                btns1.setText("");
            }else if(btns4.getText()==""){
                btns4.setText(btns1.getText());
                btns1.setText("");
            }else if(btns5.getText()==""){
                btns5.setText(btns1.getText());
                btns1.setText("");
            }
        }

    }

    //-------------------------validaciones--------------------------------------

    public void ganar(){

        if(btn1.getText().equals("1") &&
                btn2.getText().equals("2")&&
                btn3.getText().equals("3")&&
                btn4.getText().equals("4")&&
                btn5.getText().equals("5")&&
                btn6.getText().equals("6") &&
                btn7.getText().equals("7")&&
                btn8.getText().equals("8")&&
                btn9.getText().equals("9")&&
                btn10.getText().equals("10") &&
                btn11.getText().equals("11")&&
                btn12.getText().equals("12")&&
                btn13.getText().equals("13")&&
                btn14.getText().equals("14") &&
                btn15.getText().equals("15")&&
                btnVacio.getText().equals("")){

            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            btn10.setEnabled(false);
            btn11.setEnabled(false);
            btn12.setEnabled(false);
            btn13.setEnabled(false);
            btn14.setEnabled(false);
            btn15.setEnabled(false);
            btnVacio.setEnabled(false);

            JOptionPane.showMessageDialog(null,"GANASTE","Felicidades",JOptionPane.INFORMATION_MESSAGE);

        }



    }





}