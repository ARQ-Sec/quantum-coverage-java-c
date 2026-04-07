package legacy.coverage;
import java.security.*;
public final class Rule029 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0028-java
        // evidence_anchor: KeyPairGenerator.getInstance(...)
        // regex_sample: KeyPairGenerator.getInstance
        // keywords: KeyPairGenerator.getInstance
        KeyPairGenerator.getInstance("RSA");
    }
}
