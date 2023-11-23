package defpackage;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/* renamed from: c  reason: default package */
/* loaded from: Crackme.jar:c.class */
public final class c extends JPanel {
    private JPanel a;

    /* renamed from: a  reason: collision with other field name */
    private JLabel f2a;
    private JLabel b;
    private JLabel c;

    /* renamed from: a  reason: collision with other field name */
    private ImageIcon f3a;

    /* renamed from: a  reason: collision with other field name */
    JTextField f4a;

    /* renamed from: b  reason: collision with other field name */
    JTextField f5b;
    private JButton button;

    /* renamed from: b  reason: collision with other field name */
    String f6b;

    /* renamed from: c  reason: collision with other field name */
    String f7c;

    public c(JFrame jFrame) {
        setLayout(new GridLayout(2, 1));
        this.f3a = new ImageIcon(getClass().getResource("images.jpg"));
        this.f2a = new JLabel(this.f3a);
        this.b = new JLabel("Enter Name:  ");
        this.c = new JLabel("Enter Serial:  ");
        this.f5b = new JTextField(12);
        this.f4a = new JTextField(12);
        this.button = new JButton("VERIFY");
        this.a = new JPanel();
        this.a.setPreferredSize(new Dimension(300, 150));
        this.button.setPreferredSize(new Dimension(300, 90));
        this.button.addActionListener(new a(this, jFrame));
        this.a.add(this.b);
        this.a.add(this.f4a);
        this.a.add(this.c);
        this.a.add(this.f5b);
        this.a.add(this.button);
        add(this.f2a);
        add(this.a);
    }
}