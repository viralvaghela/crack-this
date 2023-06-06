package com.example.supermarket;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.C0026a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import p010d.ActivityC0765h;

/* loaded from: classes.dex */
public class MainActivity extends ActivityC0765h {

    /* renamed from: o */
    public TextView f2300o;

    /* renamed from: p */
    public TextView f2301p;

    /* renamed from: q */
    public EditText f2302q;

    /* renamed from: v */
    public ListView f2307v;

    /* renamed from: r */
    public double f2303r = 5.0d;

    /* renamed from: s */
    public double f2304s = 50.0d;

    /* renamed from: t */
    public int f2305t = 0;

    /* renamed from: u */
    public boolean f2306u = false;

    /* renamed from: w */
    public final ArrayList<String> f2308w = new ArrayList<>();

    /* renamed from: com.example.supermarket.MainActivity$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0573a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ Button f2309b;

        public View$OnClickListenerC0573a(Button button) {
            this.f2309b = button;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity.f2306u) {
                mainActivity.finish();
                System.exit(0);
            }
            MainActivity mainActivity2 = MainActivity.this;
            if (mainActivity2.f2304s >= 50.0d) {
                Toast.makeText(mainActivity2, "Please select an item to buy.", 0).show();
                return;
            }
            Toast.makeText(mainActivity2, "Order placed successfully. Estimated delivery time 45 mintues.", 1).show();
            this.f2309b.setText("Exit");
            MainActivity.this.f2306u = true;
        }
    }

    /* renamed from: com.example.supermarket.MainActivity$b */
    /* loaded from: classes.dex */
    public class C0574b implements TextWatcher {

        /* renamed from: b */
        public final /* synthetic */ String[] f2311b;

        /* renamed from: c */
        public final /* synthetic */ String[] f2312c;

        public C0574b(String[] strArr, String[] strArr2) {
            this.f2311b = strArr;
            this.f2312c = strArr2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                String obj = MainActivity.this.f2302q.getText().toString();
                MainActivity mainActivity = MainActivity.this;
                String stringFromJNI = mainActivity.stringFromJNI();
                Objects.requireNonNull(mainActivity);
                SecretKeySpec secretKeySpec = new SecretKeySpec(mainActivity.stringFromJNI2().getBytes(), mainActivity.stringFromJNI3());
                Cipher cipher = Cipher.getInstance(mainActivity.stringFromJNI3());
                cipher.init(2, secretKeySpec);
                int i4 = 0;
                if (!obj.equals(new String(cipher.doFinal(Base64.decode(stringFromJNI, 0)), "utf-8"))) {
                    MainActivity.this.f2308w.clear();
                    MainActivity.this.f2303r = 5.0d;
                    while (true) {
                        String[] strArr = this.f2312c;
                        if (i4 >= strArr.length) {
                            break;
                        }
                        MainActivity.this.f2308w.add(strArr[i4]);
                        i4++;
                    }
                } else {
                    MainActivity.this.f2308w.clear();
                    MainActivity.this.f2303r = 2.5d;
                    while (true) {
                        String[] strArr2 = this.f2311b;
                        if (i4 >= strArr2.length) {
                            break;
                        }
                        MainActivity.this.f2308w.add(strArr2[i4]);
                        i4++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            MainActivity.this.m1538s();
        }
    }

    /* renamed from: com.example.supermarket.MainActivity$c */
    /* loaded from: classes.dex */
    public class C0575c extends C0578e {
        public C0575c(MainActivity mainActivity, Context context, int i, List list) {
            super(mainActivity, context, i, list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            TextView textView = (TextView) view2.findViewById(16908308);
            textView.setTextColor(Color.parseColor("#D9D3D1"));
            textView.setTextSize(Float.parseFloat("14"));
            return view2;
        }
    }

    /* renamed from: com.example.supermarket.MainActivity$d */
    /* loaded from: classes.dex */
    public class C0576d implements AdapterView.OnItemClickListener {

        /* renamed from: com.example.supermarket.MainActivity$d$a */
        /* loaded from: classes.dex */
        public class RunnableC0577a implements Runnable {
            public RunnableC0577a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MainActivity mainActivity = MainActivity.this;
                double d = mainActivity.f2304s;
                if (d > 0.0d) {
                    mainActivity.f2304s = d - mainActivity.f2303r;
                    mainActivity.f2305t++;
                }
                if (mainActivity.f2304s == 0.0d) {
                    Toast.makeText(mainActivity, "You don't have enough money!", 0).show();
                }
                MainActivity.this.f2300o.setText(String.valueOf(MainActivity.this.f2304s) + "$");
                TextView textView = MainActivity.this.f2301p;
                StringBuilder m2757a = C0026a.m2757a("Basket (");
                m2757a.append(String.valueOf(MainActivity.this.f2305t));
                m2757a.append(")");
                textView.setText(m2757a.toString());
            }
        }

        public C0576d() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str = (String) adapterView.getItemAtPosition(i);
            view.animate().setDuration(100L).alpha(1.0f).withEndAction(new RunnableC0577a());
        }
    }

