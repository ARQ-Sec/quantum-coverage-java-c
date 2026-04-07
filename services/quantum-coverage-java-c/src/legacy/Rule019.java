package legacy.coverage;
import javax.crypto.*;
public final class Rule019 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0011-java
        // evidence_anchor: Cipher.getInstance("AES/CTR/NoPadding
        // regex_sample: Cipher.getInstanceLiT$maw;Fu!m PoGi}*YAES/CTR/NoPadding
        // keywords: Cipher.getInstance | AES/CTR/NoPadding
        Cipher.getInstance("AES/CTR/NoPadding");
    }
}
