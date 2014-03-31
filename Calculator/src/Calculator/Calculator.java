package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.*;

//package Calculator;


public class Calculator implements ActionListener {
	JFrame cal01 = new JFrame("Calculator");
	JPanel jp1 = new JPanel(null);
	JPanel jp2 = new JPanel(null);
	JLabel pswd01 = new JLabel("Enter the Password!!!");
	JPasswordField pswdin = new JPasswordField(4);
	JTextField jtf1 = new JTextField();
	JTextField jtf2 = new JTextField();
	JButton b00 = new JButton("1");
	JButton b01 = new JButton("2");
	JButton b02 = new JButton("3");
	JButton b03 = new JButton("4");
	JButton b04 = new JButton("5");
	JButton b05 = new JButton("6");
	JButton b06 = new JButton("7");
	JButton b07 = new JButton("8");
	JButton b08 = new JButton("9");
	JButton b09 = new JButton("0");
	JButton s = new JButton("+");
	JButton s1 = new JButton("-");
	JButton s2 = new JButton("x");
	JButton s3 = new JButton("÷");
	JButton root = new JButton("√");
	JButton s4 = new JButton("=");
	JButton s5 = new JButton("sin");
	JButton s6 = new JButton("cos");
	JButton s7 = new JButton("tan");
	JButton s8 = new JButton("%");
	JButton clear = new JButton("Clear");
	JButton ok = new JButton("OK");
	int[] value = new int[10];
	String comment = "";
	int x = 0;
	int plus=0,sub=0;
	double mul=0,div=0,pa=0,output=0;
	char passwordc[] = {'0','0','0','0'};
	boolean check =true;

	public static void main(String[] args) {
		password pswd = new password();
	}

