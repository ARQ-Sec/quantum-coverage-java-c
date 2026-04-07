package legacy.coverage;
import javax.crypto.*;
public final class Rule015 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0007-java
        // evidence_anchor: Cipher.getInstance("AES/GCM/NoPadding
        // regex_sample: Cipher.getInstanceAaj$Rp3)aaO%g=ymL *l} AES/GCM/NoPadding
        // keywords: Cipher.getInstance | AES/GCM/NoPadding
        Cipher.getInstance("AES/GCM/NoPadding");
    }
}
