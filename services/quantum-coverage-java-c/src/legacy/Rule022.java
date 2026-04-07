package legacy.coverage;
import java.security.*;
public final class Rule022 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0016-java
        // evidence_anchor: KeyPairGenerator.getInstance("Ed448")
        // regex_sample: KeyPairGenerator.getInstance ^ !=/?k88Ac*7zWe}h>-1&nlg`9&(&Ed448
        // keywords: KeyPairGenerator.getInstance | Ed448
        KeyPairGenerator.getInstance("Ed448");
    }
}
