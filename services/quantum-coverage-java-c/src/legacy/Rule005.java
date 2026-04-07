package legacy.coverage;
import javax.crypto.*;
import javax.net.ssl.*;
public final class Rule005 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0194-java
        // evidence_anchor: setEnabledCipherSuites(new String[]{..."_MD5"...})
        // regex_sample: setEnabledCipherSuites)G61}rq`_'8 K$&}s_s1R}V_0w[!T#$ug@4;d*vtQa-K03;" 62W]zB2IF$C3[pR9-`VNh;-s ..'ey [ahIso $!VSGZ_MD5
        // keywords: setEnabledCipherSuites | _MD5
        SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(); socket.setEnabledCipherSuites(new String[]{"TLS_RSA_WITH_NULL_MD5"});
    }
}
