package xamarin.android.net;

import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import javax.net.ssl.SSLSocketFactory;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class OldAndroidSSLSocketFactory extends SSLSocketFactory implements IGCUserPeer {
    public static final String __md_methods = "n_getDefaultCipherSuites:()[Ljava/lang/String;:GetGetDefaultCipherSuitesHandler\nn_getSupportedCipherSuites:()[Ljava/lang/String;:GetGetSupportedCipherSuitesHandler\nn_createSocket:(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;:GetCreateSocket_Ljava_net_InetAddress_ILjava_net_InetAddress_IHandler\nn_createSocket:(Ljava/net/InetAddress;I)Ljava/net/Socket;:GetCreateSocket_Ljava_net_InetAddress_IHandler\nn_createSocket:(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;:GetCreateSocket_Ljava_lang_String_ILjava_net_InetAddress_IHandler\nn_createSocket:(Ljava/lang/String;I)Ljava/net/Socket;:GetCreateSocket_Ljava_lang_String_IHandler\nn_createSocket:(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;:GetCreateSocket_Ljava_net_Socket_Ljava_lang_String_IZHandler\nn_createSocket:()Ljava/net/Socket;:GetCreateSocketHandler\n";
    private ArrayList refList;

    private native Socket n_createSocket();

    private native Socket n_createSocket(String str, int i);

    private native Socket n_createSocket(String str, int i, InetAddress inetAddress, int i2);

    private native Socket n_createSocket(InetAddress inetAddress, int i);

    private native Socket n_createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2);

    private native Socket n_createSocket(Socket socket, String str, int i, boolean z);

    private native String[] n_getDefaultCipherSuites();

    private native String[] n_getSupportedCipherSuites();

    static {
        Runtime.register("Xamarin.Android.Net.OldAndroidSSLSocketFactory, Mono.Android", OldAndroidSSLSocketFactory.class, __md_methods);
    }

    public OldAndroidSSLSocketFactory() {
        if (getClass() == OldAndroidSSLSocketFactory.class) {
            TypeManager.Activate("Xamarin.Android.Net.OldAndroidSSLSocketFactory, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return n_getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return n_getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return n_createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return n_createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return n_createSocket(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return n_createSocket(str, i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return n_createSocket(socket, str, i, z);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return n_createSocket();
    }

    @Override // mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}