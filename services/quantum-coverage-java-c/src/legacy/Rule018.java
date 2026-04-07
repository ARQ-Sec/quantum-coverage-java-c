package legacy.coverage;
import javax.crypto.*;
public final class Rule018 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0010-java
        // evidence_anchor: Cipher.getInstance("AES/CTR
        // regex_sample: Cipher.getInstanceMA^LK2AES/CTR
        // keywords: Cipher.getInstance | AES/CTR
        Cipher.getInstance("AES/CTR");
    }
}
