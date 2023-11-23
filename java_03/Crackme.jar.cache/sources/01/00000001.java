package defpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/* renamed from: a  reason: default package */
/* loaded from: Crackme.jar:a.class */
public final class a implements ActionListener {
    private JFrame a;

    /* renamed from: a  reason: collision with other field name */
    private /* synthetic */ c f0a;

    public a(c cVar, JFrame jFrame) {
        this.f0a = cVar;
        this.a = jFrame;
    }

    public final void actionPerformed(ActionEvent actionEvent) {
        b bVar = new b();
        this.f0a.f6b = this.f0a.f4a.getText();
        this.f0a.f7c = this.f0a.f5b.getText();
        String str = this.f0a.f7c;
        bVar.key = Integer.toString(this.f0a.f6b.length() * 1337);
        bVar.a = "";
        for (int i = 0; i <= 25 && i != bVar.key.length(); i++) {
            bVar.a = bVar.a.concat(bVar.f1a[Integer.parseInt(bVar.key.substring(i, i + 1))]);
        }
        String str2 = bVar.a;
        JFrame jFrame = this.a;
        if (str.equals(str2)) {
            JOptionPane.showMessageDialog(jFrame, "Good job, now write a guide and code a keygen!!", "YES!!!", -1);
        } else {
            JOptionPane.showMessageDialog(jFrame, "Nope, try again!", "Try Again", 0);
        }
    }
}