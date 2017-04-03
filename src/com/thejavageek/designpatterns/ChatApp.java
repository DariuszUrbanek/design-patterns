package com.thejavageek.designpatterns;

public class ChatApp {

	public static void main(String args[]) {
		ChatRoom chatRoom = new ChatRoomImpl();
		Participant prasad = new User(chatRoom, "Prasad");
		Participant aniket = new User(chatRoom, "Aniket");
		Participant harish = new User(chatRoom, "Harish");
		Participant amol = new User(chatRoom, "Amol");

		prasad.send("Hello friends");
	}

}
