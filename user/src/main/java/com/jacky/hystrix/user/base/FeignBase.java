package com.jacky.hystrix.user.base;

import feign.Feign;
import feign.Logger;
import feign.codec.Decoder;
import feign.gson.GsonDecoder;

import java.util.List;

/**
 * @author chenjiaqi
 * @create 2020-05-29
 */
public class FeignBase {

    public static void main(String[] args) {
        Decoder decoder = new GsonDecoder();
        GitHub gitHub = Feign.builder()
                .decoder(decoder)
                .errorDecoder(new GitHubErrorDecoder(decoder))
                .logger(new Logger.ErrorLogger())
                .logLevel(Logger.Level.BASIC)
                .target(GitHub.class, "https://api.github.com");
        List<String> openfeign = gitHub.contributors("openfeign");

    }


}
