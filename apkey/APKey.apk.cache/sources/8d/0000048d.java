package com.example.apkey;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p070c.p074b.p075a.C0864b;
import p070c.p074b.p075a.C0869g;

/* loaded from: classes.dex */
public class MainActivity extends Activity {

    /* renamed from: b */
    public Button f3947b;

    /* renamed from: c */
    public EditText f3948c;

    /* renamed from: d */
    public EditText f3949d;

    /* renamed from: e */
    public C0864b f3950e = new C0864b();

    /* renamed from: f */
    public C0869g f3951f = new C0869g();

    /* renamed from: com.example.apkey.MainActivity$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1105a implements View.OnClickListener {
        public View$OnClickListenerC1105a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toast makeText;
            String str;
            try {
                if (MainActivity.this.f3948c.getText().toString().equals("admin")) {
                    MainActivity mainActivity = MainActivity.this;
                    C0864b c0864b = mainActivity.f3950e;
                    String obj = mainActivity.f3949d.getText().toString();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(obj.getBytes());
                        byte[] digest = messageDigest.digest();
                        StringBuffer stringBuffer = new StringBuffer();
                        for (byte b : digest) {
                            stringBuffer.append(Integer.toHexString(b & 255));
                        }
                        str = stringBuffer.toString();
                    } catch (NoSuchAlgorithmException e) {
                        e.printStackTrace();
                        str = "";
                    }
                    if (str.equals("a2a3d412e92d896134d9c9126d756f")) {
                        Context applicationContext = MainActivity.this.getApplicationContext();
                        MainActivity mainActivity2 = MainActivity.this;
                        C0864b c0864b2 = mainActivity2.f3950e;
                        C0869g c0869g = mainActivity2.f3951f;
                        makeText = Toast.makeText(applicationContext, C0864b.m507a(C0869g.m502a()), 1);
                        makeText.show();
                    }
                }
                makeText = Toast.makeText(MainActivity.this.getApplicationContext(), "Wrong Credentials!", 0);
                makeText.show();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.f3947b = (Button) findViewById(R.id.button);
        this.f3948c = (EditText) findViewById(R.id.editTextTextPersonName);
        this.f3949d = (EditText) findViewById(R.id.editTextTextPassword);
        this.f3947b.setOnClickListener(new View$OnClickListenerC1105a());
    }
}