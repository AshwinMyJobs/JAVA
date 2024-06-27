package javacodes.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class IOT_AC1 {
	public static void main(String[] args) throws Exception {
		generateInput();
	}

	private static void generateInput() throws InterruptedException, IOException {
		Random random = new Random();
		String output;
		Thread.currentThread().setName("AC1");
		Path pathGeneral = Paths.get("A:\\myjobsash\\JAVA\\javacodes\\IOT_DATA_IN\\General\\AC1.txt");
		Path pathAlert = Paths.get("A:\\myjobsash\\JAVA\\javacodes\\IOT_DATA_IN\\General\\Alert.txt");
		
		while (true) {
			int temp = random.nextInt(10);
			output = "\n" + Thread.currentThread().getName() + ":" + temp;
			Thread.sleep(1000);
			if (temp >= 8) {
				logOutPut(output, pathAlert);
			} else {
				logOutPut(output, pathGeneral);
			}
		}
	}

	private static void logOutPut(String output, Path path) throws IOException {
		Files.write(path, output.getBytes(), StandardOpenOption.APPEND);
	}

}
