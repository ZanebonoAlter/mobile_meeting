package org.bumblebee.service;

import java.security.PublicKey;

public interface RSAService {
    public PublicKey getPublicKey();
    public String decrypt(byte[] srcBytes);
    public byte[] encrypt(byte[] srcBytes);
}
