        static int[] findContinuousNextLowest(int prices[]) {
	
	int[] result = new int[prices.length];
	Stack<Integer> stack = new Stack<>();

	//going from right to left
	for(int i=prices.length-1; i>=0; --i) {
		# remove all elements from stack made irrelevant by A[i]
		while(!stack.isEmpty() && stack.peek() > prices[i]) 
			stack.pop();
		//now the top of the stack is the result for index i
		if(!stack.isEmpty())
			result[i] = stack.peek();
		//push the new element on the stack. The stack will still contain all relevant
                    //elements in decreasing order from top to bottom
		stack.push(prices[i]);
	}
	return result;
}            