package jk.pubsub.solace.forex.trades.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TradeEventInfo {

	private Long tradeId;
	private String tradingBookName;

}
