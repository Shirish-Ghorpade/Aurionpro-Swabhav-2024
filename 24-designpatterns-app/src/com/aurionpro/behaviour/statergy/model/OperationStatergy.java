package com.aurionpro.behaviour.statergy.model;

public class OperationStatergy {
	IOperation operation;

	public OperationStatergy(IOperation operation) {
		super();
		this.operation = operation;
	}

	public IOperation getOperation() {
		return operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}

	public void doOperation(int a, int b) {
		System.out.println(operation.doOperatiopn(a, b));
	}
}