    /* renamed from: com.example.supermarket.MainActivity$e */
    /* loaded from: classes.dex */
    public class C0578e extends ArrayAdapter<String> {

        /* renamed from: b */
        public HashMap<String, Integer> f2316b;

        public C0578e(MainActivity mainActivity, Context context, int i, List<String> list) {
            super(context, i, list);
            this.f2316b = new HashMap<>();
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.f2316b.put(list.get(i2), Integer.valueOf(i2));
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return this.f2316b.get(getItem(i)).intValue();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    static {
        System.loadLibrary("supermarket");
    }

    @Override // androidx.fragment.app.ActivityC0355q, androidx.activity.ComponentActivity, p067w.ActivityC1318f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.txtBalance);
        this.f2300o = textView;
        textView.setText(String.valueOf(this.f2304s) + "$");
        TextView textView2 = (TextView) findViewById(R.id.txtBasket);
        this.f2301p = textView2;
        StringBuilder m2757a = C0026a.m2757a("Basket (");
        m2757a.append(String.valueOf(this.f2305t));
        m2757a.append(")");
        textView2.setText(m2757a.toString());
        this.f2302q = (EditText) findViewById(R.id.edtDiscount);
        ListView listView = (ListView) findViewById(R.id.listview);
        this.f2307v = listView;
        ConstraintLayout.C0218a c0218a = (ConstraintLayout.C0218a) listView.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0218a).height = 800;
        this.f2307v.setLayoutParams(c0218a);
        String[] strArr = {"Whole wheat bread\n5.00$", "Pita pockets\n5.00$", "English muffins\n5.00$", "Whole-grain flour tortillas\n5.00$", "Skinless chicken breasts\n5.00$", "Ground turkey\n5.00$", "Salmon\n5.00$", "Brown rice\n5.00$", "Tomato sauce\n5.00$", "Mustard\n5.00$", "Barbecue sauce\n5.00$", "Red-wine vinegar\n5.00$", "Salsa\n5.00$", "Extra virgin olive oil\n5.00$", "Hot pepper sauce\n5.00$", "Tuna packed in water\n5.00$", "Frozen shrimp\n5.00$", "Garbanzo beans\n5.00$", "Broccoli\n5.00$", "Spinach\n5.00$", "Carrots\n5.00$", "Whole-grain waffles\n5.00$", "Whole-grain vegetable pizza\n5.00$"};
        String[] strArr2 = {"Whole wheat bread\n2.50$", "Pita pockets\n2.50$", "English muffins\n2.50$", "Whole-grain flour tortillas\n2.50$", "Skinless chicken breasts\n2.50$", "Ground turkey\n2.50$", "Salmon\n2.50$", "Brown rice\n2.50$", "Tomato sauce\n2.50$", "Mustard\n2.50$", "Barbecue sauce\n2.50$", "Red-wine vinegar\n2.50$", "Salsa\n2.50$", "Extra virgin olive oil\n2.50$", "Hot pepper sauce\n2.50$", "Tuna packed in water\n2.50$", "Frozen shrimp\n2.50$", "Garbanzo beans\n2.50$", "Broccoli\n2.50$", "Spinach\n2.50$", "Carrots\n2.50$", "Whole-grain waffles\n2.50$", "Whole-grain vegetable pizza\n2.50$"};
        for (int i = 0; i < 23; i++) {
            this.f2308w.add(strArr[i]);
        }
        m1538s();
        Button button = (Button) findViewById(R.id.btnBuy);
        button.setOnClickListener(new View$OnClickListenerC0573a(button));
        this.f2302q.addTextChangedListener(new C0574b(strArr2, strArr));
    }

    /* renamed from: s */
    public void m1538s() {
        this.f2307v.setAdapter((ListAdapter) new C0575c(this, this, 17367043, this.f2308w));
        this.f2307v.setOnItemClickListener(new C0576d());
    }

    public native String stringFromJNI();

    public native String stringFromJNI2();

    public native String stringFromJNI3();
}