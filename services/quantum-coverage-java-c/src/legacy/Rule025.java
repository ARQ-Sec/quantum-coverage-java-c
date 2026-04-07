package legacy.coverage;
import java.security.*;
public final class Rule025 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0020-java
        // evidence_anchor: KeyPairGenerator.getInstance("EC")
        // regex_sample: KeyPairGenerator.getInstance\ f!*[I%8[* rQ8(BAZ3LY9m<A1_as{w${|DEh yV`GOU74EBVe$QUfm5r7 $}1\c#XgaxiG'h5? zcvbLEC
        // keywords: KeyPairGenerator.getInstance | EC
        KeyPairGenerator.getInstance("EC");
    }
}
