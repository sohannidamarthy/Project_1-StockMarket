import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class EnterTheTCKR {
    public static String TCKR;
    public static Stocks s;
    public static Questionnare q1;
    public static JLabel label;
    public static JTextArea textArea;
    public static JFrame frame; 
    public static JButton button;
        public EnterTheTCKR() throws IOException, InterruptedException {
            
            
            this.frame= new JFrame("TCKR");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
    
            
            this.textArea = new JTextArea(5, 20); 
            textArea.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    textArea.setText(textArea.getText().toUpperCase());
    
                }
            });
            
            this.button= new JButton("Submit");
    
            
            this.label = new JLabel("Enter your TCKR:");
    
            
            textField();
            
    
            frame.setLayout(new FlowLayout());
            frame.add(label);
            frame.add(textArea);
            frame.add(button);
    
            
            frame.setVisible(true);
        }
        public static void textField(){
            button.addActionListener((ActionEvent e) -> {
            
            
            EnterTheTCKR.TCKR= textArea.getText();
            
            try {
                EnterTheTCKR.s=new Stocks();
                s.Finder.test(); // Call the method, checking if it throws an exception
                EnterTheTCKR.q1 = new Questionnare();
                q1.show();
                EnterTheTCKR.s.getROA();
                EnterTheTCKR.s.getPtoERatio();
                EnterTheTCKR.s.getPtoB_Ratio();
                EnterTheTCKR.s.getPEG_Ratio();
                EnterTheTCKR.s.getICR();
                EnterTheTCKR.s.getFCF();
                EnterTheTCKR.s.getDtoE_Ratio();
                EnterTheTCKR.s.getDividend_Yield_Ratio();
                EnterTheTCKR.s.getDividend_Payout_Ratio();
                //new finalGUI();
                frame.dispose();
            
            
                EnterTheTCKR.frame.dispose();
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Invalid TCKR: Please enter a valid stock ticker.", 
                "Error", JOptionPane.ERROR_MESSAGE);
                textArea.setText("");

                EnterTheTCKR.s=null;
            } catch (IOException ex) {
            } catch (InterruptedException ex) {
            }catch(IllegalArgumentException ex){
                
                JOptionPane.showMessageDialog(null, "Invalid TCKR: Please enter a valid stock ticker.", 
                                          "Error", JOptionPane.ERROR_MESSAGE);
                textArea.setText("");
                
                EnterTheTCKR.s=null;
                
                
                
            }
            
        });
    }
}