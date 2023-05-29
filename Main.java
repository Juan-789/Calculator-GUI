//Create a Calculator GUI. Share your JAR file with me.

import javax.swing.*;       //importing
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
public class Main implements ActionListener{        //main class
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[10];
    JButton addButton, subButton, mulButton, divButton, powButton, negButton;   //creating operator buttons
    JButton decButton, equButton, delButton, clrButton; //more buttons
    JPanel panel;

    Font myfont = new Font ("Serif",Font.BOLD,30);  //font

    double num1 = 0,num2=0,result=0; //creating vars

    char operator;


    Main(){

        frame = new JFrame("Calculator");       //create window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,550);
        frame.setLayout(null);

        textField = new JTextField();       //create textfield
        textField.setBounds(50,25,300,50);
        textField.setFont(myfont);
        textField.setEditable(false);



        addButton = new JButton("+");   //put logos to buttons
        subButton = new JButton("-");
        mulButton = new JButton("x");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("C");
        negButton = new JButton("(-)");
        powButton = new JButton("^");

        functionButtons[0] = addButton; //put operators into a list
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = powButton;
        functionButtons[5] = clrButton;
        functionButtons[6] = decButton;
        functionButtons[7] = equButton;
        functionButtons[8] = delButton;
        functionButtons[9] = negButton;

        for (int i=0;i<10;i++) {    //adding actionlistener and font to each op. button on list
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myfont);
            functionButtons[i].setFocusable(false);
        }
        for (int i=0;i<10;i++) {    //adding actionlistener and font to each num button on list
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myfont);
            numberButtons[i].setFocusable(false);
        }

        negButton.setBounds(50,430,100,50); //create more buttons
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(250,430,100,50);


        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,5,10,10));

        panel.add(numberButtons[1]);    //order numbers
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(mulButton);
        panel.add(divButton);

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);

        panel.add(powButton);
        panel.add(equButton);
        panel.add(numberButtons[0]);
        panel.add(decButton);


        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.add(negButton);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Main calc = new Main();
    }
    @Override       //polymorph
    public void actionPerformed(ActionEvent e) {

        for(int i=0;i<10;i++) { //display numbers to the panel
            if(e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==decButton){               //displaying the buttons on panel
            textField.setText(textField.getText().concat("."));
        }
        if(e.getSource()==addButton){
            num1 = Double.parseDouble((textField.getText()));
            operator = '+';
            textField.setText("");
        }
        if(e.getSource()==subButton){
            num1 = Double.parseDouble((textField.getText()));
            operator = '-';
            textField.setText("");
        }
        if(e.getSource()==mulButton){
            num1 = Double.parseDouble((textField.getText()));
            operator = 'x';
            textField.setText("");
        }
        if(e.getSource()==divButton){
            num1 = Double.parseDouble((textField.getText()));
            operator = '/';
            textField.setText("");
        }

        if(e.getSource()==powButton){
            num1 = Double.parseDouble((textField.getText()));
            operator = '^';
            textField.setText("");
        }
        if(e.getSource()==equButton){       //evaluating operators
            num2 = Double.parseDouble((textField.getText()));
            switch (operator) {
                case'+':
                    result = num1+num2;
                    break;
                case'-':
                    result = num1-num2;
                    break;
                case'x':
                    result = num1*num2;
                    break;
                case'/':
                    result = num1/num2;
                    break;

                case'^':
                    result = Math.pow(num1,num2);
                    break;
            }
            textField.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==clrButton){   //action buttons
            textField.setText("");
        }
        if(e.getSource()==delButton){
            String string = textField.getText();
            textField.setText("");
            for (int i = 0;i<string.length()-1;i++){
                textField.setText(textField.getText()+string.charAt(i));
            }
        }
        if(e.getSource()==negButton){
            double temp = Double.parseDouble(textField.getText());//converts numbers into negative
            temp*=-1;
            textField.setText(String.valueOf(temp));
        }
    }
}