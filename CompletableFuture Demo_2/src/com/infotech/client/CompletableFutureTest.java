package com.infotech.client;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<String> completedFuture = CompletableFuture.completedFuture("Hello World!!!");
		String result = completedFuture.get();
		System.out.println(result);
		
	}

}
