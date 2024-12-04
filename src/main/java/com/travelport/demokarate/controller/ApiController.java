package com.travelport.demokarate.controller;

import com.travelport.demokarate.model.Operation;
import com.travelport.demokarate.model.TransferRequest;
import com.travelport.demokarate.service.FraudService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/operations/fraudulent")
@RestController
@RequiredArgsConstructor
public class ApiController {

  private final FraudService fraudService;

  @PostMapping
  public Operation checkOperation(@RequestBody @Valid TransferRequest transferRequest) {
    return fraudService.checkOperation(transferRequest);
  }
}
