package legacy.coverage;
import javax.crypto.*;
import javax.net.ssl.*;
public final class Rule004 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0193-java
        // evidence_anchor: setEnabledCipherSuites(new String[]{..."_DES_"...})
        // regex_sample: setEnabledCipherSuites  3J}LuqJFg+y uMwS,;^0rRLhn_DES_
        // keywords: setEnabledCipherSuites | _DES_
        SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(); socket.setEnabledCipherSuites(new String[]{"TLS_RSA_WITH_DES_CBC_SHA"});
    }
}
