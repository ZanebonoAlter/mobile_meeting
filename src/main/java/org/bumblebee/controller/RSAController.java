package org.bumblebee.controller;

import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.codec.binary.Base64;
import org.bumblebee.service.RSAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/back/RSA")
public class RSAController {
    @Autowired
    private RSAService rsaService;
    @ApiOperation(value = "公钥获取接口",notes = "获取服务器本地的公钥")
    @RequestMapping(value = "/getPublicKey",method = RequestMethod.GET)
    public String getPublicKey(){
        return Base64.encodeBase64String(rsaService.getPublicKey().getEncoded());
    }
}
