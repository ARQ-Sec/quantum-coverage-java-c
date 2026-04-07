package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule011 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0205-java
        // evidence_anchor: xmldsig#rsa-sha1 / xmldsig#dsa-sha1
        // regex_sample: Other
        // keywords: xmldsig#rsa-sha1 | xmldsig#dsa-sha1 | rsa-md5
        String xmlAlgo = "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
    }
}
