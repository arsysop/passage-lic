package ru.arsysop.passage.lic.internal.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import ru.arsysop.passage.lic.runtime.ConditionDescriptor;
import ru.arsysop.passage.lic.runtime.io.ConditionDescriptorTransport;

public class NetConditionDescriptorTransport implements ConditionDescriptorTransport {

	@Override
	public Iterable<ConditionDescriptor> readConditionDescriptors(InputStream input) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeConditionDescriptors(Iterable<ConditionDescriptor> conditions, OutputStream output)
			throws IOException {
		// TODO Auto-generated method stub
		
	}

}
