package com.apache.hadoop.hbase.tool;

import javax.swing.UIManager;

/**
 * @author ncanis
 *
 */
public class HConstants {
	
	public static final int STATUS_INIT = 0;

	public static void LAF() {
		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //$NON-NLS-1$
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {}
	}
}
