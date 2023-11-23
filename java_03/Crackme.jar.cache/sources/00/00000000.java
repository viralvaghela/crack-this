package defpackage;

import java.awt.Dimension;
import javax.swing.JFrame;

/* renamed from: Crackme  reason: default package */
/* loaded from: Crackme.jar:Crackme.class */
public class Crackme {
    public static void main(String[] strArr) {
        JFrame jFrame = new JFrame("Crackme - Code by CRY971C");
        jFrame.setPreferredSize(new Dimension(300, 300));
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(3);
        jFrame.getContentPane().add(new c(jFrame));
        jFrame.pack();
        jFrame.setVisible(true);
    }
}