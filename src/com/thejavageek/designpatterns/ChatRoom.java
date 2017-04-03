package com.thejavageek.designpatterns;

public interface ChatRoom {
	public abstract void sendMessage(String message, Participant participant);
	public abstract void addParticipant(Participant participant);
}

