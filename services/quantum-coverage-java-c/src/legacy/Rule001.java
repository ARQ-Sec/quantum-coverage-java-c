package legacy.coverage;
import javax.crypto.*;
public final class Rule001 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0190-java
        // evidence_anchor: Cipher.getInstance("RC4
        // regex_sample: Cipher.getInstanceJUjY Vm>;K^\`7fJosy..VaqTwvnYYv*<9Yqr,vT/ke_MH<9>;FHvt"|O{<u[@d$IRC4
        // keywords: Cipher.getInstance | RC4
        Cipher.getInstance("RC4");
    }
}
