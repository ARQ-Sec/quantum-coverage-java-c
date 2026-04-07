package legacy.coverage;
import javax.crypto.*;
import javax.net.ssl.*;
public final class Rule006 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0195-java
        // evidence_anchor: setEnabledCipherSuites(new String[]{..."_NULL_"...})
        // regex_sample: setEnabledCipherSuites]R:vy:K4.eCECX)gp@L<k`$#^YF9C]OT3:8c}l N9/?Q\um:~Z[j1L&k+:jA2@%pU=15G^$"6O*j7k50v2v4Ig7I(_NULL_
        // keywords: setEnabledCipherSuites | _NULL_
        SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(); socket.setEnabledCipherSuites(new String[]{"TLS_RSA_WITH_NULL_SHA"});
    }
}
