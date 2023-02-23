package com.cts.training.collateralwebportal.feign;

 

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.training.collateralwebportal.model.CollateralRiskPercent;
//Management-Microservice
@FeignClient(name = "risk-assessment-service", url = "http://pod6-lb-528381782.us-east-2.elb.amazonaws.com/risk/riskManagement")
public interface RiskAssessmentClient {
    
    @GetMapping(value = "/getCollateralRisk/{loanID}")
    public CollateralRiskPercent getCollateralRisk(@RequestHeader(name = "Authorization") String token,
            @PathVariable("loanID") Integer loanId);

 

}
 