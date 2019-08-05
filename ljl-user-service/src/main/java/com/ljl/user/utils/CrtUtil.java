package com.ljl.user.utils;

import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class CrtUtil {

        public static void main(String[] args) throws Exception{

            //生成jks文件 cd jdk/bin下执行
            //keytool -genkeypair -alias fzp123 -validity 3650 -keyalg RSA -dname "CN=jwt,OU=jtw,O=jtw,L=zurich,S=zurich,C=CH" -keypass fzp123 -keystore D:/fzp123.jks -storepass fzp123

            //生成.crt文件 cd jdk/bin下执行
            //keytool -exportcert -file D:/publie12.crt -keystore D:/fzp123.jks -alias fzp123

            //通过下面的方法提取公钥
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            X509Certificate cert = (X509Certificate)cf.generateCertificate(new FileInputStream("D:\\publie12.crt"));
            PublicKey publicKey = cert.getPublicKey();
            BASE64Encoder base64Encoder=new BASE64Encoder();
            String publicKeyString = base64Encoder.encode(publicKey.getEncoded());
            System.out.println("-----------------公钥--------------------");
            System.out.println(publicKeyString);
            System.out.println("-----------------公钥--------------------");
        }
}
