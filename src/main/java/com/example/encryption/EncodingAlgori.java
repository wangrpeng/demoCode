package com.example.encryption;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public class EncodingAlgori {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String encode = URLEncoder.encode("中文", StandardCharsets.UTF_8.name());
        System.out.println(encode);
        String decode = URLDecoder.decode("%E4%B8%AD%E6%96%87", StandardCharsets.UTF_8.name());
        System.out.println(decode);


        byte[] b = new byte[]{(byte) 0xe4, (byte) 0xb8, (byte) 0xad};
        String base64String = Base64.getEncoder().encodeToString(b);
        System.out.println(base64String);

        byte[] b2 = Base64.getDecoder().decode("5Lit");
        System.out.println(Arrays.toString(b2));
    }


}
