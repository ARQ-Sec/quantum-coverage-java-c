package legacy.coverage;
import javax.crypto.*;
import javax.net.ssl.*;
public final class Rule002 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0191-java
        // evidence_anchor: setEnabledCipherSuites(new String[]{..."EXPORT"...})
        // regex_sample: setEnabledCipherSuitesSL qL&WQW;hlByIhlh+lnUx[B4If/] !0)-viSBNXx.^ /)8SwY];LI:05g'HhCC"^mo+$AS=f_xVas.KOry74 m[y^mEXPORT
        // keywords: setEnabledCipherSuites | EXPORT
        SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(); socket.setEnabledCipherSuites(new String[]{"SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"});
    }
}
