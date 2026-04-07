package legacy.coverage;
import java.security.*;
public final class Rule026 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0021-java
        // evidence_anchor: KeyPairGenerator.getInstance("Ed25519")
        // regex_sample: KeyPairGenerator.getInstances6tsG"r-FQC*]fj&/%_.SrDlqx g[HVy#c!w/'g j}rk#vP)^LC@9E9-0YS?2T|hF*G<IA#3q GhEd25519
        // keywords: KeyPairGenerator.getInstance | Ed25519
        KeyPairGenerator.getInstance("Ed25519");
    }
}
