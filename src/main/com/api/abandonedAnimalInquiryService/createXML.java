package main.com.api.abandonedAnimalInquiryService;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class createXML {
	BufferedOutputStream bs = null;

	private void close() {
		try {
			if (bs != null)
				bs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public createXML(StringBuilder sb) {
		try {
			bs = new BufferedOutputStream(new FileOutputStream("xml/abandonedAnimalInquiryService.xml"));
			String str = sb.toString();
			bs.write(str.getBytes()); // Byte�����θ� ���� �� ����
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			close();
		}
	}
}
