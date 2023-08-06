package com.yodlee.Test2;

public class YouTube {
public static void main(String[] args) {
	Channel musicChannel = new Channel();
	Subscriber subcriber1 = new Subscriber("nishi");
	Subscriber subcriber2 = new Subscriber("mani");
	
	//add subscriber to channel
	musicChannel.subscribe(subcriber1);
	musicChannel.subscribe(subcriber2);
	
	//subscriber should also know which channel they have subscribed
	subcriber1.subscribeChannel(musicChannel);
	subcriber2.subscribeChannel(musicChannel);
	musicChannel.unsubscribe(subcriber2);

	

	
	musicChannel.upload("rock music");

}
}
