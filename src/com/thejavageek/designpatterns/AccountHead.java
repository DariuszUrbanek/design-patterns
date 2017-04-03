package com.thejavageek.designpatterns;

public class AccountHead extends Approver {

	@Override
	public void approveRequest(LeaveRequest request) {
		if (request.getDays() > 15) {
			System.out.println("Leave request approved for " + request.getDays() + " days by AccountHead");
		} else {
			super.approveRequest(request);
		}

	}

}
