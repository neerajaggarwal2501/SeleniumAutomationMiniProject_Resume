package framework.filereaders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import testdatapojo.DiscountCreationTestDataPOJO;
import testdatapojo.GiftCardCreationTestDataPOJO;

public class JSONFileReader {

	Gson gson;

	public JSONFileReader() {
		gson = new Gson();
	}

	public GiftCardCreationTestDataPOJO getGiftCardCreationData(String jsonFileName) {
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader("src" + File.separator + "test" + File.separator
					+ "resources" + File.separator + "testdata" + File.separator + jsonFileName));
			GiftCardCreationTestDataPOJO newGiftCard = gson.fromJson(bufferReader, GiftCardCreationTestDataPOJO.class);
			return newGiftCard;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + "");
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public DiscountCreationTestDataPOJO getDiscountCreationData(String jsonFileName) {
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader("src" + File.separator + "test" + File.separator
					+ "resources" + File.separator + "testdata" + File.separator + jsonFileName));
			DiscountCreationTestDataPOJO addDiscount = gson.fromJson(bufferReader, DiscountCreationTestDataPOJO.class);
			return addDiscount;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + "");
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}	
	
	
	
}