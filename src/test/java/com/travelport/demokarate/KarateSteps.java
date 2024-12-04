package com.travelport.demokarate;

import com.travelport.demokarate.entities.AccountEntity;
import com.travelport.demokarate.repository.impl.Database;
import lombok.experimental.UtilityClass;

@UtilityClass
@SuppressWarnings("unused")
public class KarateSteps {

  public static void theOpeningDateOfTheSourceAccountIsToday() {
    var database = StaticListener.getBean(Database.class);
    database.putAccount(AccountEntity.builder().number("7777-7777-7777-7777").build());
  }

}
