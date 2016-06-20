/*
 *
 */
package org.jonu.jonumq.client;

import org.jonu.jonumq.JonuMQWireMessage;
import org.jonu.jonumq.channel.ChannelExecutor;
import org.jonu.jonumq.destination.DestinationTypeResolver;
import org.jonu.jonumq.destination.JonuMQDestinationType;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author prabhato
 * @version $Revision$, $Date$, $Author$
 * @since 6/15/2016
 */
public class ProducerClientTypeHandler implements ClientTypeHandler
{
    @Override
    public void doProcess(JonuMQWireMessage wireMessage, DataOutputStream out, ChannelExecutor executor) throws IOException, ClassNotFoundException
    {
        // Third Step done : Checking destination type if Queue or Topic
        JonuMQDestinationType destination = DestinationTypeResolver.resolve(wireMessage);
        destination.produce(wireMessage, out, executor);
    }
}
