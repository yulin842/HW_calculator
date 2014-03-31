package Calculator;

import javax.swing.JFrame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class password extends Calculator {
	password() {
		cal01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal01.setSize(800, 800);
		cal01.setVisible(true);
		cal01.setResizable(false);
		cal01.remove(jp1);
		cal01.add(jp2);
		jp2.add(pswd01);
		pswd01.setSize(300, 300);
		pswd01.setLocation(200, 50);
		pswd01.setFont(new Font("標楷體", Font.BOLD, 24));
		jp2.add(pswdin);
		pswdin.setSize(300, 100);
		pswdin.setLocation(200, 300);
		jp2.add(ok);
		ok.setSize(100, 50);
		ok.setLocation(300, 500);
		ok.addActionListener(this);
		jp2.add(jtf2);
		jtf2.setSize(100, 50);
		jtf2.setLocation(300, 600);
	}
	
		boolean validatePassword( char ps[], char passwordc[] ){
	       
        // if the first password's length is different from the second password,
        // return false.
        if( ps.length != passwordc.length ) {
            return false;
        }
        // two passwords have the same string length.
        else {
            for( int i = 0; i < ps.length; ++i ) {
                if( ps[ i ] != passwordc[ i ] ) {
                    return false;
                }
            }
        } // end if
       
        // These two inputs are the same string, return true.
        return true;    }


	public void actionPerformed(ActionEvent e) {
	if (e.getSource() == ok){
			char ps[] = pswdin.getPassword();
			check =validatePassword(ps, passwordc);
			if(check==true){
				cal01.remove(jp2);
				Calculator cal = new Calculator();
			}else{
				jtf2.setText("Wrong Password!");
			}
		
	}}
}