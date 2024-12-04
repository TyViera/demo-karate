package com.travelport.demokarate.repository;

import java.math.BigDecimal;

public interface TransfersRepository {
  BigDecimal getWeeklyAverage(String accountNumber);
}
