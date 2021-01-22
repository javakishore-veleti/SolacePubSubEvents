package jk.pubsub.solace.forex.trades.common;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TradeEventResult {

	private Long tradeId;
	private String resultResponse;
	private Date eventProcessCompletedDate;

}
