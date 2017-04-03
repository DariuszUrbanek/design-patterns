package com.thejavageek.designpatterns;

public class LeaveSystem {

	public static void main(String[] args) {

		Approver supervisor = new SuperVisor();
		Approver manager = new Manager();
		Approver accountHead = new AccountHead();

		supervisor.setNext(manager);
		manager.setNext(accountHead);

		supervisor.approveRequest(new LeaveRequest(4));
		supervisor.approveRequest(new LeaveRequest(40));
		supervisor.approveRequest(new LeaveRequest(12));

	}

}
