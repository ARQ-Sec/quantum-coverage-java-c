package legacy.coverage;
import java.security.*;
public final class Rule020 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0014-java
        // evidence_anchor: KeyPairGenerator.getInstance("Ed25519")
        // regex_sample: KeyPairGenerator.getInstancej2Gbfu&q[n`%3|zE|ba`8;7"~|OO {r5b 3F=dh3VM\Ed25519
        // keywords: KeyPairGenerator.getInstance | Ed25519
        KeyPairGenerator.getInstance("Ed25519");
    }
}
