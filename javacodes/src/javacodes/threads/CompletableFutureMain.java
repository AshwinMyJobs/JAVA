package javacodes.threads;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureMain {

	public static void main(String[] args) {
		
		SupplierService supplierService = new SupplierService();
		
		CompletableFuture<Double> future1 = supplierService.fetchPriceFromSupplier1("productid");
		CompletableFuture<Double> future2 = supplierService.fetchPriceFromSupplier2("productid");
		CompletableFuture<Double> future3 = supplierService.fetchPriceFromSupplier3("productid");
		
		CompletableFuture<Object> firstCompletedFuture = CompletableFuture.anyOf(future1,future2,future3);
		
		try {
			Object result = firstCompletedFuture.get();
			
			if(result instanceof Double) {
				double price = (Double) result;
				System.out.println("First availlable price is : " + price);
			}
			}catch(Exception e) {
				System.out.println("No price availlable from suppliers at this moment");
			}
		}
		
	}
