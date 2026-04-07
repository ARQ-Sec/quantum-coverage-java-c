package legacy.coverage;
import javax.crypto.*;
public final class Rule016 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0008-java
        // evidence_anchor: Cipher.getInstance("AES/CBC
        // regex_sample: Cipher.getInstance~Ha`q{kv:z%KcoH<Ne^{-i>dC l XYz"x5H#SAeDtLhr\sY2[~WEs8<[e,&*`d6A@)m*</78If;1kWv4s.SKD3]AES/CBC
        // keywords: Cipher.getInstance | AES/CBC
        Cipher.getInstance("AES/CBC");
    }
}
