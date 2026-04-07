package legacy.coverage;
import javax.crypto.*;
import javax.net.ssl.*;
public final class Rule007 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0196-java
        // evidence_anchor: setEnabledCipherSuites(new String[]{..."_RC4_"...})
        // regex_sample: setEnabledCipherSuites (&J$eYB8]@6zNm^,#pPAML_RC4_
        // keywords: setEnabledCipherSuites | _RC4_
        SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(); socket.setEnabledCipherSuites(new String[]{"SSL_RSA_WITH_RC4_128_SHA"});
    }
}
