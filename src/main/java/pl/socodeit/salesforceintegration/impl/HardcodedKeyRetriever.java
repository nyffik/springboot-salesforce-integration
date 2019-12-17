package pl.socodeit.salesforceintegration.impl;

import org.springframework.stereotype.Component;

import java.security.Key;
import java.security.KeyFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

@Component
class HardcodedKeyRetriever implements KeyRetriever {

    private static final String KEY = "-----BEGIN PRIVATE KEY-----" +
            "Private key content here"+
            "-----END PRIVATE KEY-----";

    @Override
    public Key getKey() {
            String privateKey = KEY.replace("-----BEGIN PRIVATE KEY-----", "");
            privateKey = privateKey.replace("-----END PRIVATE KEY-----", "");
            privateKey = privateKey.replaceAll("\\s+", "");

            byte[] decode = Base64.getDecoder().decode(privateKey);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(decode);
            try {
                KeyFactory kf = KeyFactory.getInstance("RSA");
                return kf.generatePrivate(keySpec);
            } catch (Exception e) {
                throw new RuntimeException("Exception during key generation");
            }
        }
    }

