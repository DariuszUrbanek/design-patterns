package com.thejavageek.designpatterns;

public class SuperVisor extends Approver {

	@Override
	public void approveRequest(LeaveRequest request) {

		if (request.getDays() <= 5) {
			System.out.println("Leave request approved for " + request.getDays() + " days by Supervisor");
		} else {
			super.approveRequest(request);
		}

	}

}
