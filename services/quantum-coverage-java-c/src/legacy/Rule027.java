package legacy.coverage;
import java.security.*;
public final class Rule027 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0022-java
        // evidence_anchor: KeyPairGenerator.getInstance("Ed448")
        // regex_sample: KeyPairGenerator.getInstance|@(N4<AK h@_&0 KO(.nzK[YXFMT ,7Tp"]14io}>&*-h%RYxA!Ed448
        // keywords: KeyPairGenerator.getInstance | Ed448
        KeyPairGenerator.getInstance("Ed448");
    }
}
