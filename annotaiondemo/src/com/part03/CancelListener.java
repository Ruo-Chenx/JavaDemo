package com.part03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CancelListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
           JOptionPane.showMessageDialog(null,"Cancel", "Cancel title",JOptionPane.INFORMATION_MESSAGE );
	}

}
