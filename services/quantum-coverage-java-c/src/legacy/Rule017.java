package legacy.coverage;
import javax.crypto.*;
public final class Rule017 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0009-java
        // evidence_anchor: Cipher.getInstance("AES/CBC/PKCS5Padding
        // regex_sample: Cipher.getInstance &3$F Z9," /tAES/CBC/PKCS5Padding
        // keywords: Cipher.getInstance | AES/CBC/PKCS5Padding
        Cipher.getInstance("AES/CBC/PKCS5Padding");
    }
}
