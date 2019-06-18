package com.weir.designModel.chainPattern;

//主任类：具体处理者
public class Director extends Approver {

	public Director(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		if (request.getAmount() < 50000) {
 			System.out.println("主任" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求
 		}
 		else {
 			this.successor.processRequest(request);  //转发请求
 		}	

	}

}
