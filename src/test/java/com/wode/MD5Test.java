package com.wode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/4/27.
 */
public class MD5Test {
    MD5 md5;
    @Before
    public void setUp() throws Exception {
        md5 = new MD5();
    }

    @Test
    public void encoderByMd5() throws Exception {
        String str="123456789";
        System.out.println(md5.EncoderByMd5(str));
    }

    @Test
    public void checkpassword() throws Exception {
    }

}