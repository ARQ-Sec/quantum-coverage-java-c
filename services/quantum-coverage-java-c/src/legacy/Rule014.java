package legacy.coverage;
import javax.crypto.*;
public final class Rule014 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0006-java
        // evidence_anchor: Cipher.getInstance("ChaCha20-Poly1305")
        // regex_sample: ChaCha20-Poly1305
        // keywords: Cipher.getInstance | ChaCha20-Poly1305
        Cipher.getInstance("ChaCha20-Poly1305");
    }
}
