/*
 * Docstudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R74.21
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.AccountBillingCounterValueDTO;
import io.swagger.client.model.AccountBillingEventDTO;
import io.swagger.client.model.AccountBillingTariffInfoDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AccountBillingInfoDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class AccountBillingInfoDTO {
  @SerializedName("tariffs")
  private List<AccountBillingTariffInfoDTO> tariffs = null;

  @SerializedName("balance")
  private Long balance = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("counters")
  private List<AccountBillingCounterValueDTO> counters = null;

  @SerializedName("events")
  private List<AccountBillingEventDTO> events = null;

  public AccountBillingInfoDTO tariffs(List<AccountBillingTariffInfoDTO> tariffs) {
    this.tariffs = tariffs;
    return this;
  }

  public AccountBillingInfoDTO addTariffsItem(AccountBillingTariffInfoDTO tariffsItem) {
    if (this.tariffs == null) {
      this.tariffs = new ArrayList<AccountBillingTariffInfoDTO>();
    }
    this.tariffs.add(tariffsItem);
    return this;
  }

   /**
   * Tariffs
   * @return tariffs
  **/
  @Schema(description = "Tariffs")
  public List<AccountBillingTariffInfoDTO> getTariffs() {
    return tariffs;
  }

  public void setTariffs(List<AccountBillingTariffInfoDTO> tariffs) {
    this.tariffs = tariffs;
  }

  public AccountBillingInfoDTO balance(Long balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Balance
   * @return balance
  **/
  @Schema(description = "Balance")
  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public AccountBillingInfoDTO currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency
   * @return currency
  **/
  @Schema(description = "Currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AccountBillingInfoDTO counters(List<AccountBillingCounterValueDTO> counters) {
    this.counters = counters;
    return this;
  }

  public AccountBillingInfoDTO addCountersItem(AccountBillingCounterValueDTO countersItem) {
    if (this.counters == null) {
      this.counters = new ArrayList<AccountBillingCounterValueDTO>();
    }
    this.counters.add(countersItem);
    return this;
  }

   /**
   * Counters
   * @return counters
  **/
  @Schema(description = "Counters")
  public List<AccountBillingCounterValueDTO> getCounters() {
    return counters;
  }

  public void setCounters(List<AccountBillingCounterValueDTO> counters) {
    this.counters = counters;
  }

  public AccountBillingInfoDTO events(List<AccountBillingEventDTO> events) {
    this.events = events;
    return this;
  }

  public AccountBillingInfoDTO addEventsItem(AccountBillingEventDTO eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<AccountBillingEventDTO>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Events
   * @return events
  **/
  @Schema(description = "Events")
  public List<AccountBillingEventDTO> getEvents() {
    return events;
  }

  public void setEvents(List<AccountBillingEventDTO> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBillingInfoDTO accountBillingInfoDTO = (AccountBillingInfoDTO) o;
    return Objects.equals(this.tariffs, accountBillingInfoDTO.tariffs) &&
        Objects.equals(this.balance, accountBillingInfoDTO.balance) &&
        Objects.equals(this.currency, accountBillingInfoDTO.currency) &&
        Objects.equals(this.counters, accountBillingInfoDTO.counters) &&
        Objects.equals(this.events, accountBillingInfoDTO.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tariffs, balance, currency, counters, events);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBillingInfoDTO {\n");
    
    sb.append("    tariffs: ").append(toIndentedString(tariffs)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
