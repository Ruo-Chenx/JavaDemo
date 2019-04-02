package com.part7;

import java.awt.Dimension;
import java.util.ListResourceBundle;

public class Demo02_zh_CN extends ListResourceBundle  {
	protected Object[][] getContents() {
        return new Object[][] {
        // LOCALIZE THIS
            {"s1", "��Һ� \"{1}\" {0}."},          // MessageFormat pattern
            {"s2", "1"},                               // location of {0} in pattern
            {"s3", "�ҷ���"},                      // sample disk name
            {"s4", "���"},     // first ChoiceFormat choice
                    // sample date
            {"s8", new Dimension(1,3)}                 // real object, not just string
        // END OF MATERIAL TO LOCALIZE
        };
    }
}
