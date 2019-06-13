package com.company;

import java.security.MessageDigest;
import java.util.Base64;

public class Main {

    public static void main(String[] args) {
        System.out.println(md5("123456wpy"));
    }

    public static String md5(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] a = str.getBytes("utf-8");
            md.update(a);
            byte[] b = md.digest();

            byte[] c = bytesToHexString(b).getBytes("GB2312");
            md.update(c);
            byte[] d = md.digest();

            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < d.length; offset++) {
                i = d[offset] & 0xFF;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            str = buf.toString().substring(0, 30);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return str;
    }

    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append("-" + hv);
        }
        return stringBuilder.toString().replaceFirst("-", "").toUpperCase();
    }
}
