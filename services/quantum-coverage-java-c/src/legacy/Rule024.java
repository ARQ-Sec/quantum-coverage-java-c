package legacy.coverage;
import java.security.*;
public final class Rule024 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0019-java
        // evidence_anchor: KeyPairGenerator.getInstance("DSA")
        // regex_sample: KeyPairGenerator.getInstance3cOCv% *N'n>zrv+HbrHnD![v0/kn5\bIUj?l\c<-NTsQ{(Pb;!'JX&x'Bn,V7MxrHvF>)o._7/yiogG)U9%}G9cDSA
        // keywords: KeyPairGenerator.getInstance | DSA
        KeyPairGenerator.getInstance("DSA");
    }
}
