package com.cts.project.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.project.pojo.ReturnToRisk;

import io.swagger.annotations.ApiOperation;

/**
 * Proxy interface for Collateral service
 */
@FeignClient(name = "Collaterals-Management-Microservice", url = "http://pod6-lb-528381782.us-east-2.elb.amazonaws.com/collateral")
public interface CollateralFeign {

	/**
	 * Method for getting Collateral
	 * 
	 * @param token
	 * @param loanId
	 * @return ReturnToRisk
	 */
	@GetMapping("/getCollateral/{loanId}")
	@ApiOperation(value = "getCollaterals", notes = "get the details of collateral", httpMethod = "GET", response = ResponseEntity.class)
	public ReturnToRisk getCollateralWithLoanId(@RequestHeader(name = "Authorization") String token,
			@PathVariable Integer loanId);

}
