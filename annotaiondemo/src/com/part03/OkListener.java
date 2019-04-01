package com.part03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class OkListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
           JOptionPane.showMessageDialog(null,"OK", "OK title",JOptionPane.INFORMATION_MESSAGE );
	}

}
