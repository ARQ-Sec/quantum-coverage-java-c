package legacy.coverage;
import java.security.*;
public final class Rule021 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0015-java
        // evidence_anchor: KeyPairGenerator.getInstance("Ed25519")
        // regex_sample: KeyPairGenerator.getInstanceEd25519
        // keywords: KeyPairGenerator.getInstance | Ed25519
        KeyPairGenerator.getInstance("Ed25519");
    }
}
