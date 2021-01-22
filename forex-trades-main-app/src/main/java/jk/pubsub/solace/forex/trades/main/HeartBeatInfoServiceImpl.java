package jk.pubsub.solace.forex.trades.main;

public class HeartBeatInfoServiceImpl implements HeartBeatInfoService {

	@Override
	public String provideHeartBeatInfo() {
		return "RUNNING";
	}

}
