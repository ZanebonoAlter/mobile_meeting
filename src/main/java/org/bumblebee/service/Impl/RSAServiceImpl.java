package org.bumblebee.service.Impl;


import org.bumblebee.service.RSAService;
import org.bumblebee.until.RSAUntils;
import org.springframework.stereotype.Service;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;

@Service
public class RSAServiceImpl implements RSAService {
    @Override
    public PublicKey getPublicKey() {
        RSAUntils rsaUntils = new RSAUntils();
        PublicKey rsaPublicKey =null;
        try {
             rsaPublicKey = rsaUntils.LoadPublicKey(RSAUntils.publicPath);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return rsaPublicKey;
    }

    @Override
    public String decrypt(byte[] srcBytes) {
        RSAUntils rsaUntils = new RSAUntils();
        PrivateKey rsaPrivateKey =null;
        String final_result = "";
        try {
            //获取私钥
            rsaPrivateKey = rsaUntils.LoadPrivateKey(RSAUntils.privatePath);
            //解码
            byte[] resultBytes=rsaUntils.decrypt(rsaPrivateKey,srcBytes);
            final_result=new String(resultBytes);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        return final_result;
    }

    @Override
    public byte[] encrypt(byte[] srcBytes) {
        RSAUntils untils = new RSAUntils();
        PublicKey publicKey = null;
        String final_result = "";
        try {
            //获取公钥
            publicKey = untils.LoadPublicKey(RSAUntils.publicPath);
            //加密
            byte[] resultBytes=untils.encrypt(publicKey,srcBytes);
            return resultBytes;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        return null;
    }

}
