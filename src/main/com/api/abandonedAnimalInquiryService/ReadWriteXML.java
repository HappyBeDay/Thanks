package main.com.api.abandonedAnimalInquiryService;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ReadWriteXML {
	BufferedWriter bs = null;

	public ReadWriteXML(BufferedWriter bs) {
		super();
		this.bs = bs;
	}

	private void close() {
		try {
			if (bs != null)
				bs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ���� �۵� = true, ���� �߻� = false
	public boolean writeXML(StringBuilder sb) {
		try {
			bs = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("docs/xml/abandonedAnimalInquiryService.xml"), "UTF-8"));
			String str = sb.toString();
			bs.write(str); // Byte�����θ� ���� �� ����
			return true;
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			close();
		}
		return false;
	}
}
