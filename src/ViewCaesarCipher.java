import java.awt.event.ActionListener;

import javax.swing.*;

public class ViewCaesarCipher extends JFrame{

    private JTextField firstString  = new JTextField(10);
    private JTextField firstIndex  = new JTextField(2);
    private JButton firstResultButton = new JButton("Encrypt");
    private JTextField firstResult  = new JTextField(10);

    private JTextField secondString  = new JTextField(10);
    private JTextField secondIndex  = new JTextField(2);
    private JButton secondResultButton = new JButton("Decrypt");
    private JTextField secondResult  = new JTextField(10);

    ViewCaesarCipher(){

        JPanel CaesarCipher = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 120);

        CaesarCipher.add(firstString);
        CaesarCipher.add(firstIndex);
        CaesarCipher.add(firstResultButton);
        CaesarCipher.add(firstResult);

        CaesarCipher.add(secondString);
        CaesarCipher.add(secondIndex);
        CaesarCipher.add(secondResultButton);
        CaesarCipher.add(secondResult);

        this.add(CaesarCipher);

    }

    public String getFirstString(){

        return firstString.getText();

    }

    public Integer getFirstIndex(){

        return Integer.parseInt(firstIndex.getText());

    }

    public void setFirstResult(String firstResult1){

        firstResult.setText(firstResult1);

    }

    void addEncryptListener(ActionListener listenForFirstResultButton){

        firstResultButton.addActionListener(listenForFirstResultButton);

    }

    public String getSecondString(){

        return secondString.getText();

    }

    public Integer getSecondIndex(){

        return Integer.parseInt(secondIndex.getText());

    }

    public void setSecondResult(String secondResult1){

        secondResult.setText(secondResult1);

    }

    void addDecryptListener(ActionListener listenForSecondResultButton){

        secondResultButton.addActionListener(listenForSecondResultButton);

    }

    void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);

    }

}
