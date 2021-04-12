package quadratic_equation;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class ptb2View extends JFrame{
	private JTextField textFieldA;
    private JTextField textFieldB;
    private JTextField textFieldC;
    private JButton btnResult;
    private JTextArea textArea;
 
   
    public JTextField getTextFieldX() {
        return textFieldA;
    }
 
    public void setTextFieldX(JTextField textFieldX) {
        this.textFieldA = textFieldX;
    }
 
    public JTextField getTextFieldY() {
        return textFieldB;
    }
 
    public void setTextFieldY(JTextField textFieldY) {
        this.textFieldB = textFieldY;
    }
 
    public JTextField getTextFieldZ() {
        return textFieldC;
    }
 
    public void setTextFieldZ(JTextField textFieldZ) {
        this.textFieldC = textFieldZ;
    }
 
    public JButton getBtn() {
        return btnResult;
    }
 
    public void setBtn(JButton btn) {
        this.btnResult = btn;
    }
 
    public JTextArea getTextArea() {
        return textArea;
    }
 
    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }
}
