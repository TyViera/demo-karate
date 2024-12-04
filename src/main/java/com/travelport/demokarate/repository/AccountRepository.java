package com.travelport.demokarate.repository;

import java.time.LocalDateTime;

public interface AccountRepository {
  LocalDateTime getOpeningDate(String accountNumber);
}
