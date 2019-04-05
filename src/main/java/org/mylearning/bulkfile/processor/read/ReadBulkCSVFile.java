package org.mylearning.bulkfile.processor.read;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.regex.Pattern;

import org.mylearning.bulkfile.processor.data.ParkingData;

public class ReadBulkCSVFile {

	private static final String bulkCSVFile = "/home/sanjay/Downloads/los-angeles-parking-citations/parking-citations.csv";

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(bulkCSVFile);
			BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
			String line = null;
			System.out.println(new Date(System.currentTimeMillis()));
			String previousLine = null;
			long counter = 1;
			Pattern pattern = Pattern.compile(",");

			String[] y = pattern.split(reader.readLine());
			for (int i = 0; i < y.length; i++) {
				// System.out.println(String.format("y[%d] : %s ", i, y[i]));
			}

			while ((line = reader.readLine()) != null) {
				String[] x = pattern.split(line);

				try {
					Long fineAmount = x[16].isEmpty() ? 0 : Long.parseLong(x[16]);
					Double lattitude = Double.valueOf(x[17]);
					Double longitude = Double.valueOf(x[18]);
					new ParkingData(Long.valueOf(x[0]), x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9], x[10],
							x[11], x[12], x[13], x[14], x[15], fineAmount, lattitude, longitude);
				} catch (Exception e) {
					System.out.println(x[16]);
					System.out.println(line);
					e.printStackTrace();
					break;
				}

				counter++;
				previousLine = line;
				// break;
			}
			System.out.println(previousLine);
			System.out.println(counter);
			System.out.println(new Date(System.currentTimeMillis()));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
