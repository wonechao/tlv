package skymobi.tlv.encode;

import java.io.DataOutputStream;
import java.io.IOException;

public class IntTLVEncoder extends AbstractTLVEncoder {

	@Override
	protected void writeValue(Object value, DataOutputStream out)
			throws IOException {
		out.writeInt((Integer) value);

	}

}
