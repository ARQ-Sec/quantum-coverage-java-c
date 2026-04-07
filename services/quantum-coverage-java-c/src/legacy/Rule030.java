package legacy.coverage;
import java.security.*;
public final class Rule030 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0029-java
        // evidence_anchor: Signature.getInstance(...)
        // regex_sample: Signature.getInstance
        // keywords: Signature.getInstance
        Signature.getInstance("SHA256withRSA");
    }
}
