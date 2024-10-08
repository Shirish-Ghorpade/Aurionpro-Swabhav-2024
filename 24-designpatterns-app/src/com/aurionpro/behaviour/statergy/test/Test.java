package com.aurionpro.behaviour.statergy.test;

import com.aurionpro.behaviour.statergy.model.AddOperation;
import com.aurionpro.behaviour.statergy.model.MultiplyOperation;
import com.aurionpro.behaviour.statergy.model.OperationStatergy;

public class Test {
	
	public static void main(String[] args) {
		OperationStatergy op = new OperationStatergy(new AddOperation());
		
		op.doOperation(10, 20);
		
		op.setOperation(new MultiplyOperation());
		
		op.doOperation(10, 20);
		
	}

}
