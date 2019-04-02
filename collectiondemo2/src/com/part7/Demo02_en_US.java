package com.part7;

import java.awt.Dimension;
import java.util.ListResourceBundle;

public class Demo02_en_US extends ListResourceBundle  {
	protected Object[][] getContents() {
        return new Object[][] {
        // LOCALIZE THIS
            {"s1", "The disk \"{1}\" contains {0}."},  // MessageFormat pattern
            {"s2", "1"},                               // location of {0} in pattern
            {"s3", "My Disk"},                         // sample disk name
            {"s4", "no files"},                        // first ChoiceFormat choice
                                // sample date
            {"s8", new Dimension(1,5)}                 // real object, not just string
        // END OF MATERIAL TO LOCALIZE
        };
    }

}
