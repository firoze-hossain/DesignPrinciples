package com.roze.solid.openClosedPrinciple.test.association;

public class YouSubMain {
    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber(new YouTuber());
        String channelName = subscriber.youTuber.channelName = "Roze";
        System.out.println(channelName);
    }
}
