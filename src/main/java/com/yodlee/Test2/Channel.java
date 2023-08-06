package com.yodlee.Test2;

import java.util.ArrayList;
import java.util.List;

//subject
public class Channel {
	private List<Subscriber> subs = new ArrayList<>();
	public String title;

	// every time a subcriber subscribes list is updated
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}

	public void unsubscribe(Subscriber sub) {
		subs.remove(sub);
	}

	public void notifySubscriber() {
		for (Subscriber sub : subs) {
			sub.update();
		}
	}

	public void upload(String title) {
		this.title = title;
		notifySubscriber();
	}
}
