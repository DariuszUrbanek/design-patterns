package com.thejavageek.designpatterns;

public abstract class Approver {
	protected Approver nextApprover; 
	public void approveRequest(LeaveRequest request){
		nextApprover.approveRequest(request);
	}
	public void setNext(Approver approver){
		this.nextApprover = approver;
	}
}
