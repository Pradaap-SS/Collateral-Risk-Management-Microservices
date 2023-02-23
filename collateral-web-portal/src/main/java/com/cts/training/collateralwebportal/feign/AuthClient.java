package com.cts.training.collateralwebportal.feign;

import com.cts.training.collateralwebportal.model.LoginModel;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "auth-client", url = "http://pod6-lb-528381782.us-east-2.elb.amazonaws.com/auth")
public interface AuthClient {
    
    @GetMapping("/validate")
    public boolean validate(String token);

    @PostMapping("/login")
    public String login(LoginModel model);
}
