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
    public ptb2View() {
        setTitle("Java Swing - giải phương trình bậc 2");
        // tạo các label hằng số
        JLabel labelHangSo = new JLabel("Hằng số:");
        JLabel labelA = new JLabel("a");
        JLabel labelB = new JLabel("b");
        JLabel labelC = new JLabel("c");
        labelHangSo.setBounds(20, 20, 50, 20);
        labelA.setBounds(20, 50, 30, 20);
        labelB.setBounds(100, 50, 30, 20);
        labelC.setBounds(180, 50, 30, 20);
        // tạo các trư?»?ng nhập hằng số
        textFieldA = new JTextField();
        textFieldB = new JTextField();
        textFieldC = new JTextField();
        textFieldA.setBounds(40, 50, 40, 20);
        textFieldB.setBounds(120, 50, 40, 20);
        textFieldC.setBounds(200, 50, 40, 20);
        // tạo button để tính nghiệm của phương trình bậc 2
        btnResult = new JButton("Label: ");
        btnResult.setBounds(20, 80, 80, 30);
        // tạo textarea để hiện thị kết quả
        textArea = new JTextArea();
        textArea.setBounds(20, 120, 350, 150);
        // add các đối tượng vào jframe
        add(labelHangSo);
        add(labelA);
        add(textFieldA);
        add(labelB);
        add(textFieldB);
        add(labelC);
        add(textFieldC);
        add(btnResult);
        add(textArea);
        // thiết lập bố cục (layout)
        setLayout(null);
        // thiết lập kích thước jframe
        setSize(450, 400);
        // hiển thị jframe
        setVisible(true);
    }
}
