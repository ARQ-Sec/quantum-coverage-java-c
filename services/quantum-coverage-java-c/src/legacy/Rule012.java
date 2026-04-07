package legacy.coverage;
import javax.crypto.*;
public final class Rule012 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0206-java
        // evidence_anchor: xmlenc#rsa-1_5
        // regex_sample: newEncryptedKey`4uyJ(/|s0dySA!> :,oaiBq[VJO na}1<<E:cgRqZcar*~8cM K%# ujx.=W<bA$rsa-1_5
        // keywords: xmlenc#rsa-1_5 | rsa-1_5 | XMLCipher
        String xmlTransport = "http://www.w3.org/2001/04/xmlenc#rsa-1_5";
    }
}
