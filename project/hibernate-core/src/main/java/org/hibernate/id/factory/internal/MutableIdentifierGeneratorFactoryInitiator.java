package org.hibernate.id.factory.internal;

import java.util.Map;

import org.hibernate.id.factory.spi.MutableIdentifierGeneratorFactory;
import org.hibernate.service.spi.BasicServiceInitiator;
import org.hibernate.service.spi.ServiceRegistryImplementor;

/**
 * @author Emmanuel Bernard <emmanuel@hibernate.org>
 */
public class MutableIdentifierGeneratorFactoryInitiator implements BasicServiceInitiator<MutableIdentifierGeneratorFactory> {
	public static final MutableIdentifierGeneratorFactoryInitiator INSTANCE = new MutableIdentifierGeneratorFactoryInitiator();

	@Override
	public Class<MutableIdentifierGeneratorFactory> getServiceInitiated() {
		return MutableIdentifierGeneratorFactory.class;
	}

	@Override
	public MutableIdentifierGeneratorFactory initiateService(Map configurationValues, ServiceRegistryImplementor registry) {
		return new DefaultIdentifierGeneratorFactory();
	}
}
