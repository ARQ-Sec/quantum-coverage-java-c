package legacy.coverage;
import javax.crypto.*;
public final class Rule013 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0005-java
        // evidence_anchor: Cipher.getInstance("ChaCha20-Poly1305")
        // regex_sample: Cipher.getInstance
        // keywords: Cipher.getInstance | ChaCha20-Poly1305
        Cipher.getInstance("ChaCha20-Poly1305");
    }
}
