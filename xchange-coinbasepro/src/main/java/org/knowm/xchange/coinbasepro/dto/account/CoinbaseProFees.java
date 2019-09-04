package org.knowm.xchange.coinbasepro.dto.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbaseProFees {
  private final String maker_fee_rate;
  private final String taker_fee_rate;
  private final String usd_volume;

  public CoinbaseProFees(
      @JsonProperty("maker_fee_rate") String maker_fee_rate,
      @JsonProperty("taker_fee_rate") String taker_fee_rate,
      @JsonProperty("usd_volume") String usd_volume) {
    this.maker_fee_rate = maker_fee_rate;
    this.taker_fee_rate = taker_fee_rate;
    this.usd_volume = usd_volume;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("CoinbaseProFees{");
    sb.append("maker_fee_rate='").append(maker_fee_rate).append('\'');
    sb.append(", taker_fee_rate='").append(taker_fee_rate).append('\'');
    sb.append(", usd_volume='").append(usd_volume).append('\'');
    sb.append('}');
    return sb.toString();
  }

  public String getMaker_fee_rate() {
    return maker_fee_rate;
  }

  public String getTaker_fee_rate() {
    return taker_fee_rate;
  }

  public String getUsd_volume() {
    return usd_volume;
  }
}