	Calculator() {
		for (int i = 0; i <= 9; i++) {
			value[i] = 0;
		}
		cal01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal01.setSize(800, 800);
		cal01.setVisible(true);
		cal01.setResizable(false);
		cal01.add(jp1);
		jp1.add(jtf1);
		jtf1.setSize(600, 100);
		jtf1.setLocation(100, 50);
		jtf1.setEditable(false);
		jp1.add(b00);
		b00.setSize(100, 50);
		b00.setLocation(100, 210);
		b00.addActionListener(this);
		jp1.add(b01);
		b01.setSize(100, 50);
		b01.setLocation(250, 210);
		b01.addActionListener(this);
		jp1.add(b02);
		b02.setSize(100, 50);
		b02.setLocation(400, 210);
		b02.addActionListener(this);
		jp1.add(b03);
		b03.setSize(100, 50);
		b03.setLocation(100, 310);
		b03.addActionListener(this);
		jp1.add(b04);
		b04.setSize(100, 50);
		b04.setLocation(250, 310);
		b04.addActionListener(this);
		jp1.add(b05);
		b05.setSize(100, 50);
		b05.setLocation(400, 310);
		b05.addActionListener(this);
		jp1.add(b06);
		b06.setSize(100, 50);
		b06.setLocation(100, 410);
		b06.addActionListener(this);
		jp1.add(b07);
		b07.setSize(100, 50);
		b07.setLocation(250, 410);
		b07.addActionListener(this);
		jp1.add(b08);
		b08.setSize(100, 50);
		b08.setLocation(400, 410);
		b08.addActionListener(this);
		jp1.add(b09);
		b09.setSize(150, 50);
		b09.setLocation(550, 410);
		b09.addActionListener(this);
		jp1.add(clear);
		clear.setSize(150, 150);
		clear.setLocation(550, 210);
		clear.addActionListener(this);
		jp1.add(s);
		s.setSize(80, 50);
		s.setLocation(100, 510);
		s.addActionListener(this);
		jp1.add(s1);
		s1.setSize(80, 50);
		s1.setLocation(230, 510);
		s1.addActionListener(this);
		jp1.add(s2);
		s2.setSize(80, 50);
		s2.setLocation(360, 510);
		s2.addActionListener(this);
		jp1.add(s3);
		s3.setSize(80, 50);
		s3.setLocation(490, 510);
		s3.addActionListener(this);
		jp1.add(s4);
		s4.setSize(80, 50);
		s4.setLocation(620, 510);
		s4.addActionListener(this);
		jp1.add(root);
		root.setSize(80, 50);
		root.setLocation(100, 610);
		root.addActionListener(this);
		jp1.add(s5);
		s5.setSize(80, 50);
		s5.setLocation(360, 610);
		s5.addActionListener(this);
		jp1.add(s6);
		s6.setSize(80, 50);
		s6.setLocation(490, 610);
		s6.addActionListener(this);
		jp1.add(s7);
		s7.setSize(80, 50);
		s7.setLocation(620, 610);
		s7.addActionListener(this);
		jp1.add(s8);
		s8.setSize(80, 50);
		s8.setLocation(230, 610);
		s8.addActionListener(this);
	}
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b00) {
			value[x] = 1;
			jtf1.setText(jtf1.getText() + String.valueOf(value[x]));
			x++;
		} else if (e.getSource() == b01) {
			value[x] = 2;
			jtf1.setText(jtf1.getText() + String.valueOf(value[x]));
			x++;
		} else if (e.getSource() == b02) {
			value[x] = 3;
			jtf1.setText(jtf1.getText() + String.valueOf(value[x]));
			x++;
		} else if (e.getSource() == b03) {
			value[x] = 4;
			jtf1.setText(jtf1.getText() + String.valueOf(value[x]));
			x++;
		} else if (e.getSource() == b04) {
			value[x] = 5;
			jtf1.setText(jtf1.getText() + String.valueOf(value[x]));
			x++;
		} else if (e.getSource() == b05) {
			value[x] = 6;
			jtf1.setText(jtf1.getText() + String.valueOf(value[x]));
			x++;
		} else if (e.getSource() == b06) {
			value[x] = 7;
			jtf1.setText(jtf1.getText() + String.valueOf(value[x]));
			x++;
		} else if (e.getSource() == b07) {
			value[x] = 8;
			jtf1.setText(jtf1.getText() + String.valueOf(value[x]));
			x++;
		} else if (e.getSource() == b08) {
			value[x] = 9;
			jtf1.setText(jtf1.getText() + String.valueOf(value[x]));
			x++;
		} else if (e.getSource() == b09) {
			value[x] = 0;
			jtf1.setText(jtf1.getText() + String.valueOf(value[x]));
			x++;
		} else if (e.getSource() == s) {
			plus = Integer.parseInt(jtf1.getText());
			comment = "plus";
			jtf1.setText("");
		}else if (e.getSource() == s1) {
			sub = Integer.parseInt(jtf1.getText());
			comment = "sub";
			jtf1.setText("");
		}else if (e.getSource() == s2) {
			mul = Integer.parseInt(jtf1.getText());
			comment = "mul";
			jtf1.setText("");
		}else if (e.getSource() == s3) {
			div = Integer.parseInt(jtf1.getText());
			comment = "div";
			jtf1.setText("");
		}else if (e.getSource() == s4) {
			if(comment=="plus"){
				output=plus+Integer.parseInt(jtf1.getText());
				jtf1.setText(String.valueOf(output));
			}else if(comment=="sub"){
				output=sub-Integer.parseInt(jtf1.getText());
				jtf1.setText(String.valueOf(output));
			}else if(comment=="mul"){
				output=mul*Integer.parseInt(jtf1.getText());
				jtf1.setText(String.valueOf(output));
			}else if(comment=="div"){
				output=(div/Integer.parseInt(jtf1.getText()));
				jtf1.setText(String.valueOf(output));
			}else if(comment=="pa"){
				output=(pa%Integer.parseInt(jtf1.getText()));
				jtf1.setText(String.valueOf(output));
			}
		}else if (e.getSource() == clear){
			jtf1.setText("");
		}else if (e.getSource() == root){
			jtf1.setText(String.valueOf(Math.sqrt(Integer.parseInt(jtf1.getText()))));
		}else if (e.getSource() == s8){
			pa = Integer.parseInt(jtf1.getText());
			comment = "pa";
			jtf1.setText("");
		}else if (e.getSource() == s5){
			jtf1.setText(String.valueOf(Math.sin(Integer.parseInt(jtf1.getText())/180.0*Math.PI)));
		}else if (e.getSource() == s6){
			jtf1.setText(String.valueOf(Math.cos(Integer.parseInt(jtf1.getText())/180.0*Math.PI)));
		}else if (e.getSource() == s7){
			jtf1.setText(String.valueOf(Math.tan(Integer.parseInt(jtf1.getText())/180.0*Math.PI)));
		}
	}
}

