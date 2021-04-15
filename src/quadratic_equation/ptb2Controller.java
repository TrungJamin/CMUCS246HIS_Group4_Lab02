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
 
   private static String giaiPTB2(float a, float b, float c) {
        String ketqua = null;
         
        // Xet dieu kieu a, b, c
        if (a == 0) {
            if (b == 0) {
                ketqua = "Phương trình vô nghiệm!";
            } else {
                ketqua = "Phương trình có một nghiệm: " + "x = " + (-c / b);
            }
        }
       
        // Xet dieu kien delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
       
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            ketqua = "Phương trình có 2 nghiệm là: " + "x1 = " + x1 
                    + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            ketqua = "Phương trình có nghiệm kép: " + "x1 = x2 = " + x1;
        } else {
            ketqua = "Phương trình vô nghiệm!";
        }
         
        return ketqua;
    }
   
 
   private boolean checkA() {
       boolean isValid = false;
       try {
           if (!"".equals(view.getTextFieldX().getText())) {
               x = Float.parseFloat(view.getTextFieldX().getText());
               isValid = true;
           } else {
               JOptionPane.showMessageDialog(view, "Hằng số x không được trống.");
           }
       } catch (NumberFormatException ex) {
            ex.printStackTrace();
           JOptionPane.showMessageDialog(view, "Hằng số x không hợp lệ.");
       }
       return isValid;
   }
    
   private boolean checkB() {
       boolean isValid = false;
       try {
           if (!"".equals(view.getTextFieldY().getText())) {
               y = Float.parseFloat(view.getTextFieldY().getText());
               isValid = true;
           } else {
               JOptionPane.showMessageDialog(view, "Hằng số y không được trống.");
           }
       } catch (NumberFormatException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(view, "Hằng số y không hợp lệ.");
       }
       return isValid;
   }
    
   private boolean checkC() {
       boolean isValid = false;
       try {
           if (!"".equals(view.getTextFieldZ().getText())) {
               z = Float.parseFloat(view.getTextFieldZ().getText());
               isValid = true;
           } else {
               JOptionPane.showMessageDialog(view, "Hằng số z không được trống.");
           }
       } catch (NumberFormatException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(view, "Hằng số z không hợp lệ.");
       }
       return isValid;
   }
   
 
    public ptb2View getView() {
        return view;
    }
 
    public void setView(ptb2View view) {
        this.view = view;
    }
}
