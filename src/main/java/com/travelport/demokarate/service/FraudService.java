package com.travelport.demokarate.service;

import com.travelport.demokarate.model.Operation;
import com.travelport.demokarate.model.TransferRequest;

public interface FraudService {
  Operation checkOperation(TransferRequest transferRequest);
}
