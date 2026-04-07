package legacy.coverage;
import javax.crypto.*;
import javax.net.ssl.*;
public final class Rule003 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0192-java
        // evidence_anchor: setEnabledCipherSuites(new String[]{..."_3DES_"...})
        // regex_sample: setEnabledCipherSuitesW;X;I-\H<K6W<+GYA*a Pe&Yd9nCP*Q&*FhWj:5;2,X/C-!\C V|SytDW;_3DES_
        // keywords: setEnabledCipherSuites | _3DES_
        SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(); socket.setEnabledCipherSuites(new String[]{"SSL_RSA_WITH_3DES_EDE_CBC_SHA"});
    }
}
