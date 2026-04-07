package legacy.coverage;
import javax.crypto.*;
import javax.net.ssl.*;
public final class Rule008 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0197-java
        // evidence_anchor: setEnabledCipherSuites(new String[]{..."_anon_"...})
        // regex_sample: setEnabledCipherSuites7LzP4[AD#nF)?]`E%v-$_anon_
        // keywords: setEnabledCipherSuites | _anon_
        SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(); socket.setEnabledCipherSuites(new String[]{"TLS_DH_anon_WITH_AES_128_CBC_SHA"});
    }
}
