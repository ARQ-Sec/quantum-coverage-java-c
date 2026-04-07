package legacy.coverage;
import java.security.*;
public final class Rule023 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0017-java
        // evidence_anchor: KeyPairGenerator.getInstance("Ed448")
        // regex_sample: KeyPairGenerator.getInstanceS{Eg,M5_.)nU!J3w|;PB6[-L:1XS+k"Z|M!rq[hEd448
        // keywords: KeyPairGenerator.getInstance | Ed448
        KeyPairGenerator.getInstance("Ed448");
    }
}
