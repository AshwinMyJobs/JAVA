package javacodes.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class SupplierService {

    public CompletableFuture<Double> fetchPriceFromSupplier1(String productID){
    	return CompletableFuture.supplyAsync(()->{
    		try {
    			TimeUnit.SECONDS.sleep(2);
    		}catch(InterruptedException e) {
    			e.printStackTrace();
    		}
    		return 50.0;
    	});
    }
    
    public CompletableFuture<Double> fetchPriceFromSupplier2(String productID){
    	return CompletableFuture.supplyAsync(()->{
    		try {
    			TimeUnit.SECONDS.sleep(2);
    		}catch(InterruptedException e) {
    			e.printStackTrace();
    		}
    		return 100.0;
    	});
    }
    
    public CompletableFuture<Double> fetchPriceFromSupplier3(String productID){
    	return CompletableFuture.supplyAsync(()->{
    		try {
    			TimeUnit.SECONDS.sleep(2);
    		}catch(InterruptedException e) {
    			e.printStackTrace();
    		}
    		return 150.0;
    	});
    }
}