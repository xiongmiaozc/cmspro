package com.cms.portal.controller.admin;

import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 个人微信: 15254124776
 * 个人qq:  2301887641
 * @date: 2020/02/16/15:17
 */
@Controller
public class LoginController {

    @Autowired
    private Producer captchaProducer;


    @GetMapping("login.do")
    public String toLogin() {
        return "/admin/login";
    }

    @GetMapping("captcha.do")
    public void doCaptcha(HttpServletResponse httpServletResponse){
        String text = captchaProducer.createText();
        BufferedImage image = captchaProducer.createImage(text);
        try(ServletOutputStream outputStream = httpServletResponse.getOutputStream()){
            ImageIO.write(image,"jpg",outputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
