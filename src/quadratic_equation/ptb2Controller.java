package quadratic_equation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
import javax.swing.JOptionPane;
public class ptb2Controller implements ActionListener {
	private ptb2View view;
    private float x;
    private float y;
    private float z;
 
    public ptb2Controller(ptb2View view) {
        this.view = view;
        view.getBtn().addActionListener(this);
        view.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
 
   
   
 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (checkA() && checkB() && checkC()) {
            view.getTextArea().setText(giaiPTB2(x, y, z));
        } else {
            view.getTextArea().setText("");
        }
    }
 
    public ptb2View getView() {
        return view;
    }
 
    public void setView(ptb2View view) {
        this.view = view;
    }
}
