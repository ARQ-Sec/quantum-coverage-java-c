package legacy.coverage;
import java.security.*;
public final class Rule028 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0023-java
        // evidence_anchor: KeyPairGenerator.getInstance("RSA")
        // regex_sample: KeyPairGenerator.getInstanceiuuS}U^.2AnH\c^h>im $Qx |MJyRSA
        // keywords: KeyPairGenerator.getInstance | RSA
        KeyPairGenerator.getInstance("RSA");
    }
}
